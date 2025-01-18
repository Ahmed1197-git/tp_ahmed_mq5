package com.inscription.servlet;

import com.inscription.dao.StudentDAO;
import com.inscription.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/insertStudent")
public class InsertStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int number = Integer.parseInt(request.getParameter("number"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        Student student = new Student();
        student.setNumber(number);
        student.setName(name);
        student.setAge(age);

        StudentDAO dao = new StudentDAO();
        try {
            dao.insertStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("viewStudents.jsp");
    }
}