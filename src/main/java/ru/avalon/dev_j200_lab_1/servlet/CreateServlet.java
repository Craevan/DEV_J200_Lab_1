package ru.avalon.dev_j200_lab_1.servlet;

import ru.avalon.dev_j200_lab_1.dao.InMemoryDao;
import ru.avalon.dev_j200_lab_1.model.Client;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@WebServlet(name = "createServlet", value = "/create")
public class CreateServlet extends HttpServlet {
    InMemoryDao db;

    @Override
    public void init() {
        db = InMemoryDao.getInstance();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        resp.setContentType("text/html");
//        Date date = new Date(Long.parseLong(req.getParameter("date")));
        db.create(new Client(db.getCounter().incrementAndGet(), req.getParameter("name"), req.getParameter("type"), new Date()));
    }
}
