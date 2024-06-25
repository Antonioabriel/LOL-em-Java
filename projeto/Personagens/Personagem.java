package projeto.Personagens;
	public abstract class Personagem {
		
		
		private String nome;
		private int vida, mana, dano, armadura;
		private boolean atacou,iscura,viva;
		
		
		
		
		
		public Personagem(String nome, int vida, int mana, int dano, int armadura, boolean atacou,boolean cura,boolean viva) {
			this.nome = nome;
			this.vida = vida;
			this.mana = mana;
			this.dano = dano;
			this.armadura = armadura;
			this.atacou = atacou;
			this.iscura = cura;
			this.viva = viva;
		}
		public abstract void setEscalar();
		public abstract boolean podeAtacar();
		public abstract void VerificarHabilidade1();
		public abstract void VerificarHabilidade2();
		public abstract void VerificarHabilidade3();

		public abstract void habilidade1(Personagem p);
		
		public abstract void habilidade2(Personagem p);
		
		public abstract void habilidade3(Personagem p);
		public abstract String nomehabilidade1();
		public abstract String nomehabilidade2();
		public abstract String nomehabilidade3();

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getMana() {
			return mana;
		}

		public void setMana(int mana) {
			this.mana = mana;
		}

		public int getArmadura() {
			return armadura;
		}

		public void setArmadura(int armadura) {
			this.armadura = armadura;
		}

		public int getVida() {
			return vida;
		}

		public void setVida(int vida) {
			this.vida = vida;
		}

		public int getDano() {
			return dano;
		}

		public void setDano(int dano) {
			this.dano = dano;
		}

		public boolean isAtacou() {
			return atacou;
		}

		public void setAtacou(boolean atacou) {
			this.atacou = atacou;
		}

		public boolean isIscura() {
			return iscura;
		}

		public void setIscura(boolean iscura) {
			this.iscura = iscura;
		}

		public boolean isViva() {
			return viva;
		}

		public void setViva(boolean viva) {
			this.viva = viva;
		}

		
}
