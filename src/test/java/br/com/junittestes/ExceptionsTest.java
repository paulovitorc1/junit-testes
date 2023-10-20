package br.com.junittestes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

	@Test
	void validaCenarioDeExcecaoNaTransferencia() {
		Conta contaOrigem = new Conta("121344", 0);
		Conta contaDestino = new Conta("654321", 210);
		
		TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
		
		Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
				
	}
}
