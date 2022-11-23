package hibernateTest;

import hibernateTest.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//------------Изменение ЗП одного работника --------------------------
//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1500);

//------------Изменение зп по имени
            session.createQuery("update Employee set salary = 1000 where firstName = 'Olga'").executeUpdate();


            session.getTransaction().commit();
            System.out.println("Done!");

        } catch (HibernateException e) {
            throw new RuntimeException(e);
        } finally {
            factory.close();
        }


    }
}
