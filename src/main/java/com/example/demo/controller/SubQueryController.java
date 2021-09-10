package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.slave.domain.Area;
import com.example.demo.slave.domain.DepartMent;
import com.example.demo.slave.domain.UserSub;
import com.example.demo.slave.dto.UserDto;
import com.example.demo.slave.repository.AreaRepository;
import com.example.demo.slave.repository.DepartMentRepository;
import com.example.demo.slave.repository.UserSubRepository;
import com.example.demo.slave.repository.support.UserSubRepositorySupport;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api
@RestController
@RequestMapping("/sub")
@RequiredArgsConstructor
public class SubQueryController {
	private final AreaRepository areaRepo;
	private final DepartMentRepository departMentRepo;
	private final UserSubRepository userRepo;
	private final UserSubRepositorySupport userRepoSupport;

	@GetMapping("/test")
	public void saveData() {
		Area area1 = new Area();
		area1.setAreaName("서울");
		area1.setAreaNo(1L);

		Area area2 = new Area();
		area2.setAreaName("부산");
		area2.setAreaNo(2L);

		areaRepo.save(area1);
		areaRepo.save(area2);
		
		DepartMent departMent1 = new DepartMent();
		departMent1.setDeptName("A");
		departMent1.setDeptNo(101L);
		
		DepartMent departMent2 = new DepartMent();
		departMent2.setDeptName("B");
		departMent2.setDeptNo(201L);
		
		departMentRepo.save(departMent1);
		departMentRepo.save(departMent2);
		
		UserSub user1 = new UserSub();
		user1.setAreaNo(1l);
		user1.setUserId("no1");
		user1.setDeptNo(101L);
		user1.setResign(1000L);
		user1.setResignCause("그냥");

		UserSub user2 = new UserSub();
		user2.setAreaNo(2l);
		user2.setUserId("no2");
		user2.setDeptNo(101L);
		user2.setResign(1000L);
		user2.setResignCause("그냥2");

		UserSub user3 = new UserSub();
		user3.setAreaNo(1L);
		user3.setUserId("no3");
		user3.setDeptNo(101L);
		user3.setResign(2000L);
		user3.setResignCause("그냥3");

		UserSub user4 = new UserSub();
		user4.setAreaNo(2L);
		user4.setUserId("no4");
		user4.setDeptNo(201L);
		user4.setResign(2000L);
		user4.setResignCause("그냥4");

		UserSub user5 = new UserSub();
		user5.setAreaNo(1l);
		user5.setUserId("no5");
		user5.setDeptNo(201L);
		user5.setResign(2000L);
		user5.setResignCause("그냥5");

		UserSub user6 = new UserSub();
		user6.setAreaNo(2l);
		user6.setUserId("no6");
		user6.setDeptNo(201L);
		user6.setResign(2000L);
		user6.setResignCause("그냥6");
		
		userRepo.save(user1);
		userRepo.save(user2);
		userRepo.save(user3);
		userRepo.save(user4);
		userRepo.save(user5);
		userRepo.save(user6);
	}

	@PostMapping("/test2")
	public List<UserDto> a(Long deptNo){
		return userRepoSupport.findByAreaName(deptNo);
	}
}
