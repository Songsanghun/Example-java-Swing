package controller;

import javax.swing.JOptionPane;

import domain.DoctorBean;
import domain.MemberBean;
import domain.NurseBean;
import service.AdminService;
import serviceImpl.AdminServiceImpl;

public class AdminController {
	public void start() {
		//
		MemberBean member = null;
		AdminService service = new AdminServiceImpl();
		while(true){
			switch(JOptionPane.showInputDialog("0.종료 1.회원등록 2.ID검색 3.이름검색 4.목록조회 5.등급조정 6.삭제")){
			case "0":
				return;
			case "1":
					member = new MemberBean();
					String temp = JOptionPane.showInputDialog("1.의사 2.간호사");
					if(temp=="1"){
						DoctorBean doctor = new DoctorBean();
						String[] strArr = JOptionPane.showInputDialog("ID , 이름").split(","); 
						doctor.setUid(strArr[0]);
						doctor.setName((strArr[1]));
						service.regist(doctor);
					}else if(temp=="2"){
						NurseBean nurse = new NurseBean();
						String[] strArr = JOptionPane.showInputDialog("ID , 이름").split(","); 
						nurse.setUid(strArr[0]);
						nurse.setName((strArr[1]));
						service.regist(nurse);
					}
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			
			
			}
		}
	}
}
