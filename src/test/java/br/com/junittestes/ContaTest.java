package br.com.junittestes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ContaTest {

	@Test
	void validarLançamento() {
		int[] primeiroLancamento = {10, 20, 30, 40, 50, 69};
		int[] segundoLancamento = {10, 20, 30, 40, 50, 69};
		
		assertArrayEquals(primeiroLancamento, segundoLancamento);
		
	}
	
	
	@Test
	void validarObjetoNulo() {
		
		Pessoa pessoa = null;
		
		assertNull(pessoa);
		
		pessoa = new Pessoa("Paulo", LocalDate.of(1997, 11, 2));
		
		assertNotNull(pessoa);
		
	}
	
	@Test
	void validarNumerosTiposDiferentes() {
		double valor = 5.0;
		double valor2 = 5.0;
		
		assertEquals(valor, valor2);
	}



}
