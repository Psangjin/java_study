package study.practice.practice55;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Practice55 {

	public static void main(String[] args) throws Exception {


		String jsonText = "{\r\n"
				+ "\"employees\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"홍길동\",\r\n"
				+ "\"position\": \"개발자\",\r\n"
				+ "\"salary\": 50000,\r\n"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 2,\r\n"
				+ "\"name\": \"김철수\",\r\n"
				+ "\"position\": \"디자이너\",\r\n"
				+ "\"salary\": 40000,\r\n"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]\r\n"
				+ "}\r\n"
				+ "],\r\n"
				+ "\"company\": {\r\n"
				+ "\"name\": \"주식회사 ABC\",\r\n"
				+ "\"address\": \"서울시 강남구\",\r\n"
				+ "\"established\": \"1990-01-01\",\r\n"
				+ "\"departments\": [\r\n"
				+ "{\r\n"
				+ "\"name\": \"개발부\",\r\n"
				+ "\"employees\": [1, 3, 5]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"name\": \"디자인부\",\r\n"
				+ "\"employees\": [2, 4]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "},\r\n"
				+ "\"projects\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"사내 시스템 개발\",\r\n"
				+ "\"budget\": 100000,\r\n"
				+ "\"team\": [1, 3]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"웹 디자인 프로젝트\",\r\n"
				+ "\"budget\": 80000,\r\n"
				+ "\"team\": [2, 4]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";
		
		JSONParser jsonParser = new JSONParser();
		JSONObject obj = (JSONObject)jsonParser.parse(jsonText);
		
		JSONArray employees = (JSONArray)obj.get("employees");
		
		for(int i=0; i<employees.size(); i++) {
			JSONObject emp = (JSONObject)employees.get(i);
			System.out.println(emp.get("id"));
			System.out.println(emp.get("name"));
			System.out.println(emp.get("position"));
			System.out.println(emp.get("salary"));
			JSONArray skills = (JSONArray)emp.get("skills");
			for(int j=0; j<skills.size(); j++) {
				System.out.print(skills.get(j) + " ");
			}
			System.out.println();
		}
		
		JSONObject company = (JSONObject)obj.get("company");
		
		System.out.println(company.get("name"));
		System.out.println(company.get("address"));
		System.out.println(company.get("established"));
		
		JSONArray departments = (JSONArray)company.get("departments");
		
		for(int i=0; i<departments.size(); i++) {
			JSONObject department = (JSONObject)departments.get(i);
			System.out.println(department.get("name"));
			JSONArray emps = (JSONArray)department.get("employees");
			for(int j=0; j<emps.size(); j++) {
				System.out.print(emps.get(j) + " ");
			}
			System.out.println();
		}
		
		JSONArray projects = (JSONArray)obj.get("projects");
		
		for(int i=0; i<projects.size(); i++) {
			JSONObject project = (JSONObject)projects.get(i);
			System.out.println(project.get("title"));
			System.out.println(project.get("budget"));
			JSONArray team = (JSONArray)project.get("team");
			for(int j=0; j<team.size(); j++) {
				System.out.print(team.get(j) + " ");
			}
			System.out.println();
		}
		
	}

}
















