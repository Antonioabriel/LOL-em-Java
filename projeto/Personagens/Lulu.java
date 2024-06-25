package projeto.Personagens;

import projeto.Sup;

public class Lulu extends Sup{
	


	public Lulu(String nome, int vida, int mana, int dano, int armadura,boolean atacou,boolean cura,boolean viva) {
		super(nome, vida, mana, dano, armadura, atacou,cura,viva);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void habilidade1(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else { 
			
			p.setDano(p.getDano() - 20);
			if(p.getVida() <=0) {
				p.setViva(false);
				p.setVida(0);
				
			}
		}
	}

	@Override
	public void habilidade2(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else { 
			
			p.setArmadura(p.getArmadura() + (p.getArmadura()/2));;
			if(p.getVida() <=0) {
				p.setViva(false);
				p.setVida(0);
				
			}
		}
		
	}

	@Override
	public void habilidade3(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else { 
			
			p.setVida(p.getVida() + 100);
			p.setArmadura(p.getArmadura() + 100);
			if(p.getVida() <=0) {
				p.setViva(false);
				p.setVida(0);
				
			}
		}
	}

	@Override
	public String nomehabilidade1() {
		
		return "[1] Lanca-Purpurina";
	}

	@Override
	public String nomehabilidade2() {
		
		return "[2] Socorro, Pix!!";
	}

	@Override
	public String nomehabilidade3() {
		
		return "[3] Crescimento Virente";
	}

	@Override
	public void VerificarHabilidade1() {
		this.setIscura(false);
		
	}

	@Override
	public void VerificarHabilidade2() {
		this.setIscura(true);
		
	}

	@Override
	public void VerificarHabilidade3() {
		this.setIscura(false);
		
	}

	
}



