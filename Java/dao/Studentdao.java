package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import util.DBUtil;

public class StudentDAO {

    // 学生一覧取得
    public List<Student> findAll() {

        List<Student> list = new ArrayList<>();

        String sql = "SELECT * FROM students ORDER BY student_no";

        try (
                Connection con = DBUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Student s = new Student();

                s.setClassName(rs.getString("class_name"));
                s.setAttendanceNo(rs.getInt("attendance_no"));
                s.setStudentNo(rs.getString("student_no"));
                s.setName(rs.getString("name"));
                s.setKana(rs.getString("kana"));
                s.setGender(rs.getString("gender"));
                s.setStatus(rs.getString("status"));
                s.setDecline(rs.getString("decline"));
                s.setArea(rs.getString("area"));
                s.setHope1(rs.getString("hope1"));
                s.setHope2(rs.getString("hope2"));
                s.setHope3(rs.getString("hope3"));

                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // 学生追加
    public boolean insert(Student s) {

        String sql = """
                INSERT INTO students
                (class_name,attendance_no,student_no,name,kana,
                gender,status,decline,area,hope1,hope2,hope3)
                VALUES(?,?,?,?,?,?,?,?,?,?,?,?)
                """;

        try (
                Connection con = DBUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getClassName());
            ps.setInt(2, s.getAttendanceNo());
            ps.setString(3, s.getStudentNo());
            ps.setString(4, s.getName());
            ps.setString(5, s.getKana());
            ps.setString(6, s.getGender());
            ps.setString(7, s.getStatus());
            ps.setString(8, s.getDecline());
            ps.setString(9, s.getArea());
            ps.setString(10, s.getHope1());
            ps.setString(11, s.getHope2());
            ps.setString(12, s.getHope3());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

}
