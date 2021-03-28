package lab4;

import java.util.Enumeration;
import java.util.Vector;

class Cliente {
	private String nome;
	private Vector<Compra> compras = new Vector<Compra>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public void addCompra(Compra arg) {
		compras.addElement(arg);
	}

	public String getNome() {
		return nome;
	}
	
	public String historico() {
		double total = 0;
		int pontosFRequentes = 0;
		Enumeration<Compra> comprasAnuncio = compras.elements();
		String resultado = "Historico de compras de anuncios por " + getNome() + "\n";
		while (comprasAnuncio.hasMoreElements()) {
			Compra cada = (Compra) comprasAnuncio.nextElement();
			pontosFRequentes += cada.getPontos();
			resultado += cada.getResultado();
			total += cada.getTotal();
		}
		resultado += "Total devido é " + String.valueOf(total) + "\n";
		resultado += "Voce ganhou " + String.valueOf(pontosFRequentes) + " pontos";
		return resultado;
	}

}
