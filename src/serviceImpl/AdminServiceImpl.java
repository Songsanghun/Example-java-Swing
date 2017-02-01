package serviceImpl;

import domain.MemberBean;
import domain.PatientBean;
import service.AdminService;
import domain.DoctorBean;
import domain.NurseBean;

public class AdminServiceImpl implements AdminService {
	private MemberBean member;
	private MemberBean[] arr;
	private DoctorBean[] doctors;
	private NurseBean[] nurses;
	private int count;

	public AdminServiceImpl() {
		member = new MemberBean();
		count = 0;
		arr = new MemberBean[count];
		doctors = new DoctorBean[count];
		nurses = new NurseBean[count];
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
			DoctorBean doctors = (DoctorBean) member; // member 에 type을 Doctors의
														// 타입으로 변환.
			if (count == arr.length) {
				DoctorBean[] temp = new DoctorBean[count + 10];
				System.arraycopy(arr, 0, temp, 0, count);
				arr = temp;
			}
			arr[count++] = member;
		} else if (member instanceof NurseBean) { // 닥터랑 널스랑 구분할 무언가가 필요해 보임.
			NurseBean nurses = (NurseBean) member;
			if (count == arr.length) {
				MemberBean[] temp = new MemberBean[count + 10];
				System.arraycopy(arr, 0, temp, 0, count);
				arr = temp;
			}
			arr[count++] = member;
		}
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return false;
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

}
