package projeto.Time;

import java.util.Scanner;

import projeto.Funcoes;
import projeto.Personagens.Ahri;
import projeto.Personagens.Ashe;
import projeto.Personagens.Braum;
import projeto.Personagens.JarvanIV;
import projeto.Personagens.Lulu;
import projeto.Personagens.Mordekaise;
import projeto.Personagens.Personagem;
import projeto.Personagens.Sion;
import projeto.Personagens.Soraka;
import projeto.Personagens.Varus;
import projeto.Personagens.Veigar;
import projeto.Personagens.Vladmir;
import projeto.Personagens.kindred;

public class Vermelho implements Time {

	Scanner tt = new Scanner(System.in);

	@Override
	public Personagem Personagem1() {
		while (true) {

			try {
				System.out
						.println("Vamos Escolher os Personagens da equipe Vermelho\nPrimeiro Vamos escolher a classe");
				while (true) {
					System.out.println("[1] Ranger\n[2] Sup\n[3] Mago\n[4] Tank");
					int classe = tt.nextInt();
					switch (classe) {
						case 1:
							System.out.println(
									"A classe Ranger e conhecida por tem alto dano mas pouca vida. Vamos ver seus Campeoes");
							System.out.println("[1] Varus\n[2] Kindred\n[3] Ashe\n[4] Voltar");
							int range = tt.nextInt();
							switch (range) {
								case 1:
									Personagem p1 = new Varus("Varus", 1000, 500, 100, 20, false, false, true);
									Funcoes.espacamento();
									System.out.println("Varus adicionado a equipe Vermelho");
									return p1;
								case 2:
									Personagem p2 = new kindred("Kindred", 1300, 450, 70, 30, false, false, true);
									Funcoes.espacamento();
									System.out.println("Kindred adicionado a equipe Vermelho");
									return p2;
								case 3:
									Personagem p3 = new Ashe("Ashe", 900, 500, 110, 19, false, false, true);
									Funcoes.espacamento();
									System.out.println("Ashe adicionado a equipe Vermelho");
									return p3;

								default:
									System.out.println("Voltando");
									continue;
							}

						case 2:
							System.out.println(
									"A classe Sup e conhecida por ter pouco dano mas ser uma otima ajuda. Vamos ver seus Campeoes");
							System.out.println("[1] Soraka\n[2] Braum\n[3] Lulu\n[4] Voltar");
							int sup = tt.nextInt();
							switch (sup) {
								case 1:
									Personagem p1 = new Soraka("Soraka", 1500, 700, 40, 15, false, false, true);
									Funcoes.espacamento();
									System.out.println("Soraka adicionado a equipe Vermelho");
									return p1;
								case 2:
									Personagem p2 = new Braum("Braum", 2000, 600, 30, 50, false, false, true);
									Funcoes.espacamento();
									System.out.println("Braum adicionado a equipe Vermelho");
									return p2;
								case 3:
									Personagem p3 = new Lulu("Lulu", 800, 1200, 35, 30, false, false, true);
									Funcoes.espacamento();
									System.out.println("Lulu adicionado a equipe Vermelho");
									return p3;

								default:
									System.out.println("Voltando");
									continue;
							}
						case 3:
							System.out.println(
									"A classe Mago e conhecida por ter alto dano mas pouca vida. Vamos ver seus Campeoes");
							System.out.println("[1] Vladmir\n[2] Ahri\n[3] Veigar\n[4] Voltar");
							int mago = tt.nextInt();
							switch (mago) {
								case 1:
									Personagem p1 = new Vladmir("Vladmir", 1500, 300, 90, 19, false, false, true);
									Funcoes.espacamento();
									System.out.println("Vladmir adicionado a equipe Vermelho");
									return p1;
								case 2:
									Personagem p2 = new Ahri("Ahri", 1000, 1200, 100, 19, false, false, true);
									Funcoes.espacamento();
									System.out.println("Ahri adicionado a equipe Vermelho");
									return p2;
								case 3:
									Personagem p3 = new Veigar("Veigar", 1000, 100, 200, 19, false, false, true);
									Funcoes.espacamento();
									System.out.println("Veigar adicionado a equipe Vermelho");
									return p3;

								default:
									System.out.println("Voltando");
									continue;
							}
						case 4:
							System.out.println(
									"A classe Tank e conhecida por aguenta muito dano e ajudar os aliados.Vamos ver seus Campeoes");
							System.out.println("[1] Sion\n[2] Jarvan IV\n[3] Mordekaiser\n[4] Voltar");
							int tank = tt.nextInt();
							switch (tank) {
								case 1:
									Personagem p1 = new Sion("Sion", 3000, 500, 40, 50, false, false, true);
									Funcoes.espacamento();
									System.out.println("Sion adicionado a equipe Vermelho");
									return p1;
								case 2:
									Personagem p2 = new JarvanIV("Jarvan IV", 1500, 700, 100, 40, false, false, true);
									Funcoes.espacamento();
									System.out.println("Jarvan IV adicionado a equipe Vermelho");
									return p2;
								case 3:
									Personagem p3 = new Mordekaise("Mordekaiser", 2000, 800, 70, 30, false, false,
											true);
									Funcoes.espacamento();
									System.out.println("Mordekaiser adicionado a equipe Vermelho");
									return p3;

								default:
									System.out.println("Voltando");
									continue;
							}

						default:
							System.out.println("Classe nao existente");
							continue;
					}
				}
			} catch (Exception e) {
				System.out.println("Voce não selecionou um numero");
				tt.next();
				continue;
			}
		}
	}

}
