package domain;

public class AdminBean extends MemberBean{
	private String permission; //yes 
	public void setPermossin(String permission){
		this.permission = permission;
	}
	public String getPermission(){
		return permission;
	}
}
