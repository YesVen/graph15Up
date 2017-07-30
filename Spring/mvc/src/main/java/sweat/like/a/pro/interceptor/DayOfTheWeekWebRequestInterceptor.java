package sweat.like.a.pro.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfTheWeekWebRequestInterceptor extends HandlerInterceptorAdapter{



	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		Calendar calendar = Calendar.getInstance();
		
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		
		if(day == 7)//1 for sunday and 2 for monday
		{
			response.getWriter().write("Sorry, Application is closed on Saturday. See you soon on Sunday to Friday.");
			return false;
		}
		
		return super.preHandle(request, response, handler);
	}
	
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		System.out.println("IN post handle of interceptor");
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("IN after completion method  of interceptor");
		super.afterCompletion(request, response, handler, ex);
	}
}
