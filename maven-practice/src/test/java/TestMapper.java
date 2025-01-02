import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import kr.co.greenart.db.DBTimeMapper;
import kr.co.greenart.util.DBUtil;

public class TestMapper {
	@Test
	public void test() {
		try (SqlSession session = DBUtil.getSqlSession()) {
			DBTimeMapper mapper = session.getMapper(DBTimeMapper.class);
			
			LocalDateTime result = mapper.selectDbTime();
			
			assertNotNull(result);
			assertEquals(2025, result.getYear());
		}
	}
}
