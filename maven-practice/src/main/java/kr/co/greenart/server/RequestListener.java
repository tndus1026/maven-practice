package kr.co.greenart.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpServletRequest;

@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {
	private static final Logger log = LoggerFactory.getLogger(RequestListener.class);
	
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		// 사용자 요청에 새로운 속성이 추가되거나 기존 속성이 변경될 때 호출
		String attrName = srae.getName();
		Object attrValue = srae.getValue();
		
		log.info("{} :{} added", attrName, attrValue.toString());
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// 사용자 요청 발생 시 호출
		HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
		
		String uri = req.getRequestURI();
		String method = req.getMethod();
		
		String logMessage = String.format("%s %s", uri, method);
		log.info(logMessage);
	}
}
