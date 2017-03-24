package yk.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import yk.service.KaiService;


public class KaiServlet extends HttpServlet {
	KaiService kaiService;

	public KaiService getKaiService() {
		return kaiService;
	}

	public void setKaiService(KaiService kaiService) {
		this.kaiService = kaiService;
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 kaiService.marryWho("shen mi nv .");
		System.out.println("happy life...");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("KaiServlet...");
		// TODO Auto-generated method stub
		super.init(config);
		ServletContext servletContext = this.getServletContext();  
	    WebApplicationContext wac = null;   
	    wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);  
	    //Spring注入kaiService，并且显示调用其在spring中配置的id
	    this.setKaiService((KaiService)wac.getBean("kaiService"));
	   
	    
	}
	

}
