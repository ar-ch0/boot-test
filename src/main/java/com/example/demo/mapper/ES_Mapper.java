package com.example.demo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ES_Mapper {

	public Integer insertHistory(Map<String, Object> insertParam);

}
