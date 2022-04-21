package com.mastering.spring.springmvc.controller.basic.examples;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver; 
import org.springframework.web.servlet.view.JstlView;

import com.mastering.spring.springmvc.controller.basic.BasicViewController;

public class BasicViewControllerTest {
	private MockMvc mockMvc;
	
	@Before	
	public void setup() {
		this.mockMvc = MockMvcBuilders
							.standaloneSetup(new BasicViewController())
							.setViewResolvers(viewResolver())
							.build();
	}
	
	@Test
	public void testWelcomeView() throws Exception {
		this.mockMvc
			.perform(get("/welcome-view")
			.accept(MediaType.parseMediaType("application/html;charset=UTF-8")))
			.andExpect(view().name("welcome"));
	}
	
	private ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
}
