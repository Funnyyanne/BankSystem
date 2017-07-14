package ch;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBManager;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/SelectServlet", "/ch/SelectServlet" })
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// HttpSession session=request.getSession();
		// ServletContext application =super.getServletContext();

		// Object bank_id=session.getAttribute("_id");
		String idStr = request.getParameter("_id");
		
		// Object bank_id = application.getAttribute("_id");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

		String s_date = sdf.format(new Date());

		
		int bank_id= Integer.parseInt(idStr);
		String sql = "select * from user where bank_id='" + bank_id + "';";

		// 添加查询记录
		String record = "查询";
		// 添加存款记录到记录表
		String str = "insert record(bank_id,time,record_status) values ('" + bank_id + "','" + s_date + "','" + record
				+ "');";

		DBManager db = new DBManager();

		db.executeSql(str);
		System.out.println(str+s_date);

		ResultSet rs = db.getResult(sql);
		try {
			// String name=rs.getString("name");

			if (rs.next()) {
				String name = rs.getString("name");
				double money = rs.getDouble("money");
				out.println("<html>");
				out.println("<head>");
				out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
				out.println("</head>");
				out.println("<body>");
				out.println("<p>客户" + name + "的存款金额为" + money + "</p>");

				out.println();
				out.println("</body>");

				out.println("</html>");
			} else {
				/* out.println("密码或用户名错误请重新输入!"); */
				out.println("<html>");
				out.println("<head>");
				out.println("<meta http-equiv='Content-Type' content='text/html; charset=u" + "utf-8'>");
				out.println("</head>");
				out.println("<body>");
				out.println("<%=rs.getString('name')%>+抱歉，出错了！");
				out.println("</body>");

				out.println("</html>");

				db.Release();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
