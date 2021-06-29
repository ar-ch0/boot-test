package com.example.demo.repository.support;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class UserRepositorySupport extends QuerydslRepositorySupport {

	private final JPAQueryFactory jpaQueryFactory;

	public UserRepositorySupport(JPAQueryFactory jpaQueryFactory) {
		super(User.class);
		this.jpaQueryFactory = jpaQueryFactory;
	}

	/*
	public MailDto findOneByFileNameSvr(String fileNameSvr) {
		return jpaQueryFactory
				.select(Projections.fields(MailDto.class, fmApprove.fileNamePc, fmApprove.fileUser,
						fmApprove.virusDetail, userSsbr.userMail,
						new CaseBuilder().when(fmApprove.fileCourse.eq(0)).then("External > Internal")
								.otherwise("Internal > External").as("fileCourse")))
				.from(fmApprove).join(userSsbr).on(fmApprove.fileUser.eq(userSsbr.userId))
				.where(fmApprove.fileNameSvr.eq(fileNameSvr)).fetchOne();
	}
	
	*/
}
