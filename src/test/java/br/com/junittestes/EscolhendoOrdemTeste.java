package br.com.junittestes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoOrdemTeste {

	@DisplayName("A")
	@Order(3)
	@Test
	void validaFluxoA() {
		Assertions.assertTrue(true);
	}
	
	@DisplayName("B")
	@Order(2)
	@Test
	void validaFluxoB() {
		Assertions.assertTrue(true);
	}
	
	@DisplayName("C")
	@Order(1)
	@Test
	void validaFluxoC() {
		Assertions.assertTrue(true);		
	}
 	
	
}
