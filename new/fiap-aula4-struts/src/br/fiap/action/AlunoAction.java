package br.fiap.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import br.fiap.bean.Alunos;

@Namespace("/aluno")
public class AlunoAction extends ActionSupport {
	private static final long serialVersionUID = 1305770867193679091L;

	private Alunos aluno;
	private String mensagem;
	private List<Alunos> alunos;

	public AlunoAction() {
		aluno = new Alunos();
	}

	@Action(value = "/cadastrar", results = { @Result(name = "success", location = "/listagemAlunos.jsp"),
			@Result(name = "error", location = "/erro.jsp") })

	public String adiciona() {
		System.out.println(this.aluno);
		this.mensagem = "Tudo certo com seu cadastro";
		this.alunos.add(aluno);
		return SUCCESS;
	}

	public Alunos getAluno() {
		return aluno;
	}

	public void setAluno(Alunos aluno) {
		this.aluno = aluno;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
