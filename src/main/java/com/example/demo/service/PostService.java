package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Post;
import com.example.demo.repository.PostRepository;

import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service
@GraphQLApi
public class PostService {

	@Autowired
	private PostRepository postRepository;

	@GraphQLQuery(name = "posts")
	public List<Post> getPosts() {
		return postRepository.findAll();
	}

	@GraphQLQuery(name = "post")
	public Optional<Post> getPostById(Long id) {
		return postRepository.findById(id);
	}

	@GraphQLMutation(name = "savePost")
	public Post savePost(Post post) {
		return postRepository.save(post);
	}

	@GraphQLMutation(name = "deletePost")
	public void deletePost(Long id) {
		postRepository.deleteById(id);
	}

	@GraphQLQuery(name = "isGood")
	public boolean isGood(@GraphQLContext Post post) {
		return !post.getTitle().equals("title1");
	}
}
