<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.inscription.dao.StudentDAO, com.inscription.model.Student, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Students</title>
</head>
<body>
    <h2>Student List</h2>
    <table border="1">
        <tr>
            <th>Number</th>
            <th>Name</th>
            <th>Age</th>
        </tr>
        <%
            StudentDAO dao = new StudentDAO();
            List<Student> students = dao.getAllStudents();
            for (Student student : students) {
        %>
        <tr>
            <td><%= student.getNumber() %></td>
            <td><%= student.getName() %></td>
            <td><%= student.getAge() %></td>
        </tr>
        <% } %>
    </table>
    <br>
    <a href="insertStudent.jsp">Add New Student</a>
</body>
</html>