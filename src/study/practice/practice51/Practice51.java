package study.practice.practice50;

import java.util.List;

public class Practice51 {

	public static void main(String[] args) {
		
		StudentDAO studentDAO = new StudentDAO();
		
		
		StudentDTO studentDTO = new StudentDTO();

		studentDTO.setStudno(9988);
		studentDTO.setName("name");
		studentDTO.setId("Id");
		studentDTO.setGrade(5);
		studentDTO.setJumin("0011111234567");
		studentDTO.setBirthday("2000-05-31");
		studentDTO.setTel("031)123-1234");
		studentDTO.setHeight(190);
		studentDTO.setWeight(90);
		studentDTO.setDeptno1(401);
		studentDTO.setDeptno2(501);
		studentDTO.setProfno(9999);
		
		StudentDTO studentDTO2 = new StudentDTO();

		studentDTO2.setStudno(9999);
		studentDTO2.setName("name3");
		studentDTO2.setId("Id3");
		studentDTO2.setGrade(5);
		studentDTO2.setJumin("0011111234567");
		studentDTO2.setBirthday("2000-05-31");
		//studentDTO2.setTel("031)123-1234");
		studentDTO2.setTel(null);
		studentDTO2.setHeight(190);
		studentDTO2.setWeight(90);
		studentDTO2.setDeptno1(401);
		studentDTO2.setDeptno2(null);
		studentDTO2.setProfno(9999);
		
		int result = studentDAO.saveStudent(studentDTO2);
		
		List<StudentDTO> list;
		//List<int> list2;
		List<Integer> list2;
		
		if(result > 0)
			System.out.println("저장 성공~");
	}

}
