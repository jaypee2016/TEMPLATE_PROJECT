package com.greenland.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	public void doPost (final HttpServletRequest request,
		final HttpServletResponse response) throws IOException, ServletException {

				processTheRequest(request, response);
			}

	public void doGet (final HttpServletRequest request,
		final HttpServletResponse response) throws IOException, ServletException {

				processTheRequest(request, response);
			}

	public void processTheRequest (final HttpServletRequest request,
		final HttpServletResponse response) throws IOException, ServletException {

		final RequestDispatcher view = request.getRequestDispatcher("home.jsp");
		view.forward(request, response);
	}

}