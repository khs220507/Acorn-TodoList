package TodoBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")  
public class BoardRegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BoardService s = new BoardService();
		String contents = req.getParameter("contents");
		String regTodo = s.registerTodo(new Board(contents));
		resp.setContentType("application/text;charset=UTF-8");
		resp.getWriter().write(regTodo);
	}
}

