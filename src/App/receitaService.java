package App;

import java.util.ArrayList;

public class receitaService {

	Receita receita;

	ArrayList<Receita> listaReceita = new ArrayList<Receita>();

	public void addReceitas(Receita receita) {
		listaReceita.add(receita);
	}

	public double calcularRendaAnual() {

		double imposto = 0;

		for (int i = 0; i < listaReceita.size(); i++) {
			if (this.listaReceita.get(i).getRendaAnual() <= 4000) {
				imposto = this.listaReceita.get(i).getRendaAnual();
			}

			else if (this.listaReceita.get(i).getRendaAnual() >= 4001
					&& this.listaReceita.get(i).getRendaAnual() <= 9000) {
				imposto = this.listaReceita.get(i).getRendaAnual() * 0.058;
			}

			else if (this.listaReceita.get(i).getRendaAnual() >= 9001
					&& this.listaReceita.get(i).getRendaAnual() <= 25000) {
				imposto = this.listaReceita.get(i).getRendaAnual() * 0.15;
			}

			else if (this.listaReceita.get(i).getRendaAnual() >= 25001
					&& this.listaReceita.get(i).getRendaAnual() <= 35000) {
				imposto = this.listaReceita.get(i).getRendaAnual() * 0.275;
			}

			else if (this.listaReceita.get(i).getRendaAnual() >= 35001) {
				imposto = this.listaReceita.get(i).getRendaAnual() * 0.3;
			}

		}

		return imposto;

	}

	public double maiorImposto() {
		double maior = 0;

		for (int i = 0; i < listaReceita.size(); i++) {
			if (this.listaReceita.get(i).getRendaAnual() > maior) {
				maior = this.listaReceita.get(i).getRendaAnual();

			}
		}
		return maior;
	}

	
	
	
	
	
	
	
	
	
	
}
