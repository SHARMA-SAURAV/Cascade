import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aadharcard adharcard=new Aadharcard();
		adharcard.setId(600);
		adharcard.setName("huehue");
		person per=new person();
		per.setId(6);
		per.setAadharcard(adharcard);
		per.setAddress("Ghaziabad");
		per.setName("huehue");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		person dbper=entityManager.find(person.class, 2);
		entityTransaction.begin();
		entityManager.merge(per);
		
//		entityManager.persist(per);
//		entityManager.persist(adharcard);
		
		
//		entityManager.remove(dbper);
//		
		
		
		
		entityTransaction.commit();
	}

}
