package kr.co.greenart.server;

import java.time.LocalDateTime;

public interface DBStatusService {
	LocalDateTime selectDbTime();
}
