package br.cesjf.lppo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author igor
 */
public class AlterarRegistro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lppo-jpa-bas-pu");

        EntityManager em = emf.createEntityManager();

        Livro livro = em.find(Livro.class, 151L);
        

        System.out.println("Antes:\n\t" + livro);
        em.clear();
        if (livro != null) {
            em.getTransaction().begin();
            livro.setPreco(1.1F * livro.getPreco());
            em.merge(livro);
            em.getTransaction().commit();
        }
        System.out.println("Depois:\n\t" + livro);
    }

}
