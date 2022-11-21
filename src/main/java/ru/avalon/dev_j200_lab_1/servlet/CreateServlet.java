package ru.avalon.dev_j200_lab_1.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "createServlet", value = "/create")
public class CreateServlet extends HttpServlet {

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        try (PrintWriter pw = response.getWriter()) {
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<title>");
            pw.println("Create");
            pw.println("</title>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<form>");
            pw.println("clientName :");
            pw.println("<input type=\"text\" name=\"clientName\">");
            pw.println("</form>");
            pw.println("</body>");
            pw.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        processRequest(req, resp);
    }
}
