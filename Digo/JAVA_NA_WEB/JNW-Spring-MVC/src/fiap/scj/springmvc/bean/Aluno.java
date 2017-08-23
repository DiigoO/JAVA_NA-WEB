package fiap.scj.springmvc.bean;

public class Aluno {
	private String nome;
	private String dataNasc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", dataNasc=" + dataNasc + "]";
	}
	
}