package study.example.study2.hystrix;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

import lombok.extern.slf4j.Slf4j;
import study.example.study2.fegin.TestFeginService;
@Component
@Slf4j
public class TestFeginServiceFallback  implements  TestFeginService{
    /**
     *调用失败相关业务逻辑处理
     */
	@Override
	public JSONObject getInterfaceData() {
	   log.error("调用一级栏目获取数据请求失败。。。。。。");
		return null;
	}
     
	/**
	 * 调用失败相关业务逻辑处理
	 */
	@Override
	public JSONObject getSecondCategory() {
		 log.error("调用二级栏目获取数据请求失败。。。。。。");
		return null;
	}

}
