<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert Student</title>
</head>
<body>
    <h2>Insert Student</h2>
    <form action="insertStudent" method="post">
        Number: <input type="text" name="number" required><br>
        Name: <input type="text" name="name" required><br>
        Age: <input type="text" name="age" required><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>