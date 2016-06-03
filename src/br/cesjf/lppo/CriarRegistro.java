package br.cesjf.lppo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author igor
 */
public class CriarRegistro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro livro =  new Livro();
        livro.setTitulo("O Senhor dos Anéis");
        livro.setAutor("JRR Tolkien");
        livro.setAno(1937);
        livro.setPreco(34.23f);
        
        System.out.println("Hello World!");
        System.out.println(livro);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lppo-jpa-bas-pu");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
        
        //em.close();
        //emf.close();
    }
    
}
