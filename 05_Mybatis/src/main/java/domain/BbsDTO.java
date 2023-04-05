package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BbsDTO {
	private int bbsNo;	// 카멜케이스 형식으로 칼럼 짓기
	private String title;
	private String content;
	private String modifiedDate;
	private String createdDate;
	
}
