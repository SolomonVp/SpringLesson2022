package hibernateTest;

import hibernateTest.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();


// --------------- Удаляем 1 объект
//            Employee emp  = session.get(Employee.class, 1);
//            session.delete(emp);

// --------------- Удаляем несколько строк
            session.createQuery("DELETE Employee WHERE name = 'Sam'").executeUpdate();


            session.getTransaction().commit();
            System.out.println("Done!");

        } catch (HibernateException e) {
            throw new RuntimeException(e);
        } finally {
            factory.close();
        }


    }
}
