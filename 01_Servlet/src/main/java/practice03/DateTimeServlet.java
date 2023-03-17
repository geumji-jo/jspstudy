package practice03;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/datetime")
public class DateTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 요청 파라미터 확인
		String type= request.getParameter("type");
		
		
		
		String result = null;
		switch (type) {
		case "1": // 현재 날짜 요청
			result = LocalDate.now().toString();
		case "2": // 현재 시간 요청
			result =LocalTime.now().toString();
			result = result.substring(0, result.indexOf("."));
			break;
		}
		
		
		// 응답 타입 및 인코딩
		response.setContentType("text/html; charset=UTF-8");
		
		// 출력 스트림 생성
		PrintWriter out = response.getWriter();
		
		// 응답 만들기
		out.println("<script>");
		out.println("alert('요청결과는 " + result + "입니다')");
		out.println("</script>");
		
		out.flush();	//출력스트림의  잔여물 데이터를 밀어내는 (빨대로 바람불기) 작업
		out.close();	// 출력스트림의 경우 닫아주지 않으면 출력이 잘 안될수도 있어서 필수로 해주기
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		doGet(request, response);
	}

}
