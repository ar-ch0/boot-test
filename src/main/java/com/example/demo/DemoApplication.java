package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.demo.domain.Post;
import com.example.demo.service.PostService;

@EnableCaching
@EnableScheduling
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(DemoApplication.class);
		application.addListeners(new ApplicationPidFileWriter());
		application.run();
	}
/*
	@Bean
	ApplicationRunner init(PostService postservice) {
		return args -> {
			Stream.of("title1", "title2", "title3", "title4", "title5", "title6").forEach(title -> {
				Post post = new Post();
				post.setTitle(title);
				postservice.savePost(post);
			});
			postservice.getPosts().forEach(System.out::println);
		};
	}
	*/
}
