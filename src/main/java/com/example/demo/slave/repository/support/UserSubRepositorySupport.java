package com.example.demo.slave.repository.support;

import static com.example.demo.slave.domain.QArea.area;
import static com.example.demo.slave.domain.QDepartMentUser.departMentUser;
import static com.example.demo.slave.domain.QUserSub.userSub;
import static com.example.demo.slave.domain.QDepartMent.departMent;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;
import com.example.demo.slave.dto.UserDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class UserSubRepositorySupport extends QuerydslRepositorySupport {

	private JPAQueryFactory jpaQueryFactory;

	public UserSubRepositorySupport(JPAQueryFactory jpaQueryFactory) {
		super(User.class);
		this.jpaQueryFactory = jpaQueryFactory;
	}

	@Override
	@PersistenceContext(unitName = "slaveEntityManager")
	public void setEntityManager(EntityManager entityManager) {
		super.setEntityManager(entityManager);
		this.jpaQueryFactory = new JPAQueryFactory(entityManager);
	}
	
	public List<UserDto> findByAreaName(Long deptNo){
		return jpaQueryFactory
				.select(Projections.fields(UserDto.class, userSub.userId ,area.areaName, departMent.deptName, userSub.resignCause))
				.from(userSub)
				.leftJoin(departMentUser).on(departMentUser.resign.eq(userSub.resign))
				.leftJoin(area).on(area.areaNo.eq(userSub.areaNo))
				.leftJoin(departMent).on(departMent.deptNo.eq(userSub.deptNo))
				.where(userSub.deptNo.eq(deptNo)).fetch();
	}

}
