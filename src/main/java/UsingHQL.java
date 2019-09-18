import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class UsingHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=Util.getSessionFactory();
		Session session=sf.openSession();
		String hql="from Employee";
		Query q=session.createQuery(hql);
		List<Employee> li = q.list();
		for(Employee e:li)
			System.out.println(e);
		/*String hql1="Update Employee set eName='YYY' sal=30000 where eNo=101";
		Query q1=session.createQuery(hql1);
		List<Employee> li1 = q1.list();
		for(Employee e:li1)
			System.out.println(e);*/
		session.close();
	}

}
