package com.kh.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * servlet만들고> Student필드 생성> Server확인(콘솔출력으로 일단 확인)
 * > 웹페이지상으로 확인하기! > 리스트에 있는 값을 꺼내서 출력
 */
/*
 * 학생 리스트 조회
 * url : /student/list
 */
@WebServlet("/student/list")
public class StudentListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> sList= new ArrayList<Student>();
		sList.add(new Student("일용자", 99, 88));
		sList.add(new Student("이용자", 88, 77));
		sList.add(new Student("삼용자", 77, 66));
		sList.add(new Student("사용자", 66, 55));
		
		response.setContentType("text/html;charset=utf-8"); // 한글이 깨지지 않게 해줌
		PrintWriter out = response.getWriter();
		
		// for문을 이용해서 전체 데이터를 출력하는 형태로 만들어 줌
		out.println("<h1>학생 리스트 조회</h1>");
		for(int i=0; i<sList.size(); i++) {
			String name = sList.get(i).getName();		// 변수에 값을 잠시 저장해줌
			int fScore = sList.get(i).getFirstScore();	// 원래 바로 값을 넣어줘도 되지만
			int sScore = sList.get(i).getSecondScore(); // 우리는 배우는 입장이니까 진행상황 파악을 위해~
			out.println("<ul><li>학생 이름 : "+name+"</li>");
			out.println("<li>1차 점수 : "+fScore+"점</li>");
			out.println("<li>2차 점수 : "+sScore+"점</li></ul>");
			
		}
		
//		for(Student std : sList) {
//			System.out.println(std.toString());
//		} // 콘솔창 내에 출력(개발자 확인용)
		
	}
}
