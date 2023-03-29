<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
		request.setCharacterEncoding("UTF-8");
	
		String item = request.getParameter("item");
		int itemCount = Integer.parseInt(request.getParameter("item_count"));
		
		// 제품명 + 구매수량을 하나의 Map으로 저장한다.
		Map<String, Object> map = new HashMap<>();
		map.put("item", item);
		map.put("itemCount", itemCount);
		
		// session에 저장된 cart 속성이 있는지 확인한 뒤 없다면 새로운 cart를 만들어서 session에 저장한다.
		List<Map<String, Object>> cart = (List<Map<String, Object>>)session.getAttribute("cart");
		if(cart == null){
			cart = new ArrayList<>();
			session.setAttribute("cart", cart);
			
		}
		
		// session의 cart에 Map 저장하기
		cart.add(map);
		
		// 참고
		/*
		class Product {
			String item;
			int itemCount;
			Product(String item, int itemCount){
				this.item = item;
				this.itemCount = itemCount;
				
			}
		}
		Product product = new Product(item, itemCount);
		*/
	%>

</body>
</html>