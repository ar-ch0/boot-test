package com.example.demo.repository.support;

import static com.example.demo.domain.QUser.user;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.User;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class UserRepositorySupport extends QuerydslRepositorySupport {

	private final JPAQueryFactory jpaQueryFactory;

	public UserRepositorySupport(JPAQueryFactory jpaQueryFactory) {
		super(User.class);
		this.jpaQueryFactory = jpaQueryFactory;

	}

	public User findUserIdOneByName(String name) {
		return jpaQueryFactory.select(Projections.fields(User.class, user.id)).from(user).where(user.name.eq(name))
				.fetchOne();
	}


	@Transactional
	public void updateUserName(String name, String email) {
		jpaQueryFactory.update(user).where(user.email.eq(email)).set(user.name, name).execute();
	
	}
	
	@Transactional
	public void deleteUserName(String name) {
		jpaQueryFactory.delete(user).where(user.name.eq(name)).execute();
	}

}
