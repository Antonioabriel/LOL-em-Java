package projeto.Personagens;

import projeto.Sup;

public class Braum extends Sup{
	


	public Braum(String nome, int vida, int mana, int dano, int armadura,boolean atacou,boolean cura,boolean viva) {
		super(nome, vida, mana, dano, armadura, atacou,cura,viva);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void habilidade1(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else { 
			
			this.setArmadura(this.getArmadura() + (p.getArmadura()/2));
			
		
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
			
			p.setArmadura(p.getArmadura() + (this.getArmadura()/2));
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
			
			p.setArmadura(p.getArmadura() - (p.getArmadura()/5) );
			if(p.getVida() <=0) {
				p.setViva(false);
				p.setVida(0);
				
			}
		}
		
	}

	@Override
	public String nomehabilidade1() {
		// TODO Auto-generated method stub
		return "[1] Mordida do Inverno";
	}

	@Override
	public String nomehabilidade2() {
		// TODO Auto-generated method stub
		return "[2] Eu te Protejo";
	}

	@Override
	public String nomehabilidade3() {
		// TODO Auto-generated method stub
		return "[3] Fisura Glacial";
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
