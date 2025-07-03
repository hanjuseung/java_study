package study.practice.practice54;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import study.api.MidFcstInfoService;
import study.api.MidTaDTO;

public class Practice54 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String jsonString = "{\n" +
                "  \"도서관\": {\n" +
                "    \"위치\": \"서울특별시 강남구\",\n" +
                "    \"운영시간\": {\n" +
                "      \"평일\": [\"09:00\", \"21:00\"],\n" +
                "      \"주말\": [\"10:00\", \"18:00\"]\n" +
                "    },\n" +
                "    \"책목록\": [\n" +
                "      {\n" +
                "        \"제목\": \"자바 프로그래밍\",\n" +
                "        \"저자\": \"홍길동\",\n" +
                "        \"출판연도\": 2023,\n" +
                "        \"가격\": 25000,\n" +
                "        \"대출가능\": true,\n" +
                "        \"카테고리\": [\"프로그래밍\", \"자기계발\"]\n" +
                "      },\n" +
                "      {\n" +
                "        \"제목\": \"데이터 분석 입문\",\n" +
                "        \"저자\": \"김철수\",\n" +
                "        \"출판연도\": 2022,\n" +
                "        \"가격\": 28000,\n" +
                "        \"대출가능\": false,\n" +
                "        \"카테고리\": [\"데이터\", \"분석\"]\n" +
                "      }\n" +
                "    ],\n" +
                "    \"특별서비스\": {\n" +
                "      \"키오스크\": true,\n" +
                "      \"스터디룸\": {\n" +
                "        \"개수\": 5,\n" +
                "        \"예약 가능\": true,\n" +
                "        \"비용\": {\n" +
                "          \"1시간당\": 5000,\n" +
                "          \"하루\": 30000\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";

		//파싱은 한번은 무조건 해줘야함
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
		

		//--------------------------------------------------------------
		JSONObject library = (JSONObject)jsonObj.get("도서관");
		
		//--------------------------------------------------------------
		System.out.println("위치 : " + library.get("위치"));
		
		//--------------------------------------------------------------
		JSONObject OperatingHours = (JSONObject)library.get("운영시간");
		
		JSONArray weekdays = (JSONArray)OperatingHours.get("평일");

		System.out.println("평일 : " + weekdays.get(0)+", "+weekdays.get(1));
		
		JSONArray weekend = (JSONArray)OperatingHours.get("주말");

		System.out.println("주말 : " + weekend.get(0)+", "+weekend.get(1));

		//--------------------------------------------------------------
		JSONArray bookList = (JSONArray)library.get("책목록");
		
		
		JSONObject bookList1 = (JSONObject)bookList.get(0);
		
		System.out.println("제목 : " + bookList1.get("제목"));
		System.out.println("저자 : " + bookList1.get("저자"));
		System.out.println("출판연도 : " + bookList1.get("출판연도"));
		System.out.println("가격 : " + bookList1.get("가격"));
		System.out.println("대출가능 : " + bookList1.get("대출가능"));
		JSONArray ctgr = (JSONArray)bookList1.get("카테고리");
		System.out.println("카테고리 : " + ctgr.get(0)+", "+ctgr.get(1));
		
		JSONObject bookList2 = (JSONObject)bookList.get(1);

		System.out.println("제목 : " + bookList2.get("제목"));
		System.out.println("저자 : " + bookList2.get("저자"));
		System.out.println("출판연도 : " + bookList2.get("출판연도"));
		System.out.println("가격 : " + bookList2.get("가격"));
		System.out.println("대출가능 : " + bookList2.get("대출가능"));
		JSONArray ctgr2 = (JSONArray)bookList2.get("카테고리");
		System.out.println("카테고리 : " + ctgr2.get(0)+", "+ctgr2.get(1));
		
		/* for문 버전
		for(int i=0; i<bookList.size(); i++) {
			JSONObject book = (JSONObject)bookList.get(i);
			System.out.println("제목 : " + book.get("제목"));
			System.out.println("저자 : " + book.get("저자"));
			System.out.println("출판연도 : " + book.get("출판연도"));
			System.out.println("가격 : " + book.get("가격"));
			System.out.println("대출가능 : " + book.get("대출가능"));
			
			JSONArray category = (JSONArray)book.get("카테고리");
			for(int j=0; j<category.size(); j++) {
				System.out.println("카테고리 : " + ctgr2.get(j));
			}
		}
		*/
		
		
		//--------------------------------------------------------------
		JSONObject service = (JSONObject)library.get("특별서비스");
		
		System.out.println("키오스크 : " + service.get("키오스크"));
		
		JSONObject studyRoom = (JSONObject)service.get("스터디룸");
		
		System.out.println("개수 : " + studyRoom.get("개수"));
		System.out.println("예약가능 : " + studyRoom.get("예약가능"));
		
		JSONObject price = (JSONObject)studyRoom.get("비용");
		
		System.out.println("1시간당 : " + price.get("1시간당"));
		System.out.println("하루 : " + price.get("하루"));
	}

}
