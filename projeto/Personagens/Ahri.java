package projeto.Personagens;


import projeto.Mago;

public class Ahri extends Mago{
	


	public Ahri(String nome, int vida, int mana, int dano, int armadura,boolean atacou,boolean cura,boolean viva) {
		super(nome, vida, mana, dano, armadura, atacou,cura,viva);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void habilidade1(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else { 
			
			p.setVida(p.getVida() -(this.getMana() + this.getDano() + 10) - p.getArmadura()*2);
			this.setVida(this.getVida()+ p.getVida()/10);
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
			
			p.setVida(p.getVida() -(this.getMana()*3) - p.getArmadura());
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
			
			p.setVida(p.getVida() -(p.getArmadura()*10 ));
			if(p.getVida() <=0) {
				p.setViva(false);
				p.setVida(0);
				
			}
		}
		
	}

	@Override
	public String nomehabilidade1() {
		
		return "[1] Orbe da Ilusao";
	}

	@Override
	public String nomehabilidade2() {
		// TODO Auto-generated method stub
		return "[2] Fogo da Raposa";
	}

	@Override
	public String nomehabilidade3() {
		// TODO Auto-generated method stub
		return "[3] Impeto Espiritual";
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
