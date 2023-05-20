package br.com.danielmsa.AssistenteVampiroV5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.danielmsa.AssistenteVampiroV5.componentes.Usuario;

public class App {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("AssistenteVampiroV5");
	private static EntityManager em = emf.createEntityManager();
	
	
    public static void main( String[] args ) {
    	
    	Usuario user = em.find(Usuario.class, 1);
    	
        System.out.println( user.getNome() );
    }
}
