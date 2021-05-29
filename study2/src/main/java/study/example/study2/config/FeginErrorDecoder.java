//package study.example.study2.config;
//
//import java.io.IOException;
//import java.io.Reader;
//
//import org.apache.commons.lang.StringUtils;
//import org.springframework.stereotype.Component;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.ctc.wstx.util.StringUtil;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import feign.Response;
//import feign.Util;
//import lombok.extern.slf4j.Slf4j;
//import study.example.study2.exception.BusinessException;
//import study.example.study2.exception.CustomException;
//import study.example.study2.exception.ExceptionInfo;
//import study.example.study2.exception.InternalException;
///***
// * fegin errorCode 处理
// * @author Administrator
// * feign.codec.ErrorDecoder fegin 调用 实现
// */
//@Component
//@Slf4j
//public class FeginErrorDecoder  implements feign.codec.ErrorDecoder{
//	   ObjectMapper objectMapper = new ObjectMapper();
//
//       @Override
//       public Exception decode(String s, Response response) {
//
//               try {
//                   if (response.body() != null) {
//                           String targetMsg = null;
//                           String body = Util.toString(response.body().asReader());
//                           log.error(body);
//                           ExceptionInfo ei = this.objectMapper.readValue(body.getBytes("UTF-8"), ExceptionInfo.class);
//                           String message = ei.getMessage();
//                       if(StringUtils.isNotBlank(ei.getException())) {
//                    	   Class clazz = Class.forName(ei.getException());
//                           Object obj = clazz.newInstance(); 
//                           if (obj instanceof BusinessException) {
//                               targetMsg = message.substring(message.indexOf("{"), message.indexOf("}") + 1);
//                               log.error(targetMsg);
//                               BusinessException businessException = new BusinessException();
//                               return businessException;
//                            }else{
//                                   targetMsg=message.substring(message.indexOf(":"),message.length());
//                                   return new InternalException(targetMsg);
//                             }
//                           }else{
//                               targetMsg=message.substring(message.indexOf(":"),message.length());
//                               return new InternalException(targetMsg);
//                         }
//                    }
//               } catch (Exception var4) {
//                       log.error(var4.getMessage());
//                       return new InternalException(var4.getMessage());
//               }
//               return new InternalException("系统异常,请联系管理员");
//       }
//}
