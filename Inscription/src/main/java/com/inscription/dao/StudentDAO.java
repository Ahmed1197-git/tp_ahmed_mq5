package com.inscription.dao;

import com.inscription.model.Student;
import com.inscription.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    // Insert a new student
    public void insertStudent(Student student) throws SQLException {
        String sql = "INSERT INTO student (number, name, age) VALUES (?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, student.getNumber());
            stmt.setString(2, student.getName());
            stmt.setInt(3, student.getAge());
            stmt.executeUpdate();
        }
    }

    // Retrieve all students
    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Student student = new Student();
                student.setNumber(rs.getInt("number"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                students.add(student);
            }
        }
        return students;
    }
}
