package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.URegistration.dao.AdminLogindao;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {

	private static final long serialVersionUID = 7461109350707462418L;
	public static boolean isLoggedIn = false;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

		PrintWriter out = response.getWriter();

		AdminLogindao logindao = new AdminLogindao();

		if (logindao.check(email, pass)) {

			isLoggedIn = true;
			out.println("You have LoggedIn");
			response.sendRedirect("AdminDashboard.jsp");

		} else {
			isLoggedIn = false;
			out.println("Login Failed : Incorrect email or Password");

		}

	}

}
