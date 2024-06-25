package projeto;

import projeto.Personagens.Personagem;

public abstract class Tank extends Personagem{
	public Tank(String nome, int vida, int mana, int dano, int armadura, boolean atacou,boolean cura,boolean viva) {
		super(nome, vida, mana, dano, armadura,atacou,cura,viva);
		// TODO Auto-generated constructor stub
	}

	

	public void setEscalar() {
		this.setArmadura(this.getArmadura() + 20);
	}

	public boolean podeAtacar() {
		if (!this.isAtacou() && this.isViva()) {
			return true;
		}
		return false;
	}
}
