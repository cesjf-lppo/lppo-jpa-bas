package br.cesjf.lppo;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author igor
 */
public class ExcluirRegistro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lppo-jpa-bas-pu");

        EntityManager em = emf.createEntityManager();

        Livro livro = em.find(Livro.class, 1L);
        

        System.out.println("Antes:\n\t" + livro);
       
        if (livro != null) {
            em.getTransaction().begin();
            em.remove(livro);
            em.getTransaction().commit();
        }
        System.out.println("Depois:\n\t" + livro);
    }

}
