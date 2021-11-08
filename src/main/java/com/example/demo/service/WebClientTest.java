package com.example.demo.service;

import java.time.Duration;

import javax.net.ssl.SSLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.domain.User;

import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import reactor.netty.http.client.HttpClient;

public class WebClientTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${data.url.target}")
	private String url;

	private Long timeOut = 1L;
	
	public void send(String a) {

		// https
		HttpClient httpClient = HttpClient.create().secure(t -> {
			try {
				t.sslContext(SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build());
			} catch (SSLException e) {
				logger.error("SSLException\n", e);
			}
		}).responseTimeout(Duration.ofSeconds(timeOut));

		WebClient wc = WebClient.builder().clientConnector(new ReactorClientHttpConnector(httpClient)).build();
		
		//동기
		User response = wc.post().uri(url).bodyValue(a).retrieve().bodyToMono(User.class).block();

		// http
		WebClient webClient = WebClient.create(url);

		// req 그대로 전달 및 리턴
		//동기
		User response2 = webClient.post().uri("").bodyValue(a).retrieve().bodyToMono(User.class).block();
	}
}
