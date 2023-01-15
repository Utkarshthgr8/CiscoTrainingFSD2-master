package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.URegistration.dao.UserRegistrationdao;

/**
 * Servlet implementation class UserRegistration
 */
@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");

		UserRegistrationdao uregdao = new UserRegistrationdao();

		if (name.equals("") || email.equals("") || pass.equals("")) {
			out.println("Please Enter The Data Correctly");
		} else {
			if (uregdao.check(name, email, pass)) {
				out.println("User Registered Successfully");
				// if regsitered successfully then redirect to User Login.jsp
				response.sendRedirect("ULogin.jsp");

			} else {
				out.println("User Not Registered");
				// response.sendRedirect("ULogin.jsp");
			}
		}

	}

}
