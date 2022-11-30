package ru.avalon.dev_j200_lab_1.servlet;

import ru.avalon.dev_j200_lab_1.dao.InMemoryDao;
import ru.avalon.dev_j200_lab_1.model.Address;
import ru.avalon.dev_j200_lab_1.model.Client;
import ru.avalon.dev_j200_lab_1.utils.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

@WebServlet(name = "createServlet", value = "/create")
public class CreateServlet extends HttpServlet {
    InMemoryDao db;

    @Override
    public void init() {
        db = InMemoryDao.getInstance();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Client client;
        try {
            client = new Client(db.getCounter().incrementAndGet(),
                    req.getParameter("name"),
                    req.getParameter("type"),
                    DateUtil.getFormattedDate(req.getParameter("date")));
        } catch (ParseException e) {
            //TODO logging
            throw new RuntimeException(e);
        }
        Address clientAddress = new Address(req.getParameter("ip"),
                req.getParameter("mac"),
                req.getParameter("model"),
                req.getParameter("address"),
                client);
        client.getAddresses().add(clientAddress);
        db.create(client);
        req.setAttribute("clientToList", db.read());
        req.getRequestDispatcher("clients.jsp").forward(req, resp);
    }
}
