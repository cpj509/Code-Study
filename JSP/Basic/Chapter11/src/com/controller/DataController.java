package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")	//매핑 주소 - data
public class DataController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로또 숫자 저장
		List<Integer> lotto = new ArrayList<Integer>();
		lotto.add(1);
		lotto.add(2);
		lotto.add(4);
		lotto.add(7);
		lotto.add(11);
		lotto.add(16);
		
		//HashMap 자료
		Map<String, Object> car = new HashMap<>();
		car.put("brand", "Sonata");
		car.put("cc", 3000);
		
		
		//model 저장 : page < request < session < application
		request.setAttribute("lotto", lotto);
		request.setAttribute("car", car);
		
		//view로 forward
		RequestDispatcher dispatcher = request.getRequestDispatcher("data.jsp");
		dispatcher.forward(request, response);
	}

}
