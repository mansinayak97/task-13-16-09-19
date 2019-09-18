import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class Retrieval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf= Util.getSessionFactory();
		Session session=sf.openSession();
		//using Criteria
		Criteria cr=session.createCriteria(Employee.class);
		List<Employee> l1=cr.list();
		System.out.println(l1);
		for(Employee x:l1)
			System.out.println(x);
			System.out.println("-----------------------------............------------------------");
		//using Restrictions
		Criterion crt=Restrictions.gt("sal",10000);
		cr.add(crt);
		Order o1=Order.desc("sal");
		cr.addOrder(o1);
		List<Employee> l2=cr.list();
		for(Employee x:l2)
			System.out.println(x);
			System.out.println("-----------------------------............------------------------");
		//using projections
		Criteria cr1=session.createCriteria(Employee.class);
		ProjectionList plist=Projections.projectionList();
		Projection p1=Projections.property("sal");
		Projection p2=Projections.property("eName");
		plist.add(p1);plist.add(p2);
		cr1.setProjection(plist);
		List<Object[]> emp=cr1.list();
		for(Object obj[]:emp)
		{
			for(Object objs:obj)
				System.out.println(objs);
		}
		session.close();
	}

}
