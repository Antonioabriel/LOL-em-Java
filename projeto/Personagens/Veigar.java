package projeto.Personagens;


import projeto.Mago;

public class Veigar extends Mago{
	


	public Veigar(String nome, int vida, int mana, int dano, int armadura,boolean atacou,boolean cura,boolean viva) {
		super(nome, vida, mana, dano, armadura, atacou,cura,viva);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void habilidade1(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else { 
			
			p.setVida(p.getVida() -(this.getMana() + p.getMana()) - p.getArmadura());
			this.setMana(this.getMana() + 100);
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
			
			p.setVida(p.getVida() - this.getMana());
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
			if (this.getMana() > 1500) {
				p.setVida(p.getVida() - (this.getMana()*2));
				if(p.getVida() <=0) {
					p.setViva(false);
					p.setVida(0);
					
				}
			}
			
		}
	}

	@Override
	public String nomehabilidade1() {
		
		return "[1] Golpe Maligno";
	}

	@Override
	public String nomehabilidade2() {
		// TODO Auto-generated method stub
		return "[2] Materia Escura";
	}

	@Override
	public String nomehabilidade3() {
		// TODO Auto-generated method stub
		return "[3] Explosao Primordial";
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
