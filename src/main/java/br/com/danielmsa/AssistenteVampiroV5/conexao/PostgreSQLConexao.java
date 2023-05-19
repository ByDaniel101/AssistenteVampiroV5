package br.com.danielmsa.AssistenteVampiroV5.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLConexao {
	private String url;
	private String nomeBD;
	private String user;
	private String senha;
	private Connection connection;
	private Statement statment;
	
	public PostgreSQLConexao() {}
	
	public PostgreSQLConexao(final String nomeBD, final String usuario, final String senha) {
		this.url = "jdbc:postgresql://localhost:5432/";
		this.nomeBD = nomeBD;
		this.user = usuario;
		this.senha = senha;
		
	}
	
	public void conectar() throws SQLException, ClassNotFoundException{
		
			
			if(getUrl().equals(null)) {
				setUrl("jdbc:postgresql://localhost:5432/");
			}
			
			Class.forName("org.postgresql.Driver");
			
			setConnection(DriverManager.getConnection(getUrl()+getNomeBD(), getUser(), getSenha()));
			setStatment(getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY));

	}
	
	public void desconectar() throws SQLException {
			if(!getConnection().isClosed())
				getConnection().close();
	}
	
	public ResultSet query(String query){
		try {
			return getStatment().executeQuery(query);
			
		}catch (SQLException ex) {
			
			ex.printStackTrace();
			
			return null;
		}
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Connection getConnection() {
		return this.connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Statement getStatment() {
		return statment;
	}

	public void setStatment(Statement statment) {
		this.statment = statment;
	}

	public String getNomeBD() {
		return nomeBD;
	}

	public void setNomeBD(String nomeBD) {
		this.nomeBD = nomeBD;
	}
}
