package com.example.webdemo1011;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.webdemo1011.beans.Calculator;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = {"/hello-servlet","/hello"})
public class MainServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + LocalDateTime.now() + "</h2>");
        out.println("<h3>Hello from Servlet: " + request.getParameter("username") + "</h3>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        Calculator calculator = new Calculator(a, b);
        request.setAttribute("calc", calculator);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

    public void destroy() {
    }
}