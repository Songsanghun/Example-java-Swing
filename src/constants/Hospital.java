package constants;

public class Hospital {
	public final static String HOSPITAL_NAME = "한빛병원";
	public final static String EXE_OPTION=
			"0.EXIT"
			+ "1.REG-DOCTOR\n"
			+ "2.REG-NURSE\n"
			+ "3.REG-PATIENT\n"
			+ "4.CHECK BMI\n";
	public final static String DOC_SPEC=
			 "INPUT AS 의사ID , 담당 진료 과목, 성명 , ssn , 전화번호 ,이메일, 직급";
	public final static String NUR_SPEC=
			 "INPUT AS 간호사ID , 담당 진료 과목, 성명 , ssn , 전화번호 ,이메일, 직급";
	public final static String PAT_SPEC=
			 "INPUT AS 환자ID , 이름";
	public final static String ADMIN_MEMU="0.종료 1.의사등록 11.간호사등록"; 
	
}
