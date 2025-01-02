package kr.co.greenart.server;

import java.io.IOException;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/", "/index", "/server/status"})
public class ServerStatusServlet extends HttpServlet {
	private final DBStatusService service = new DBStatusServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LocalDateTime serverTime = LocalDateTime.now();
		
		LocalDateTime dbTime = service.selectDbTime();
				
		req.setAttribute("serverTime", serverTime);
		req.setAttribute("dbTime", dbTime);
		req.getRequestDispatcher("/WEB-INF/views/serverStatus.jsp").forward(req, resp);
	}
}
