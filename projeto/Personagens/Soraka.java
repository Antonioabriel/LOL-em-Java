package projeto.Personagens;

import projeto.Sup;

public class Soraka extends Sup{
	


	public Soraka(String nome, int vida, int mana, int dano, int armadura,boolean atacou,boolean cura,boolean viva) {
		super(nome, vida, mana, dano, armadura, atacou,cura,viva);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void habilidade1(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else {
			
			p.setVida(p.getVida() +((this.getVida()/2) + 10)+p.getArmadura());
		}
		
		
		
	}

	@Override
	public void habilidade2(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else {
			
			p.setVida(p.getVida() +((this.getVida()/2) + 10)+p.getArmadura());
		}
		
	}

	@Override
	public void habilidade3(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else {
			
			p.setVida(p.getVida() +((this.getVida()/2) + 10)+p.getArmadura());
		}
		
	}

	@Override
	public String nomehabilidade1() {
		// TODO Auto-generated method stub
		return "[1] Chamado Estelar";
	}

	@Override
	public String nomehabilidade2() {
		// TODO Auto-generated method stub
		return "[2] Infusao Astral";
	}

	@Override
	public String nomehabilidade3() {
		// TODO Auto-generated method stub
		return "[3] Desejo";
	}

	@Override
	public void VerificarHabilidade1() {
		this.setIscura(true);
		
	}

	@Override
	public void VerificarHabilidade2() {
		this.setIscura(false);
		
	}

	@Override
	public void VerificarHabilidade3() {
		this.setIscura(true);
		
	}

	
}
