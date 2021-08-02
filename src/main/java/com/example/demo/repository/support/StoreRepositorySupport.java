package com.example.demo.repository.support;

import static com.example.demo.domain.QStaff.staff;
import static com.example.demo.domain.QStore.store;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Store;
import com.example.demo.domain.User;
import com.example.demo.service.StaffVo;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class StoreRepositorySupport extends QuerydslRepositorySupport {

	private final JPAQueryFactory jpaQueryFactory;

	public StoreRepositorySupport(JPAQueryFactory jpaQueryFactory) {
		super(User.class);
		this.jpaQueryFactory = jpaQueryFactory;

	}

	public Store findOneByName(String name) {
		return jpaQueryFactory.selectFrom(store).where(store.name.eq(name)).fetchOne();
	}

	public List<StaffVo> findStaffsByName(String name) {
		return jpaQueryFactory.select(Projections.fields(StaffVo.class, staff.id, staff.age, staff.name)).from(store)
				.join(store.staff, staff) // 1)
				.where(store.name.eq(name)).fetch();
	}
}
