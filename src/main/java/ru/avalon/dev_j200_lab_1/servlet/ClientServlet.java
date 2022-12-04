package ru.avalon.dev_j200_lab_1.servlet;

import ru.avalon.dev_j200_lab_1.dao.InMemoryDao;
import ru.avalon.dev_j200_lab_1.model.Client;

import java.io.*;
import java.util.Objects;
import javax.servlet.*;
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
        String action = request.getParameter("action");
        Client client;
        if ("delete".equals(action)) {
            int id = getId(request);
            db.delete(id);
            response.sendRedirect("clients");
        } else {
            request.setAttribute("clientToList", db.read());
            request.getRequestDispatcher("clients.jsp").forward(request, response);
        }
    }

    private int getId(HttpServletRequest request) {
        String paramId = Objects.requireNonNull(request.getParameter("id"));
        return Integer.parseInt(paramId);
    }
}