package exercicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarroTest {

	@Test
	public void testLigarCarro() {
		Carro meuCarro = new Carro();
		meuCarro.nivelCombustivel = 10;
		meuCarro.ligarCarro();
		assertTrue(meuCarro.isLigado);
	}

	@Test
	public void testLigarVariosCarros() {
		Carro meuCarro = new Carro();
		Carro outroCarro = new Carro();
		meuCarro.nivelCombustivel = 10;
		meuCarro.ligarCarro();
		outroCarro.ligarCarro();
		assertTrue(meuCarro.isLigado);
		assertFalse(outroCarro.isLigado);
	}

	@Test
	public void testLigarCarroSemCombustivel() {
		Carro meuCarro = new Carro();
		meuCarro.ligarCarro();
		assertFalse(meuCarro.isLigado);
	}

	@Test
	public void testLigarCarroQueJaEstaLigado() {
		Carro meuCarro = new Carro();
		meuCarro.nivelCombustivel = 10;
		meuCarro.ligarCarro();
		assertTrue(meuCarro.isLigado);
		meuCarro.ligarCarro();
		assertTrue(meuCarro.isLigado);
	}

	@Test
	public void testAcelerarCarroParadoELigado() {
		Carro meuCarro = new Carro();
		meuCarro.nivelCombustivel = 10;
		meuCarro.ligarCarro();
		meuCarro.acelerarCarro();
		assertEquals(1, meuCarro.velocidade);
		assertEquals(8, meuCarro.nivelCombustivel);
	}

	@Test
	public void testAcelerarCarroParadoEDesligado() {
		Carro meuCarro = new Carro();
		meuCarro.nivelCombustivel = 10;
		meuCarro.acelerarCarro();
		assertEquals(0, meuCarro.velocidade);
	}

	@Test
	public void testFrearCarroEmMovimento() {
		Carro meuCarro = new Carro();
		meuCarro.nivelCombustivel = 10;
		meuCarro.frearCarro();
		assertEquals(8, meuCarro.velocidade);
	}

}
