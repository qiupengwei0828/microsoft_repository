package study.example.study2.exception;

import lombok.Data;

@Data
public class ExceptionInfo {
	
	private String timestamp;
	
	private String status;
	
	private String error;
	
	private String message;
	
	private String path;
	
	private String exception;
}
