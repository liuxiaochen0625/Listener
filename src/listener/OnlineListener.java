package listener;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineListener implements HttpSessionListener,HttpSessionAttributeListener{

	private ServletContext sc;
	private ArrayList list = new ArrayList();
	@Override
	public void attributeAdded(HttpSessionBindingEvent sbe) {
		list.add((String) sbe.getValue());
		sc.setAttribute("list", list);
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		sc=se.getSession().getServletContext();
		System.out.println("新建一个session");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("销毁一个session");
		if (!list.isEmpty()) {
		   list.remove((String) se.getSession().getAttribute("userName"));
		   sc.setAttribute("list", list);
		}
		
	}

}
