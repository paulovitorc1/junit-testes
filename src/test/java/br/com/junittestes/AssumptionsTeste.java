package br.com.junittestes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class AssumptionsTeste {

	@Test
	void validarUsuarioWollyan() {
		Assumptions.assumeTrue("root".equals(System.getenv("USER")));
		Assertions.assertEquals(10, 5 + 5);
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "USER", matches = "willyan")
	void validarUsuarioWillyam() {
		Assumptions.assumeTrue("root".equals(System.getenv("USER")));
	}
	
	
	
}
