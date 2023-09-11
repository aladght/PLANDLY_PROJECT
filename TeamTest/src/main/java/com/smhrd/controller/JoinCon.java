package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.BookDAO;
import com.smhrd.model.BookDTO;


@WebServlet("/JoinCon")
public class JoinCon extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		
		BookDTO dto = new BookDTO(id, pw, nick, email, tel);
		
		BookDAO dao = new BookDAO();
		
		int cnt = dao.insert_member(dto);
		
		if (cnt > 0) {
			System.out.println("회원가입 성공");
			response.sendRedirect("Question4_Login.jsp");
		}else {
			System.out.println("회원가입 실패");
			response.sendRedirect("Question4_Join.jsp");
		}
		
	}

}
