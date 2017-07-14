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
@WebServlet({ "/DepositServlet", "/ch/DepositServlet" })
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 存款操作
		 */
		doGet(request, response);
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		response.setContentType("text/html;charset=UTF-8");  
	
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();  
		//ServletContext    application =super.getServletContext();
		Object _idObj=session.getAttribute("_id");
		//Object _idObj=application.getAttribute("_id");
		double money=Double.parseDouble(request.getParameter("money"));
		
		//String idcard=request.getParameter("idcard");
		//String name=request.getParameter("name");
			DBManager db=new DBManager();

	try{
	
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		
			String s_date = sdf.format(new Date());

			String sql="update user set money = money +'" +money+ "' where bank_id = '" + _idObj +"'";
			
			String record="deposit";
			//添加存款记录到记录表
			String str="insert record(bank_id,time,money_record,record_status) values ('" + _idObj + "','" + s_date + "','" + money + "','"  + record+ "');";

			//db.executeSql(sql);
			db.executeSql(str);
			out.println(_idObj);
			out.println(money);
			out.println(str);
			db.Release();
			
		
		//String sql="insert into user(balance) values ('"+ money +"') where bank_id ='" + _idObj +"'";
		
		
		out.println("存款成功，3秒后返回菜单主页");
		//response.sendRedirect("login.jsp");
		response.setHeader("refresh","3;url= function_index.jsp");
	}catch(Exception e){
		out.println(e.toString());
	}
	}

}
