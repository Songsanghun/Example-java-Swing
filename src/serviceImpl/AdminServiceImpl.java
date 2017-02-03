package serviceImpl;

import domain.MemberBean;
import domain.PatientBean;
import service.AdminService;
import domain.DoctorBean;
import domain.NurseBean;

public class AdminServiceImpl implements AdminService {
	private DoctorBean[] docList;
	private NurseBean[] nurList;
	private int docCount;
	private int nurCount;
	public AdminServiceImpl() {
		docCount = nurCount = 0;
		docList = new DoctorBean[docCount];
		nurList = new NurseBean[nurCount];
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
		if(member instanceof DoctorBean){ //다형성으로 짠거 중에서 생성자에서 생성 되었는지 구별하는 instanceof 
			DoctorBean doctor = (DoctorBean) member;
			if(docCount==docList.length){
				DoctorBean[] temp = new DoctorBean[docCount+10];
				System.arraycopy(docList, 0, temp, 0, docCount);
				docList = temp;
			}
			docList[docCount] = doctor;
			docCount++;
		}else if(member instanceof NurseBean){
			NurseBean nurse = (NurseBean) member;
			if(nurCount==nurList.length){
				NurseBean[] temp = new NurseBean[nurCount+10];
				System.arraycopy(nurList, 0, temp, 0, nurCount);
				nurList = temp;
			}
			nurList[nurCount] = nurse;
			nurCount++;
		}
	}

	@Override
	public MemberBean findById(MemberBean member) {
		MemberBean temp = new MemberBean();
		if(member instanceof DoctorBean){
			for(int i=0;i<docCount;i++){
				if(member.getUid().equals(docList[i].getUid())){
					temp = docList[i];
					break;
				}
			}
		}else if(member instanceof NurseBean){
			for(int i=0;i<nurCount;i++){
				if(member.getUid().equals(nurList[i].getUid())){
					temp = nurList[i];
					break;
				}
			}
		}
		return temp;
	}

	@Override
	public int countByName(MemberBean member) {
		int countName = 0;
		if(member instanceof DoctorBean){
			for(int i =0;i<docCount;i++){
				if(member.getName().equals(docList[i].getName())){
					countName++;
				}
			}
		}else if(member instanceof NurseBean){
			for(int i =0;i<nurCount;i++){
				if(member.getName().equals(nurList[i].getName())){
					countName++;
				}
			}
		}
		return countName;
	}
	@Override
	public MemberBean[] findByName(MemberBean member) {
		
		MemberBean[] namemem = new MemberBean[countByName(member)];
		int index = 0;
		if(member instanceof DoctorBean){
			for(int i = 0;i<docCount;i++){
				if(member.getName().equals(docList[i].getName())){
						namemem[index] = docList[i];
						index++;
				}
				
			}
		}else if(member instanceof NurseBean){
			for(int i = 0;i<nurCount;i++){
				if(member.getName().equals(nurList[i].getName())){
						namemem[index] = nurList[i];
						index++;
				}
			}
		}
		return namemem;
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
			for(int i=0;i<docCount;i++){
				if(member.getUid().equals(docList[i].getUid())){
					check = true;
				}
			}
		}else if(member instanceof NurseBean){
			for(int i = 0;i<nurCount;i++){
				if(member.getUid().equals(nurList[i].getUid())){
					check = true;
				}
			}
		}
		return check;
	}


	@Override
	public DoctorBean[] dotctorlist() {
		return docList;
	}

	@Override
	public NurseBean[] nurselist() {
		return nurList;
	}

	@Override
	public int docCount() {
		return docCount;
	}

	@Override
	public int nurCount() {
		return nurCount;
	}

}
