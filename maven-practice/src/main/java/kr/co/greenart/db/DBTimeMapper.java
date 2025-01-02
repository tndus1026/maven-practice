package kr.co.greenart.db;

import java.time.LocalDateTime;

import org.apache.ibatis.annotations.Select;

public interface DBTimeMapper {
	@Select("SELECT CURRENT_TIMESTAMP()")
	LocalDateTime selectDbTime();
	
	
}
