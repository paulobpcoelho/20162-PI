package br.com.unieuro.java20162.model;

public class Estudante {

private String nome = null;
private int id = 0;
private String senioridade = null;
private String graduacao = null;

public Estudante(String nome, int id, String senioridade, String graduacao) {
super();
this.nome = nome;
this.id = id;
this.senioridade = senioridade;
this.graduacao = graduacao;
}
public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getSenioridade() {
return senioridade;
}

public void setSenioridade(String senioridade) {
this.senioridade = senioridade;
}

public String getGraduacao() {
return graduacao;
}

public void setGraduacao(String graduacao) {
this.graduacao = graduacao;
}

@Override
public String toString()
{
String resultado = "nome_do_estudante: " + this.getNome();
resultado += ", id_estudante: " + this.getId();
resultado += ", senioridade: " + this.getSenioridade();
resultado += ", graduacao: " + this.getGraduacao();

return resultado;

}

}