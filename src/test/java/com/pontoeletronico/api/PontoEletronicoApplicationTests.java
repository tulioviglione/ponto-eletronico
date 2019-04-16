package com.pontoeletronico.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class PontoEletronicoApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(PontoEletronicoApplicationTests.class);
	
	@Test
	public void contextLoads() {
		log.info("Teste");
	}

}
