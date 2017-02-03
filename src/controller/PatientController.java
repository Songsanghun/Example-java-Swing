package controller;

import domain.*;
import service.AdminService;
import serviceImpl.AdminServiceImpl;
import constants.Hospital;

import javax.swing.JOptionPane;

public class PatientController {
	AdminService service = new AdminServiceImpl();
	DoctorBean doc = null;
	NurseBean nur = null;
	PatientBean pat = null;
	
	public void start() {
		while(true){
			switch(JOptionPane.showInputDialog(Hospital.EXE_OPTION)){
			case "0": 
				return;
			case "1":
				doc = new DoctorBean();
				String docInfo = JOptionPane.showInputDialog(Hospital.DOC_SPEC);
				String[] docInfoArr = docInfo.split(",");
				doc.setUid(docInfoArr[0]);
				//doc.setMajorTreat(docInfoArr[1]);
				//doc.setName(docInfoArr[2]);
				//doc.setSsn(docInfoArr[3]);
				//doc.setPhone(docInfoArr[4]);
				//doc.setEmail(docInfoArr[5]);
				//doc.setDocPosition(docInfoArr[6]);
				JOptionPane.showMessageDialog(null, doc.getUid());
				break;			
			case "2":
				nur = new NurseBean();
				String nurInfo = JOptionPane.showInputDialog(Hospital.NUR_SPEC);
				String[] nurInfoArr = nurInfo.split(",");
				nur.setUid(nurInfoArr[0]);
				//nur.setMajorJob(nurInfoArr[1]);
				//nur.setName(nurInfoArr[2]);
				//nur.setSsn(nurInfoArr[3]);
				//nur.setPhone(nurInfoArr[4]);
				//nur.setEmail(nurInfoArr[5]);
				//nur.setNurPosition(nurInfoArr[6]);
				JOptionPane.showMessageDialog(null, nur.getUid());
				break;
			case "3":
				pat = new PatientBean();
				String patInfo = JOptionPane.showInputDialog(Hospital.PAT_SPEC);
				String[] patInfoArr = patInfo.split(",");
				pat.setUid(patInfoArr[0]);
				pat.setName(patInfoArr[1]);
				
				JOptionPane.showMessageDialog(null, pat.toString());
				// 아이디,이름
				// 홍길동님 진료 접수 되었습니다.
				break;
			case "4": 
				// 키와 몸무게를 입력하세요.
				pat.setHeight(JOptionPane.showInputDialog("키를 입력해주세요."));
				pat.setWeight(JOptionPane.showInputDialog("몸무게를 입력해주세요."));
				JOptionPane.showMessageDialog(null,pat.getName()+": "+service.getBmi(pat));
				//홍길동 : 정상
				break;
			}
		}
		}
}
