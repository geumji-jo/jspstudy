package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.util.RequestUtil;


@WebServlet("*.do")	//getAllBoardList.do-모두보기//getBoardByNo.do-번호의의한게시글가져오기 // addboard.do //modifyBard.do// removeBoard.do
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 요청과 응답의 인코딩
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		
		// URLMapping 확인
		String requetstURI = request.getRequestURI();							/* 	/04_Dbcp/getAllBoardList.do*/	
		String contextPath = request.getContextPath();							/*	/04_Dbcp				*/
		String urlMapping = requetstURI.substring(contextPath.length());		/*   /getAllBoardList.do	*/
		
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
