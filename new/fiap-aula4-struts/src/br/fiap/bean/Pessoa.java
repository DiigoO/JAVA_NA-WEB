package br.fiap.bean;

import java.util.Date;

import org.apache.struts2.convention.annotation.Namespace;

import com.opensymphony.xwork2.ActionSupport;

public class Pessoa{

	private String nome;
	private Date dataNasc;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNasc=" + dataNasc + "]";
	}
	
	

}
