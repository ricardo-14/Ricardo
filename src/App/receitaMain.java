package App;

import javax.swing.JOptionPane;

public class receitaMain {

	public static void main(String[] args) {
		
		Receita receita;
		receitaService srvReceita = new receitaService();
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome ");
		
		while(!nome.equalsIgnoreCase("fim")) {
			
			String cpf = JOptionPane.showInputDialog("Digite o seu cpf ");
			String uf = JOptionPane.showInputDialog("Digite o seu UF");
			double rendaAnual = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua renda anual"));
			
			receita = new Receita(nome, cpf, uf, rendaAnual);
			
			srvReceita.addReceitas(receita);
			
			nome = JOptionPane.showInputDialog("Digite o seu nome ");
			
			
		}
		
		JOptionPane.showMessageDialog(null, "Teste"+ srvReceita.maiorImposto());
		
	}

}
