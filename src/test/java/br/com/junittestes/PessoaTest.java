package br.com.junittestes;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
	
	@Test
	void validarCalculoIdade() {
		Pessoa pessoa = new Pessoa("Julia", LocalDate.of(1997, 11, 2));
		Assertions.assertEquals(25, pessoa.getIdade());
	}
	
	@Test
	void calculaIdadeCorretamente() {
		Pessoa pessoa = new Pessoa("Jessica", LocalDate.of(1997, 11, 2));
		Assertions.assertEquals(25, pessoa.getIdade());
	}
	
	@Test
	void maiorDeIdade() {
		Pessoa pessoa = new Pessoa("Paulo", LocalDate.of(2000, 10, 17));
		Assertions.assertTrue(pessoa.ehMaiorDeIdade());
		
		Pessoa pessoa2 = new Pessoa("Joaão", LocalDate.now());
		Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
	}
	
	

}
