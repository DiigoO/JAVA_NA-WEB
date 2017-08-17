package br.fiap.bean;

import java.util.Date;

public class Alunos {
	public String nome;
	public String rg;
	public Date dataDeNasc;
	public String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getDataDeNasc() {
		return dataDeNasc;
	}
	public void setDataDeNasc(Date dataDeNasc) {
		this.dataDeNasc = dataDeNasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Alunos [nome=" + nome + ", rg=" + rg + ", dataDeNasc=" + dataDeNasc + ", email=" + email + "]";
	}
	
}
