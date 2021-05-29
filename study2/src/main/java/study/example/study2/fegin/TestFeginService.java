package study.example.study2.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.alibaba.fastjson.JSONObject;

import study.example.study2.hystrix.TestFeginServiceFallback;

@FeignClient(name = "microservice-study",fallback = TestFeginServiceFallback.class)
public interface TestFeginService {
   
    /**
     * 获取一级分类
     */
     @GetMapping(value = "/interface2/getInterfaceData",produces = MediaType.APPLICATION_JSON_VALUE)
     JSONObject getInterfaceData();
     
     /**
      * 获取二级分类
      */
      @PostMapping(value = "/test/getSecondCategory",produces = MediaType.APPLICATION_JSON_VALUE)
      JSONObject getSecondCategory();
     
}
