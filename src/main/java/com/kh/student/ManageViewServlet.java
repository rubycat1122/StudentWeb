package com.kh.student;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
 * view안에 들어가 있으면 접근할 수가 없어서 
 * 페이지를 보여줄 manage 클래스를 따로 만드는 것
 * 관리 페이지를 보여줄 url
 * url : /student/manage
 */
@WebServlet("/student/manage")
public class ManageViewServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view;
		view = request.getRequestDispatcher("/WEB-INF/views/student/manage.jsp");
		view.forward(request, response);
	}
}
