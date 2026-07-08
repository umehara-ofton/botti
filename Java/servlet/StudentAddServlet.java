package servlet;

import java.io.IOException;

import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import model.Student;

@WebServlet("/student/add")
public class StudentAddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        Student s = new Student();

        s.setClassName(request.getParameter("className"));
        s.setAttendanceNo(Integer.parseInt(request.getParameter("attendanceNo")));
        s.setStudentNo(request.getParameter("studentNo"));
        s.setName(request.getParameter("name"));
        s.setKana(request.getParameter("kana"));
        s.setGender(request.getParameter("gender"));
        s.setStatus(request.getParameter("status"));
        s.setDecline(request.getParameter("decline"));
        s.setArea(request.getParameter("area"));
        s.setHope1(request.getParameter("hope1"));
        s.setHope2(request.getParameter("hope2"));
        s.setHope3(request.getParameter("hope3"));

        StudentDAO dao = new StudentDAO();

        dao.insert(s);

        response.sendRedirect(request.getContextPath() + "/students");

    }

}