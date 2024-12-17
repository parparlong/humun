package cang;

import java.util.Calendar;

public class Month {

	//달력만들기 
	//예시 
	//1월:
	//일 월 화 수 목 금 토 
	//1  2  3  4  5  6  7	
	//8  9 10 11 12	13 14
	//끝나는 날자는 검색해서 확인
	
	//연도와 월 설정
	int year = 2024;
	int month = 1; //1월
	
	//달력 데이터 자장용 배열
	String[] weekDays = {"일","월","화","수","목","금","토"};
	int[][] calendar = new int[6][7];
	
	//calendar 객체 생성
	Calendar cal =  Calendar.getInstance();
	cal.set( year , month-1, 1);
	
	
	// 해당 월의 첫 번째 날과 마지막 날 가져오기
	int firstday = cal.get(Calendar.DAY_OF_WEEK) - 1;
	int daysInMon = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	
	
	
	int day = 1;
	for (int i = 0; i < calendar.lenght; i++) {
		for(int j = 0; j< calendar[i].length; j++){
			if((i == 0 && j < firstday) || day > daysInMon) {
				calendar[i][j] = 0;
			}else {
				calendar[i][j] = day ++;
			}
		}
	}
	
	
	
	
	
	
	
	
}
