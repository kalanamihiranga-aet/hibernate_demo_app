import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
    public static void main(String[] args) {
        // =======================
        // ======== save customer ======
//        Customer c1 = new Customer("C002", "Nimal", "Colombo", 25000);
//        Configuration configuration = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Customer.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(c1);
//        transaction.commit();
//        // =======================
//        session.close();
//        sessionFactory.close();
        // =======================

        // ================== Find one ================
        Customer c1 = null;
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        c1 = session.find(Customer.class, "C002"); // hql => (FROM customer WHERE id:id)
        System.out.println("customer new " + c1);
        session.close();
        sessionFactory.close();
    }
}
