package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Search;

/**
 * Servlet implementation class SearchFlight
 */
@WebServlet("/SearchFlight")
public class SearchFlight extends HttpServlet {

	private static final long serialVersionUID = -823766484685111049L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Search.date = request.getParameter("date");
		Search.source = request.getParameter("source");
		Search.destination = request.getParameter("destination");
		Search.persons = Integer.parseInt(request.getParameter("persons"));

		if (Search.date.equals("")) {
			out.println("Please enter a valid date");
		} else {
			Search.day = getDay(Search.date);
			response.sendRedirect("SearchResult.jsp");
		}
	}

	public String getDay(String dateInp) {
		LocalDate dt = LocalDate.parse(dateInp);
		return dt.getDayOfWeek().toString();
	}

}
