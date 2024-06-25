package projeto.Personagens;



import projeto.Tank;

public class Mordekaise extends Tank{
	


	public Mordekaise(String nome, int vida, int mana, int dano, int armadura,boolean atacou,boolean cura,boolean viva) {
		super(nome, vida, mana, dano, armadura, atacou,cura,viva);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void habilidade1(Personagem p) {
		if(!p.isViva()) {
			System.out.println("Ja esta MORTO");
			
		}else { 
			
			p.setVida(p.getVida() -(this.getMana()+ this.getArmadura()) - p.getArmadura());
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
			
			this.setArmadura(this.getArmadura() + 20);
			
			this.setVida(this.getVida() + 20);
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
			
			p.setVida(p.getVida() - (p.getVida()/3));
			if(p.getVida() <=0) {
				p.setViva(false);
				p.setVida(0);
				
			}
		}
		
	}

	@Override
	public String nomehabilidade1() {
		
		return "[1] Obliterar";
	}

	@Override
	public String nomehabilidade2() {
		// TODO Auto-generated method stub
		return "[2] Indestrutivel";
	}

	@Override
	public String nomehabilidade3() {
		// TODO Auto-generated method stub
		return "[3] Reino da Morte";
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
