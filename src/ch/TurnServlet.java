package ch;

import java.io.IOException;

import java.io.PrintWriter;
import java.security.interfaces.RSAKey;
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
import com.UeserInfo;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/TurnServlet", "/ch/TurnServlet" })
public class TurnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TurnServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
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
		response.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		//ServletContext    application =super.getServletContext();

		PrintWriter out = response.getWriter();
		DBManager db = new DBManager();

		Object bank_id=session.getAttribute("_id"); 
	//Object bank_id = application.getAttribute("_id");

		Double balance = null;

		// Double balance =(Double) request.getSession().getAttribute("money");
		 //获取账户余额

		String turn_id = request.getParameter("turn_id");
		String Money = request.getParameter("turnmoney");
		
		String str = "select * from user where bank_id=' " + bank_id + "';";
		ResultSet rs = db.getResult(str);
		if (Money != null) {
			try {
				if (rs.next()) {
					balance = rs.getDouble("money");
					System.out.println(balance);

					if (balance != null && Double.parseDouble(Money) > 0) {
						if (Double.parseDouble(Money) < balance) {
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
							String s_date = sdf.format(new Date());
							String sql = "update user set money = '" +balance+ "' - '"+Money+"',time ='"+s_date+"' where bank_id=' " + bank_id + "' ;";
							
							String sql2 = "update user set money = money+ '"+Money+"' ,time ='"+s_date+"' where bank_id=' " + turn_id + " ';";
							db.turnSql(sql, sql2);
							
							
							String record="转账";
							//添加取款记录到记录表
							
							
							
							//添加转账记录到记录表
							//String res="insert record(bank_id,time,money_record,record_status,transfer_id) values ('" + bank_id + "','" + s_date + "','" + Money + "','"  + record+ "',' " + turn_id + " ');";
							String res = " insert record(bank_id,time,money_record,record_status,transfer_id) values ("+bank_id+",'"+s_date+"',"+Money+",'"+record+"',"+turn_id+")";
							db.executeSql(res);
						
							out.println(sql);
							out.println(sql2);
							out.println("===108==="+res);
						} else {
							

							  request.setAttribute("message","您的账户当前余额为"+balance+"元,不足"+Money+"元,请重新输入！" );
							  request.getRequestDispatcher("TurnCarsh.jsp").
							  forward(request, response);		
							  
//							out.println("<script>alert('余额不足');window.history.back()</script>");
//							out.println(turn_id + Money);
//							out.println(bank_id + String.valueOf(balance));

						}

					} else {
					
					
						
						  request.setAttribute("message","您当前的输入有误,请重新输入！" );
						  request.getRequestDispatcher("TurnCarsh.jsp").forward(request, response);
						 	out.println(turn_id + Money);
						out.println(bank_id + String.valueOf(balance) + str);

					}
				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				db.Release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		} else {
			out.println("真的错了" + turn_id + Money);
			out.println(bank_id + String.valueOf(balance));
		}

	}

}
