package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import domain.Member;
import repository.MemberDAO;

public class MemberRemoveService implements IMemberService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		// 요청 파라미터를 이용해서 Member member 객체 만들기
		Member member = new Member();
		member.setMemberNo(Integer.parseInt(request.getParameter("memberNo")));
		member.setName(request.getParameter("name"));
		member.setGender(request.getParameter("gender"));
		member.setAddress(request.getParameter("address"));
		
		// Member member 객체의 정보를 이용해 DB의 내용을 수정
	
		String strmemberNo = request.getParameter("memberNo");
		int memberNo = Integer.parseInt(strmemberNo);
		int deleteResult = MemberDAO.getInstance().deleteMember(memberNo);
		
		// 응답 데이터 형식 (JSON)
		response.setContentType("application/json; charset=UTF-8");
		
		// 응답 데이터 만들기
		/*
			{
				"updateResult":1
			}	
		 */
		JSONObject obj = new JSONObject();
		obj.put("deleteResult", deleteResult);
		
		
		if (deleteResult == 1) {
			try(PrintWriter out = response.getWriter()){
				out.println(obj.toString());
				out.flush();
				out.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

	}


