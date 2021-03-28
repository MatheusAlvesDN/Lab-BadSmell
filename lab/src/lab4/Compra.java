package lab4;

class Compra {
	private Anuncio anuncio;
	private int diasAnuncio;
	
	public Compra(Anuncio anuncio, int diasAnuncio) {
		this.anuncio = anuncio;
		this.diasAnuncio = diasAnuncio;
	}
	public int getDiasAnuncio() {
		return diasAnuncio;
	}
	public Anuncio getAnuncio() {
		return anuncio;
	}
	public double getTotal() {
		double totalParcial = 0;
		if(this.anuncio.getCodigoPreco() == Anuncio.IMAGEM) {
			totalParcial += 2;
		}
		if(this.anuncio.getCodigoPreco() == Anuncio.VIDEO)
				totalParcial += this.diasAnuncio * 3;
		if(this.anuncio.getCodigoPreco() == Anuncio.TEXTO) {
				totalParcial += 1.5;
				if (this.diasAnuncio > 3)
					totalParcial += (this.diasAnuncio - 3) * 1.5;
		}
		return totalParcial;
	}
	
	public int getPontos() {
		int pontosFrequentes = 1;
		if ((anuncio.getCodigoPreco() == Anuncio.VIDEO) && this.getDiasAnuncio() > 1)
			pontosFrequentes++;
		return pontosFrequentes;
	}
	
	public String getResultado() {
		return "\t" + this.anuncio.getDescricao() + "\t" + String.valueOf(this.getTotal()) + "\n";
		
	}
	
}