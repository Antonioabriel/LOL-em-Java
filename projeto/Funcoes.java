package projeto;

import projeto.Personagens.Personagem;
import projeto.Time.*;
import projeto.Personagens.*;

public class Funcoes {

	public static void vez(Personagem vez, String time) {
		System.out.println("<------------ Vez do time " + time + " ------------> \n");
		System.out.println("Vez de(a) " + vez.getNome() + "\n" + vez.nomehabilidade1() + "\n" + vez.nomehabilidade2()
				+ "\n" + vez.nomehabilidade3() + "\n");
	}

	public static void testarCura(int escolha, Personagem vez) {
		switch (escolha) {
			case 1:
				vez.VerificarHabilidade1();
				break;
			case 2:
				vez.VerificarHabilidade2();
				break;
			case 3:
				vez.VerificarHabilidade3();
				break;
		}

	}

	public static void espacamento() {
		for (int i = 1; i < 100; i++) {
			System.out.println();
		}
	}

	public static void mirar(int escolha, Personagem vez, Personagem alvo) {
		switch (escolha) {
			case 1:
				System.out.println(vez.nomehabilidade1());
				vez.habilidade1(alvo);
				break;
			case 2:
				System.out.println(vez.nomehabilidade2());
				vez.habilidade2(alvo);

				break;
			case 3:
				System.out.println(vez.nomehabilidade3());
				vez.habilidade3(alvo);

				break;

		}
	}

	public static void resetarVez(Personagem vez) {
		vez.setAtacou(true);
	}

	public static void statusAzul(Personagem Azul1, Personagem Azul2, Personagem Azul3) {

		System.out
				.println("Nome:" + Azul1.getNome() + "     Nome: " + Azul2.getNome() + "     Nome: " + Azul3.getNome());
		System.out.println(
				"Vida: " + Azul1.getVida() + "     Vida: " + Azul2.getVida() + "     Vida: " + Azul3.getVida());
		System.out.println(
				"Mana: " + Azul1.getMana() + "     Mana: " + Azul2.getMana() + "     Mana: " + Azul3.getMana());
		System.out.println("Armadura: " + Azul1.getArmadura() + "   Armadura: " + Azul2.getArmadura() + "   Armadura: "
				+ Azul3.getArmadura() + "\n\n");

	}

	public static void statusVermelho(Personagem Vermelho1, Personagem Vermelho2, Personagem Vermelho3) {

		System.out.println("Nome:" + Vermelho1.getNome() + "     Nome: " + Vermelho2.getNome() + "     Nome: "
				+ Vermelho3.getNome());
		System.out.println("Vida: " + Vermelho1.getVida() + "     Vida: " + Vermelho2.getVida() + "     Vida: "
				+ Vermelho3.getVida());
		System.out.println("Mana: " + Vermelho1.getMana() + "     Mana: " + Vermelho2.getMana() + "     Mana: "
				+ Vermelho3.getMana());
		System.out.println("Armadura: " + Vermelho1.getArmadura() + "   Armadura: " + Vermelho2.getArmadura()
				+ "   Armadura: " + Vermelho3.getArmadura() + "\n\n");

	}

	public static void vivoMortoVermelho(Personagem vermelho1, Personagem vermelho2, Personagem vermelho3) {
		System.out.println(vermelho1.isViva() ? "[1]" + vermelho1.getNome() : "[1] Morto");
		System.out.println(vermelho2.isViva() ? "[2]" + vermelho2.getNome() : "[2] Morto");
		System.out.println(vermelho3.isViva() ? "[3]" + vermelho3.getNome() : "[3] Morto");
	}

	public static Personagem alvosVermelho(Personagem vermelho1, Personagem vermelho2, Personagem vermelho3, int quem) {
		Personagem alvo = null;
		switch (quem) {
			case 1:
				alvo = vermelho1;
				System.out.println(alvo.getNome() + "  ALVO");
				break;

			case 2:
				alvo = vermelho2;
				System.out.println(alvo.getNome() + "  ALVO");
				break;
			case 3:
				alvo = vermelho3;
				System.out.println(alvo.getNome() + "  ALVO");
				break;
		}
		return alvo;
	}

	public static void vivoMortoAzul(Personagem azul1, Personagem azul2, Personagem azul3) {
		System.out.println(azul1.isViva() ? "[1]" + azul1.getNome() : "[1] Morto");
		System.out.println(azul2.isViva() ? "[2]" + azul2.getNome() : "[2] Morto");
		System.out.println(azul3.isViva() ? "[3]" + azul3.getNome() : "[3] Morto");
	}

	public static Personagem alvosAzul(Personagem azul1, Personagem azul2, Personagem azul3, int quem) {
		Personagem alvo = null;
		switch (quem) {
			case 1:
				alvo = azul1;
				System.out.println(alvo.getNome() + " ALVO");
				break;

			case 2:
				alvo = azul2;
				System.out.println(alvo.getNome() + " ALVO");
				break;
			case 3:
				alvo = azul3;
				System.out.println(alvo.getNome() + " ALVO");
				break;
		}
		return alvo;
	}

	public static void vitoria(Personagem p, Personagem p2, Personagem p3) {
		if (p.getVida() == 0 && p2.getVida() == 0 && p3.getVida() == 0) {
			System.out.println("Vitoria do time Vermelho");
		} else {
			System.out.println("Vitoria do time Azul");
		}

	}

}