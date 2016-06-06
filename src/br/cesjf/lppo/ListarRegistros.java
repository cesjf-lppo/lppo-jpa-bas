package br.cesjf.lppo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author igor
 */
public class ListarRegistros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lppo-jpa-bas-pu");

        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT l FROM Livro l");
        List<Livro> livros = q.getResultList();
        
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

}
