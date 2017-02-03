package view;
import javax.swing.JOptionPane;

import controller.AdminController;
import controller.PatientController;

public class Index {
	public static void main(String[] args) {
		while(true){
			switch(JOptionPane.showInputDialog(null,"0.EXIT 1.일반회원 2.관리자")){
			case "0": return;
			case "1": new PatientController().start(); break; 
			case "2": new AdminController().start(); break;
			}
		}
	}
}
