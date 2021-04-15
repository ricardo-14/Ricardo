package App;

public class Receita {

	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	public Receita(String nome, String cpf, String uf, double rendaAnual) {
		this.nome = nome;
		this.cpf = cpf;
		this.uf = uf;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
}
