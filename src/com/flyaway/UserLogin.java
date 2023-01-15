package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.URegistration.dao.Logindao;

/**
 * Servlet implementation class ULogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {

	private static final long serialVersionUID = -1952088366185930301L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("email");
		String email = request.getParameter("password");

		PrintWriter out = response.getWriter();
		Logindao logindao = new Logindao();

		if (logindao.check(name, email)) {
			response.sendRedirect("SearchFlight.jsp");
		} else {
			out.println("User Not Logged In");
		}
	}
}
