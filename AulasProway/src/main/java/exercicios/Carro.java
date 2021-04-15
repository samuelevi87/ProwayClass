package exercicios;

public class Carro {

	String motor;
	int nivelCombustivel = 0;
	int velocidade = 0;
	boolean isLigado = false;

	/**
	 * @author Samuel Alves
	 * 
	 *         Altera o estado de desligado para ligado. Verifica se o carro tem
	 *         combust�vel e se est� desligado.
	 * 
	 * @return void
	 * 
	 */
	public void ligarCarro() {
		if (this.nivelCombustivel > 0 && !this.isLigado) {
			isLigado = true;
		} else {
			System.out.println("Carro precisa de combust�vel ou j� est� ligado");
		}

	}

	/**
	 * @author Samuel Alves
	 * 		   Altera o estado de acelera��o para maior que 0
	 *         Aumenta a velocidade do carro. Verifica se o carro est� ligado e se
	 *         tem combustivel. Incrementa a velocidade e decrementa o combustivel.
	 * @return void
	 */
	public void acelerarCarro() {
		if (this.isLigado && this.nivelCombustivel >= 1) {
			this.velocidade++;
			this.nivelCombustivel--;
		} else {
			System.out.println("O carro precisa de estar ligado e ter combust�vel.\nVelocidade atual= " + this.velocidade + " Gasosa = " + this.nivelCombustivel);
		}
	}
	
	/**
	 * @author Samuel Alves
	 * 
	 *         diminui a velocidade do carro. Verifica se o carro est� ligado e se
	 *         tem combustivel. Incrementa a velocidade e decrementa o combustivel.
	 * @return void
	 */
	public void frearCarro() {
		if (this.velocidade >=1) {
			this.velocidade--;
			System.out.println("Velocidade atual: " + this.velocidade);
		}else {
			this.velocidade = 0;
			System.out.println("J� est� parado!");
		}
	}

}
