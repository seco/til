package my.examples.guestbook.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/guestbook/logout")
public class GuestbookLogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //세션에서로그인정보를삭제한다.
        HttpSession session = req.getSession();
        session.removeAttribute("admin");
        //리다이렉트.
        resp.sendRedirect("/guestbook/list");
    }
}
