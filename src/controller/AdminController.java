package controller;

import javax.swing.JOptionPane;

import constants.Hospital;
import domain.DoctorBean;
import domain.MemberBean;
import domain.NurseBean;
import enums.Butt;
import service.AdminService;
import serviceImpl.AdminServiceImpl;

public class AdminController {
	public void start() {
		MemberBean[] arr = null;
		MemberBean member = null;
		AdminService service = new AdminServiceImpl();
		String temp = "";
		Butt[] buttens = { Butt.CLOSE, Butt.DOC_ADD, Butt.NUR_ADD, Butt.FIND_DOC_ID, Butt.FIND_NUR_ID,
				Butt.FIND_DOC_NAME, Butt.FIND_NUR_NAME, Butt.DOC_LIST, Butt.NUR_LIST, Butt.DOC_DELETE,
				Butt.NUR_DELETE };
		Butt select = null;
		
		while (true) {
			select = (Butt) JOptionPane.showInputDialog(null, // frame
					"ADMIN PAGE", // frame title
					"SELECT MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttens, // Array of choices
					buttens[1] // default
			);
			switch (select) { // 여기서 Hospital.ADMIN_MEMU 은 신텍스는 클레스 배러블이다.
			case CLOSE:
				return;
			case DOC_ADD:
				member = new DoctorBean();
				String[] docArr = JOptionPane.showInputDialog("ID , 이름").split(",");
				member.setUid(docArr[0]);
				member.setName((docArr[1]));
				service.regist(member); //다형성 service.regist(member);
				JOptionPane.showMessageDialog(null, service.docCount()+"명이 등록되었습니다.");
				break;
			case NUR_ADD:
				member = new NurseBean();
				String[] nurArr = JOptionPane.showInputDialog("ID , 이름").split(",");
				member.setUid(nurArr[0]);
				member.setName((nurArr[1]));
				service.regist(member);
				JOptionPane.showMessageDialog(null, service.nurCount()+"명이 등록되었습니다.");
				break;
			case FIND_DOC_ID:
				member = new DoctorBean();
				temp = "";
				temp = JOptionPane.showInputDialog("id를 입력하세요");
				member.setUid(temp);
				if(service.exist(member)){
					JOptionPane.showMessageDialog(null, service.findById(member));
				}else{
					JOptionPane.showMessageDialog(null, "존재하는 id가 아닙니다.");
				}
				break;
			case FIND_NUR_ID:
				member = new NurseBean();
				temp = "";
				temp = JOptionPane.showInputDialog("id를 입력하세요.");
				member.setUid(temp);
				if(service.exist(member)){
					JOptionPane.showMessageDialog(null, service.findById(member));
				}else{
					JOptionPane.showMessageDialog(null, "존재하는 id가 아닙니다.");
				}
				break;	
			case FIND_DOC_NAME:
				member = new DoctorBean();
				member.setName(JOptionPane.showInputDialog("이름 입력"));
				arr = service.findByName(member);
				temp = "";
				for(int i=0;i<arr.length;i++){
					temp += arr.toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, temp);
				break;	
			case FIND_NUR_NAME:
				break;	
			case DOC_LIST:
				break;	
			case NUR_LIST:
				break;	
			case DOC_DELETE:
				break;	
			case NUR_DELETE:
				break;	
			}
		}
	}
}
