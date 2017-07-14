package ch;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBManager;
import com.UeserInfo;
import com.mysql.jdbc.ResultSet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/RegisterServlet", "/ch/RegisterServlet" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
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
		//注册
		doGet(request, response);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();


		// 獲取用戶相關信息
		String uid = request.getParameter("_id");
		String upwd = request.getParameter("pwd");
		String upwd2 = request.getParameter("tpwd");
		String uidcard = request.getParameter("idcard");
		String uname = request.getParameter("name");
		String money = request.getParameter("money");
		if (uid.equals("")) {
			out.println("<script>alert('请输入開戶卡號！');window.history.back()</script>");

		} else if (upwd.equals("")) {
			out.println("<script>alert('请输入密码');window.history.back()</script>");

		} else if (upwd2.equals("")) {
			
			out.println("<script>alert('请输入确认密码');window.history.back()</script>");
		} else if (!upwd.equals(upwd2)) {
			out.println("<script>alert('两次密码不匹配');window.history.back()</script>");
		} else if (money.equals("")) {
			out.println("<script>alert('请存入开户金额');window.history.back()</script>");
		} else if (uname.equals("")) {
			out.println("<script>alert('请輸入您的姓名');window.history.back()</script>");

		} else {
			String sql = "insert user(bank_id,pwd,idcard,name,money) values ('" + uid + "','" + upwd + "','" + uidcard
					+ "','" + uname + "',' " + money + "')";
			
			DBManager db = new DBManager();
			UeserInfo userInfo=new UeserInfo();
			db.executeSql(sql);
			ResultSet rs=(ResultSet) db.getResult("select * from user where bank_id=' "+uid +" ';");
			try {
				session.setAttribute("_id",rs.getInt("bank_id"));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			session.setAttribute("name", userInfo.getUserName());
			session.setAttribute("pwd", userInfo.getPassword());
			session.setAttribute("_id", userInfo.get_id());
			session.setAttribute("money", userInfo.getMoney());
			session.setAttribute("id_card", userInfo.getIdCard());
			try {
			
				db.Release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.println("添加成功，三秒后返回登陸頁面");

			response.setHeader("refresh", "3;url= login.jsp");

			try {
				db.Release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
