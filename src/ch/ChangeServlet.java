package ch;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet({ "/ChangeServlet", "/ch/ChangeServlet" })
public class ChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChangeServlet() {
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
		//HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();
		DBManager db = new DBManager();
		ServletContext    session =super.getServletContext();

		
		Object bank_id = session.getAttribute("_id");

		String password=request.getParameter("pwd");
		String againPwd=request.getParameter("npwd");
		
		
		
		String sql="select * from user where bank_id='"+bank_id+"';";
		ResultSet rs=db.getResult(sql);
	
		if (bank_id!=null) {
			if (password!=null) {
				try {
					if (rs.next()) {
						if (password.equals(rs.getString("pwd"))) {
							if (againPwd!=null&&againPwd.length()>=6) {
								String str="update user set pwd='"+againPwd+"'where bank_id='"+bank_id+"';";
								
								db.executeSql(str);
								
								out.println("修改成功，三秒后返回登陸頁面");

								response.setHeader("refresh", "3;url= login.jsp");
								
								db.Release();
							}else {
								out.println("<script>alert('请输入新密码，密码必须大于六位');window.history.back()</script>");
							}
						}else {
							out.println("<script>alert('请输入初始密码');window.history.back()</script>");
						}
					}else {
						out.println("没有next哦");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}else {
				out.println("<script>alert('请输入初始密码和新密码');window.history.back()</script>");
			}
			
		}
	
		
	}

}
