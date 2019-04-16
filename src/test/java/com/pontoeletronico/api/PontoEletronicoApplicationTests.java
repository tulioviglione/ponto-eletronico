package com.pontoeletronico.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class PontoEletronicoApplicationTests {

	private static final String CNPJ = "51463645000100";
	
	@Test
	public void contextLoads() {
		assertEquals(CNPJ, CNPJ);
	}

}
