package domain;

public class NurseBean extends MemberBean{
	protected String nurPosition, majorJob, profileImg;

	public void setNurPosition(String nurPosition){
		this.nurPosition = nurPosition;
	}
	public String getNurPosition() {
		return nurPosition;
	}
	public void setMajorJob(String majorJob){
		this.majorJob = majorJob;
	}
	public String getMajorJob() {
		return majorJob;
	}
	public void setProfileImg(String profileImg){
		this.profileImg = profileImg;
	}
	public String getProfileImg(){
		return profileImg;
	}
	
	
	
	@Override
	public String toString() {
		return String.format(
				"간호사 ID : %s\n"
				+ "담당 진료 과목 : %n"
				+ "성명 : %s\n"
				+ "성별 : %s\n"
				+ "전화번호 : %s\n"
				+ "이메일 : %s\n"
				+ "직급 : %s\n",
				uid,
				majorJob,
				name,
				getGender(ssn),
				phone,
				email,
				nurPosition);
	}
	
	
}
