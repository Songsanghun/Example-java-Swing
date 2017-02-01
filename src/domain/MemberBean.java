package domain;

public class MemberBean {
	protected String uid ,name,ssn,email,addr,phone;
	public void setUid(String uid){
		this.uid = uid ;
	}
	public String getUid(){
		return uid;
	}
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return name;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setPhone(String phone){
		this.phone = phone ;
	}
	public String getPhone(){
		return phone;
	}
	public String getGender(String ssn){
		String result = "";
		char ch = ssn.charAt(7);
	if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
		result = "다시 입력하세요.";
		}
	if (ch == '1' || ch == '3') {
		result="남자";
	} else if (ch == '2' || ch == '4') {
		result="여자";
	} else if(ch == '5' || ch == '6'){
		result="외국인";
	} else {
		result="올바른숫자가 아닙니다.";
	}
	return result;
	}
	
	
}
