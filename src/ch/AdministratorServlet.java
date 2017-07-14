package ch;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;

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
@WebServlet({ "/AdministratorServlet", "/ch/AdministratorServlet" })
public class AdministratorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministratorServlet() {
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
		doGet(request, response);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");  
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();  
		//ServletContext    application =super.getServletContext();
		
		String _id=request.getParameter("_id");
		String pwd=request.getParameter("pwd");
		_id=_id.trim();
		pwd=pwd.trim();
		
		String sql="select * from admin where administrator='"+ _id+"';";
		//db.getResult(sql);
		DBManager db=new DBManager();
		//UeserInfo userInfo=new UeserInfo();
		ResultSet rs=db.getResult(sql);  
		if (_id!=null) {
					//	int bank_id=Integer.parseInt(_id);

		
		try {
			if(rs.next()){
				if(pwd.equals(rs.getString("password"))){
					//session.setAttribute("_id",userInfo.get_id());
				
					session.setAttribute("_id", _id);
					out.println("登录成功!<br/>");
					/*session.setAttribute("_id",_id);*/
		
					response.sendRedirect("function_index.jsp");
						

				}else {
					out.println("密码或用户名错误请重新输入!");
					
				}
			}
			else{
				out.println("密码或用户名错误请重新输入!");
			}
			db.Release();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}else {
				out.println("出错!"+_id);
			}
	}

}
