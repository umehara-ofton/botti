package servlet;

import java.io.IOException;
import java.util.List;

import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import model.Student;

@WebServlet("/students")
public class StudentListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        StudentDAO dao = new StudentDAO();

        List<Student> list = dao.findAll();

        request.setAttribute("students", list);

        request.getRequestDispatcher("/student-list.jsp")
                .forward(request, response);

    }

}