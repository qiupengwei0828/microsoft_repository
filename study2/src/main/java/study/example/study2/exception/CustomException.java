package study.example.study2.exception;
/**
 * 通用异常处理
 * @author Administrator
 */
public class CustomException  extends RuntimeException {
	public CustomException(String message) {
        super(message);
    }
   
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}
