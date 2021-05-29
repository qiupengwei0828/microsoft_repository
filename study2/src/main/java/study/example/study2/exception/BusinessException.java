package study.example.study2.exception;

import lombok.Data;

/**
 * 业务异常处理封装
 * @author Administrator
 *
 */
@Data
public class BusinessException   extends  RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String msg;
	
	private String code;
	
	
	public BusinessException() {
		
	}
	public BusinessException(String msg) {
		super();
		this.msg=msg;
		this.code="2";
	}
	public BusinessException(String msg,String code) {
		super(msg);
		this.msg=msg;
		this.code=code;
	}
}
