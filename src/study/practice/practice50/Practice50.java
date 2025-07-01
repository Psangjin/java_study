package study.practice.practice50;

import java.util.List;

public class Practice50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDAO studentDAO = new StudentDAO();
		
		List<StudentDTO> list = studentDAO.findStudentList();
		
		for(StudentDTO s : list) {
			System.out.println(s);
		}
		
		System.out.println("*****************************************");
		
		List<StudentDTO> list2 = studentDAO.findStudentListByGrade(3);
		for(StudentDTO s : list2) {
			System.out.println(s);
		}
		
		
		
	}

}
