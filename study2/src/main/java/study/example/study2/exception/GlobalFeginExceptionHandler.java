package study.example.study2.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;
import study.example.study2.result.ResultResponse;

/**
 * 异常全局处理类，处理fegin内部调用 
 * springframework.web.bind.annotation.controllerAdvice 基于 controller advice 去通知
 * @author Administrator
 */
//@Slf4j
//@ControllerAdvice("study.example.study2.controller")
//public class GlobalFeginExceptionHandler {
//	
//	@ExceptionHandler(value=Exception.class)
//	public ResultResponse handle(Exception e) {
//		  if(e instanceof BusinessException ) {
//			 BusinessException businessException=(BusinessException)e;
//			 if(businessException.getCode()==null) {
//				return ResultResponse.error(businessException.getMessage());
//			}
//			return ResultResponse.error(businessException.getCode(),businessException.getMessage());
//		}else {
//			log.error(e.getMessage().toString());
//			return ResultResponse.error(e.getMessage().toString());
//		}
//	}
//
//}
