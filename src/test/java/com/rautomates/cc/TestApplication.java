package com.rautomates.cc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestApplication {

	
  @Autowired
	Application	app;

  @Test
	public void contextLoads() {
		assertThat(app).isNotNull();
		
	}
}
