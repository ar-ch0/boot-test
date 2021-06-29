package com.example.demo.config;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

public class ServletConfig {
	@Value("${data.http.port}")
	private int serverPortHttp;
	
	@Bean
	public ServletWebServerFactory serverFactory() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
		tomcat.addAdditionalTomcatConnectors(createStandardConnector());
		return tomcat;
	}
	private Connector createStandardConnector() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setPort(serverPortHttp);
		return connector;
	}
}
