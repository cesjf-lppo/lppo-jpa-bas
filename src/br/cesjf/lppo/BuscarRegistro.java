package br.cesjf.lppo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author igor
 */
public class BuscarRegistro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lppo-jpa-bas-pu");
        
        EntityManager em = emf.createEntityManager();
        
        Livro livro = em.find(Livro.class, 151L);
        Livro livro2 = em.find(Livro.class, 1L);
        Livro livro3 = em.find(Livro.class, 2L);
        System.out.println(livro);
        System.out.println(livro2);
        System.out.println(livro3);
        
    }
    
}
