package study.example.study2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lombok.extern.slf4j.Slf4j;
import study.example.study2.fegin.TestFeginService;


@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {
		/**
		 * @return
		 */
	    @Autowired
	    TestFeginService  testFeginService;
	    
	   @RequestMapping("/getFristCategory")
	   @ResponseBody
	   public JSONObject getFristCategory() {
	    	 JSONObject  obj =testFeginService.getInterfaceData();
           return  obj;
	  }
	  /**
	   *   fallback 和 hystrixcommd 同时存在
	   *   时fallback 是基于error code的 
	   *   hystrix 是基于controller层相关方法的 
	   */
	  
	   /**
	    * HystrixCommand 来进行实现
	    * @return
	    */
	   @RequestMapping("/getUserinfo")
	   @HystrixCommand(fallbackMethod = "orderToMemberUserInfoHystrixFallbackMethod")
	   @ResponseBody
	   public JSONObject getUserinfo() {
		     JSONObject  obj =testFeginService.getInterfaceData();
		     obj.put("code", 200);
	    	 obj.put("msg", "接口响应正常");
           return  obj;
	  }
	   //服务降级处理方法
	  public JSONObject orderToMemberUserInfoHystrixFallbackMethod(){
		    log.error("hystrix commond 请求接口异常");
	    	JSONObject  obj=new JSONObject();
	    	obj.put("code", 200);
	    	obj.put("msg", "接口响应异常");
           return  obj;
	  }
}
