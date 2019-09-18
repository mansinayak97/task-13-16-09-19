import java.util.Scanner;
import javax.persistence.criteria.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class CRUD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Insert");
		System.out.println("Press 2 for Retrieve");
		System.out.println("Press 3 for Update");
		System.out.println("Press 4 for Delete");
		int choice=sc.nextInt();
		SessionFactory sf= Util.getSessionFactory();
		Session session=sf.openSession();
		switch(choice){
		case 1:
		Employee e1=new Employee(101,"AAA",10000);
		Employee e2=new Employee(102,"BBB",15000);
		Employee e3=new Employee(103,"CCC",20000);
		Transaction tx=session.beginTransaction();
		session.save(e1);session.save(e2);session.save(e3);
		tx.commit();session.close();
		System.out.println("RECORD ADDED");
		break;
		
		case 2:
			System.out.println("");
			Employee emp=session.get(Employee.class, 102);
			System.out.println("Retrival using QBI: " +emp);
			break;
			
		case 3:
			System.out.println("Enter eNo:");
			int eNo=sc.nextInt();
			Employee e4=new Employee(101,"ZZZ",15000);
			Transaction tx1=session.beginTransaction();
			session.update(e4);
			tx1.commit();session.close();
			System.out.println("RECORD Updated");
			break;
			
		case 4:
			System.out.println("enter eNo to delete:");
			int eNoDelete=sc.nextInt();
			Employee e5=new Employee(eNoDelete);
			Transaction tx2=session.beginTransaction();
			session.delete(e5);  
		}
	}

}
