package com.kh.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 학생 정보 등록   /url을 먼저 마음속에 정해놓고 코딩해야한다
 * url : /student/register
 * ?name=삼용자&firstScore=88&secondScore=77
 */
@WebServlet("/student/register")
public class StudentRegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> sList = new ArrayList<Student>(); // StudentListServlet클래스에 있는 배열이랑 호환되지 않는다. 그냥 새로 만든것
		String name = request.getParameter("name");
		int firstScore, secondScore;
		firstScore = Integer.parseInt(request.getParameter("firstScore")); //Type mismatch: cannot convert from String to int 문자열오류
		secondScore = Integer.parseInt(request.getParameter("secondScore")); 
		// 원인 : 문자열을 int로 변환할 수 없음
		// 해결방안 : 문자열을 int로 변환해주면 됨. 어떻게?
		// Integer.parseInt("")
		sList.add(new Student("일용자", 99, 88));
		sList.add(new Student("이용자", 88, 77));
		RequestDispatcher view;
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		for(Student std: sList) {
			if(std.getName().equals(name)) {
				out.println("<h1>이미 존재하는 이름입니다.</h1>");
//				view = request.getRequestDispatcher("WEB-INF/views/common/duplicate.html");
//				view.forward(request, response);
				return; // 메소드를 종료하여 하단 코드가 동작하지 않도록 함
			}
		}
		sList.add(new Student(name, firstScore, secondScore));
		out.println("<h1>학생 정보 추가 성공되었습니다.</h1>");
//		view = request.getRequestDispatcher("WEB-INF/views/common/success.html");
//		view.forward(request, response);
		
		
//		sList.add(new Student("일용자", 99, 88));
//		sList.add(new Student("이용자", 88, 77));
//		for(Student std: sList) {
//			System.out.println(std);  // 기존 입력한 값 콘솔확인
//			if(std.getName().equals(name)) {
//				System.out.println("이미 존재하는 이름입니다.");	
//				return; // 메소드를 종료하여 하단 코드가 동작하지 않도록 함
//			}
//		}
//		System.out.println("============================================================");
//		sList.add(new Student(name, firstScore, secondScore));
//		System.out.println("가입이 완료되었습니다.");
//		for(Student std: sList) 
//			System.out.println(std);  // 서버웹 url에 입력했던 값까지 반영 콘솔출력
	}
}
