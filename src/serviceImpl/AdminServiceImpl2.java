package serviceImpl;

import domain.MemberBean;
import domain.PatientBean;
import service.AdminService;
import domain.DoctorBean;
import domain.NurseBean;

public class AdminServiceImpl2 implements AdminService {
	private DoctorBean[] doctorList;
	private NurseBean[] nurseList;
	private int[] countArr; // 0: docList, 1:nurList

	public AdminServiceImpl2() {
		countArr[0] = countArr[1] = 0;
		doctorList = new DoctorBean[countArr[0]];
		nurseList = new NurseBean[countArr[1]];
	}

	@Override
	public String getBmi(PatientBean pat) {
		double bmi = 0;
		double weight = Double.parseDouble(pat.getWeight());
		double height = Double.parseDouble(pat.getHeight());
		String grade = "";
		bmi = weight / (height / 100 * height / 100);
		if (bmi > 30.0) {
			grade = "고도비만";
		} else if (bmi > 25.0) {
			grade = "비만";
		} else if (bmi > 23.0) {
			grade = "과체중";
		} else if (bmi > 18.5) {
			grade = "정상";
		} else {
			grade = "저체중";
		}
		return grade;
	}

	@Override
	public void regist(MemberBean member) {

		if (member instanceof DoctorBean) {
			DoctorBean doctor = (DoctorBean) member;
			if (countArr[0] == doctorList.length) {
				DoctorBean[] temp = new DoctorBean[countArr[0] + 10];
				System.arraycopy(doctorList, 0, temp, 0, countArr[0]);
				doctorList = temp;
			}
			doctorList[countArr[0]++] = doctor;
		} else if (member instanceof NurseBean) {
			NurseBean nurses = (NurseBean) member;
			if (countArr[1] == nurseList.length) {
				NurseBean[] temp = new NurseBean[countArr[1] + 10];
				System.arraycopy(nurseList, 0, temp, 0, countArr[1]);
				nurseList = temp;
			}
			nurseList[countArr[1]++] = nurses;
		}
	}

	@Override
	public MemberBean findById(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean[] findByName(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void change(MemberBean member) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(MemberBean member) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exist(MemberBean member) {
		boolean check = false;
		if(member instanceof DoctorBean){
			DoctorBean doctor = (DoctorBean) member; //캐스팅 받은 맴버를 doctor 로 변환
			for(int i=0;i<countArr[0];i++){
				if(doctor.equals(doctorList[i].getUid())){
					check=true;
					break;
				}
			}
		}else if(member instanceof NurseBean){
			NurseBean nurse = (NurseBean) member;
			for(int i=0;i<countArr[1];i++){
				if(nurse.equals(nurseList[i].getUid())){
					check=true;
					break;
				}
			}
		}
		return check;
	}

	@Override
	public int countByName(MemberBean member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DoctorBean[] dotctorlist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NurseBean[] nurselist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int docCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int nurCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
