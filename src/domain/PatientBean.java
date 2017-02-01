package domain;

public class PatientBean extends MemberBean{
	private String patJob, height, weight, bloodType, docId, nurId;
 	
	public void setHeight(String height){
		this.height = height;
	}
	public String getHeight() {
		return height;
	}
	public void setWeight(String weight){
		this.weight = weight;
	}
	public String getWeight(){
		return weight;
	}
	public void setPatJob(String patJob){
		this.patJob = patJob;
	}
	public String getPatJob(){
		return patJob;
	}
	public void bloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getBloodType(){
		return bloodType;
	}
	public void setDocId(String docId){
		this.docId = docId ;
	}
	public String getDocId(){
		return docId;
	}
	public void setNurId(String nurId){
		this.nurId = nurId ;
	}
	public String getNurId(){
		return nurId;
	}
	@Override
	public String toString() {
		return String.format(
				 "환자성명 : %s\n"
				 + "님 진료가 접수되었습니다. ",
				name
				);
	}
	
	
}
