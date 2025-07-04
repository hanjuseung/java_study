package study.practice.practice55;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Practice55 {

	public static void main(String[] args) throws Exception {
		
		String jsonString =  "{"
			    + "\"employees\": ["
			    + "  {"
			    + "    \"id\": 1,"
			    + "    \"name\": \"홍길동\","
			    + "    \"position\": \"개발자\","
			    + "    \"salary\": 50000,"
			    + "    \"skills\": [\"Java\", \"Python\", \"SQL\"]"
			    + "  },"
			    + "  {"
			    + "    \"id\": 2,"
			    + "    \"name\": \"김철수\","
			    + "    \"position\": \"디자이너\","
			    + "    \"salary\": 40000,"
			    + "    \"skills\": [\"Photoshop\", \"Illustrator\"]"
			    + "  }"
			    + "],"
			    + "\"company\": {"
			    + "  \"name\": \"주식회사 ABC\","
			    + "  \"address\": \"서울시 강남구\","
			    + "  \"established\": \"1990-01-01\","
			    + "  \"departments\": ["
			    + "    { \"name\": \"개발부\", \"employees\": [1, 3, 5] },"
			    + "    { \"name\": \"디자인부\", \"employees\": [2, 4] }"
			    + "  ]"
			    + "},"
			    + "\"projects\": ["
			    + "  { \"title\": \"사내 시스템 개발\", \"budget\": 100000, \"team\": [1, 3] },"
			    + "  { \"title\": \"웹 디자인 프로젝트\", \"budget\": 80000, \"team\": [2, 4] }"
			    + "]"
			    + "}";
		
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
		
		JSONArray employees = (JSONArray)jsonObj.get("employees");
		
		System.out.println("----------employees----------");
		for(int i=0; i<employees.size();i++) {
			JSONObject employeesList = (JSONObject)employees.get(i);
			System.out.println("id : " + employeesList.get("id"));
			System.out.println("name : " + employeesList.get("name"));
			System.out.println("position : " + employeesList.get("position"));
			System.out.println("salary : " + employeesList.get("salary"));
			
			JSONArray skills = (JSONArray)employeesList.get("skills");
			for(int j=0; j<skills.size();j++) {
				System.out.println("skills : " + skills.get(j));
			}
		}
		
		JSONObject company = (JSONObject)jsonObj.get("company");
		System.out.println("----------company----------");
		System.out.println("name : " + company.get("name"));
		System.out.println("address : " + company.get("address"));
		System.out.println("established : " + company.get("established"));
		
		JSONArray departments = (JSONArray)company.get("departments");
		
		for(int i=0; i<departments.size();i++) {
			JSONObject departmentsList = (JSONObject)departments.get(i);
			System.out.println("name : " + departmentsList.get("name"));
			
			JSONArray employees1 = (JSONArray)departmentsList.get("employees");
			for(int j=0; j<employees1.size();j++) {
				System.out.println("employees : " + employees1.get(j));
			}
		}
		
		JSONArray projects = (JSONArray)jsonObj.get("projects");
		
		System.out.println("----------projects----------");
		for(int i=0; i<projects.size();i++) {
			JSONObject projectsList = (JSONObject)projects.get(i);
			System.out.println("title : " + projectsList.get("title"));
			System.out.println("budget : " + projectsList.get("budget"));
			
			JSONArray team = (JSONArray)projectsList.get("team");
			for(int j=0; j<team.size();j++) {
				System.out.println("skills : " + team.get(j));
			}
		}

}

}
