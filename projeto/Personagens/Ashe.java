package projeto.Personagens;

import projeto.Atirador;

public class Ashe extends Atirador{
	
	
	public Ashe(String nome, int vida, int mana, int dano, int armadura, boolean atacou,boolean cura,boolean viva) {
		super(nome , vida, mana, dano, armadura,atacou,cura, viva);
		
		
	}

	@Override
	public void habilidade1(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else { 
			
			p.setVida(p.getVida() -(this.getDano()*2) - p.getArmadura() );
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
			
			p.setVida(p.getVida() -(p.getDano()*2) - p.getArmadura());
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
			
			p.setVida(p.getVida() -(this.getMana()*20));
			if(p.getVida() <=0) {
				p.setViva(false);
				p.setVida(0);
				
			}
		}
		
	}

	@Override
	public String nomehabilidade1() {
		// TODO Auto-generated method stub
		return "[1] Concentracao";
	}

	@Override
	public String nomehabilidade2() {
		// TODO Auto-generated method stub
		return "[2] Rajada";
	}

	@Override
	public String nomehabilidade3() {
		// TODO Auto-generated method stub
		return "[3] Flecha de Cristal Encantada";
	}

	@Override
	public void VerificarHabilidade1() {
		this.setIscura(false);		
	}

	@Override
	public void VerificarHabilidade2() {
		this.setIscura(false);		
	}

	@Override
	public void VerificarHabilidade3() {
		this.setIscura(false);		
	}

	
	
}
