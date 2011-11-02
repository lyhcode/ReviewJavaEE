package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FooServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Http Method = GET");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Http Method = POST");
	}

	@Override
	protected void doTrace(HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Http Method = TRACE");
	}
}
