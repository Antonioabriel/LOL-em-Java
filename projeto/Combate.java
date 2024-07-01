package projeto;

import java.util.Scanner;

import projeto.Personagens.Personagem;
import projeto.Time.Azul;
import projeto.Time.Vermelho;

public class Combate {
	Personagem alvo, vez;
	String time;

	Scanner tt = new Scanner(System.in);

	public void fight(Vermelho v, Azul a) {

		Personagem azul1 = a.Personagem1();
		Personagem azul2 = a.Personagem1();
		Personagem azul3 = a.Personagem1();
		Personagem vermelho1 = v.Personagem1();
		Personagem vermelho2 = v.Personagem1();
		Personagem vermelho3 = v.Personagem1();

		while ((azul1.getVida() > 0 || azul2.getVida() > 0 || azul3.getVida() > 0)
				&& (vermelho2.getVida() > 0 || vermelho1.getVida() > 0 || vermelho3.getVida() > 0)) {

			while (true) {
				if (azul1.podeAtacar()) {
					vez = azul1;
					time = "Azul";
					break;

				} else if (vermelho1.podeAtacar()) {
					vez = vermelho1;
					time = "Vermelho";
					break;
				} else if (azul2.podeAtacar()) {
					vez = azul2;
					time = "Azul";
					break;

				} else if (vermelho2.podeAtacar()) {
					vez = vermelho2;
					time = "Vermelho";
					break;
				} else if (azul3.podeAtacar()) {
					vez = azul3;
					time = "Azul";
					break;
				} else if (vermelho3.podeAtacar()) {
					vez = vermelho3;
					time = "Vermelho";
					break;
				} else {
					vermelho1.setAtacou(false);
					vermelho2.setAtacou(false);
					vermelho3.setAtacou(false);
					azul1.setAtacou(false);
					azul3.setAtacou(false);
					azul2.setAtacou(false);
					azul1.setEscalar();
					azul1.setMana(azul1.getMana() + 100);
					azul2.setMana(azul1.getMana() + 100);
					azul3.setMana(azul1.getMana() + 100);
					azul2.setEscalar();
					azul3.setEscalar();
					vermelho1.setEscalar();
					vermelho2.setEscalar();
					vermelho3.setEscalar();
					vermelho1.setMana(vermelho1.getMana() + 100);
					vermelho2.setMana(vermelho2.getMana() + 100);
					vermelho3.setMana(vermelho3.getMana() + 100);
					continue;
				}
			}
			Funcoes.vez(vez, time);
			int escolha = 1;
			while (true) {

				try {

					escolha = tt.nextInt();
					break;
				} catch (Exception e) {
					tt.nextLine();
					System.out.println("Digite um numero por favor");
					continue;

				}

			}

			// ----------------------------------------------------//

			Funcoes.testarCura(escolha, vez);

			// ----------------------------------------------------//
			while (true) {
				try {
					if (time == "Vermelho") {

						if (vez.isIscura() == true) {
							System.out.println("----- Aliados -----");
							Funcoes.vivoMortoVermelho(vermelho1, vermelho2, vermelho3);
							int quem = tt.nextInt();

							alvo = Funcoes.alvosVermelho(vermelho1, vermelho2, vermelho3, quem);

						} else {
							System.out.println("----- Inimigos -----");
							Funcoes.vivoMortoAzul(azul1, azul2, azul3);
							int quem = tt.nextInt();

							alvo = Funcoes.alvosAzul(azul1, azul2, azul3, quem);

						}

						// ------------------------------------------------------//
					} else {
						if (vez.isIscura() == true) {
							System.out.println("----- Aliados -----");
							Funcoes.vivoMortoAzul(azul1, azul2, azul3);
							int quem = tt.nextInt();

							alvo = Funcoes.alvosAzul(azul1, azul2, azul3, quem);

						} else {
							System.out.println("----- Inimigos -----");
							Funcoes.vivoMortoVermelho(vermelho1, vermelho2, vermelho3);
							int quem = tt.nextInt();

							alvo = Funcoes.alvosVermelho(vermelho1, vermelho2, vermelho3, quem);

						}

					}
					break;
				} catch (Exception e) {
					tt.nextLine();
					System.out.println("digite um numero...");
					continue;
				}
			}

			// -----------------------------------------------------------------------------//
			Funcoes.espacamento();

			// -----------------------------------------------------------------------------//

			Funcoes.mirar(escolha, vez, alvo);

			Funcoes.resetarVez(vez);
			Funcoes.statusAzul(azul1, azul2, azul3);
			System.out.println("<--------------------------->\n");
			Funcoes.statusVermelho(vermelho1, vermelho2, vermelho3);
		}

		Funcoes.vitoria(azul1, azul2, azul3);

	}
}
