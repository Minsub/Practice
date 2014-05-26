package com.minsub.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface AnnotationMapper {
	@Select("select * from PERS where dept = #{dept}")
	@Results(value = { 
		@Result(property="id", column="id"),
		@Result(property="name", column="name"),
		@Result(property="job", column="job"),
		@Result(property="salary", column="salary")
	})
	public List<Item> selectByDept(final int dept);
}
