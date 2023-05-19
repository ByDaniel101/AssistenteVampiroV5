package br.com.danielmsa.AssistenteVampiroV5;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import br.com.danielmsa.AssistenteVampiroV5.conexao.PostgreSQLConexao;

public class PostgreSQLConexaoTests {
	
	private PostgreSQLConexao dbconect = new PostgreSQLConexao("AssistenteVampiroV5", "postgres", "root");

	@Test
	public void tentativaDeConexao() {
		Exception erro = null;
		boolean conexaoAberta = false;
		
		try { 
			dbconect.conectar();
			conexaoAberta = !dbconect.getConnection().isClosed();
		} catch (Exception e) {
			erro = e;
		}
		
		
		assertNull(erro);
		assertTrue(conexaoAberta);
		
		try {
			dbconect.desconectar();
		} catch (SQLException e) {
		}
	}
	
	@Test
	public void tentativaDeDesconexao() {
		Exception erro = null;
		boolean conexaoAberta = false;
		
		try { 
			dbconect.conectar();
			conexaoAberta = !dbconect.getConnection().isClosed();
		} catch (Exception e) {
			erro = e;
		}
		
		assertTrue(conexaoAberta);
		
		try {
			dbconect.desconectar();
			conexaoAberta = !dbconect.getConnection().isClosed();
		} catch (Exception e) {
			erro = e;
		}
		
		assertNull(erro);
		assertFalse(conexaoAberta);
	}
	
	@Test
	public void verificacaoURL () {
		
		try { 
			dbconect.conectar();
			dbconect.desconectar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals("jdbc:postgresql://localhost:5432/", dbconect.getUrl());
		
	}
	
}
