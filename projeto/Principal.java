package projeto;

import projeto.Time.Azul;
import projeto.Time.Vermelho;

public class Principal {

	public static void main(String[] args) {
		Vermelho v = new Vermelho();
		Azul a = new Azul();
		
		Combate c = new Combate();
		c.fight(v, a);
	

	}

}
