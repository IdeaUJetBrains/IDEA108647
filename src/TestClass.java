import data.Testtable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Olga Pavlova on 10/29/2015.
 */
public class TestClass {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Testtable testT = new Testtable();
        testT.setFirstnameunique("www");
        entityManager.persist(testT);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
