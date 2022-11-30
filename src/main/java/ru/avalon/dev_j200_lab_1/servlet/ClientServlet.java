package ru.avalon.dev_j200_lab_1.servlet;

import ru.avalon.dev_j200_lab_1.dao.InMemoryDao;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "clients", value = "/clients")
public class ClientServlet extends HttpServlet {
    private InMemoryDao db;

    @Override
    public void init() {
        db = InMemoryDao.getInstance();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        request.setAttribute("clientToList", db.read());
        request.getRequestDispatcher("clients.jsp").forward(request, response);
    }
}