package com.mastering.springboot.Chapter04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeDataService {
	
	@Value("${somedataservice.url}")
	private String url;
	
	public String retrieveSomeData() {
		// URL을 사용하고 데이터를 얻는 로직
		return "data from service";
	}
}
