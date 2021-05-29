package study.example.study2.result;

import lombok.Data;
/**
 * 结果集响应返回
 * @author Administrator
 *
 */
@Data
public class ResultResponse<T> {
	
	private String code;
	
	private String msg;
	
	private T data;
	
	public ResultResponse() {
	}
	
	public static ResultResponse sucess(String msg) {
		ResultResponse resultResponse=new ResultResponse();
		resultResponse.setMsg(msg);
		return resultResponse;
	}
	
	public static <T>ResultResponse sucess(String msg,T data) {
		ResultResponse resultResponse=new ResultResponse();
		resultResponse.setMsg(msg);
		resultResponse.setData(data);
		return resultResponse;
	}
	
	public static ResultResponse error(String code) {
		ResultResponse  reponse=new ResultResponse();
		reponse.setCode(code);
		reponse.setMsg("请求接口异常，请联系管理员");
		return reponse;
	}
	
	public static ResultResponse error(String code,String msg) {
		ResultResponse  response=new ResultResponse();
		response.setCode(code);
		response.setMsg(msg);
        return  response;
	}

}
