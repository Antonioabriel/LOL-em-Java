package projeto;

import projeto.Personagens.Personagem;
	public abstract class Sup extends Personagem{
		public Sup(String nome, int vida, int mana, int dano, int armadura, boolean atacou,boolean cura,boolean viva) {
			super(nome, vida, mana, dano, armadura,atacou,cura,viva);
			// TODO Auto-generated constructor stub
		}

		public void setEscalar() {
			this.setVida(this.getVida() + 100);
		}
		
		public boolean podeAtacar() {
			if (!this.isAtacou() && this.isViva()) {
				return true;
			}
			return false;
		}
}
