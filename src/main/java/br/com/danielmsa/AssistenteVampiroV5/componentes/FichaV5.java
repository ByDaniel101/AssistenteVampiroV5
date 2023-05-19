package br.com.danielmsa.AssistenteVampiroV5.componentes;

import java.io.Serializable;

public class FichaV5 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	
	private String Nome;
	private String predador;
	private String conceito;
	private String senhor;
	private String cla;
	private String geracao;
	
	private int forca;
	private int destreza;
	private int vigor;
	
	private int carisma;
	private int manipulacao;
	private int autocontrole;
	
	private int inteligencia;
	private int raciocinio;
	private int determinacao;
	
	
	
	// Gets e Sets
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getPredador() {
		return predador;
	}
	public void setPredador(String predador) {
		this.predador = predador;
	}
	public String getConceito() {
		return conceito;
	}
	public void setConceito(String conceito) {
		this.conceito = conceito;
	}
	public String getSenhor() {
		return senhor;
	}
	public void setSenhor(String senhor) {
		this.senhor = senhor;
	}
	public String getCla() {
		return cla;
	}
	public void setCla(String cla) {
		this.cla = cla;
	}
	public String getGeracao() {
		return geracao;
	}
	public void setGeracao(String geracao) {
		this.geracao = geracao;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getVigor() {
		return vigor;
	}
	public void setVigor(int vigor) {
		this.vigor = vigor;
	}
	public int getCarisma() {
		return carisma;
	}
	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	public int getManipulacao() {
		return manipulacao;
	}
	public void setManipulacao(int manipulacao) {
		this.manipulacao = manipulacao;
	}
	public int getAutocontrole() {
		return autocontrole;
	}
	public void setAutocontrole(int autocontrole) {
		this.autocontrole = autocontrole;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getRaciocinio() {
		return raciocinio;
	}
	public void setRaciocinio(int raciocinio) {
		this.raciocinio = raciocinio;
	}
	public int getDeterminacao() {
		return determinacao;
	}
	public void setDeterminacao(int determinacao) {
		this.determinacao = determinacao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
