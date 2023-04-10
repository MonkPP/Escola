import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
/**
 *Monyk
 */
public class Teste{
public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
    
    EntityManager em = factory.createEntityManager();
    
    Aluno aluno = new Aluno();
    aluno.setNome("Maria");
    aluno.setCpf("00232165478");
    aluno.setEndereco("RuTal");
    aluno.setEmail("monykom");
    aluno.setTel("659 9632-8541");
    
    
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.persist(aluno);
    tx.commit();
    em.close();
    factory.close();
}
}