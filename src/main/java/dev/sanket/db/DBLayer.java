package dev.sanket.db;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class DBLayer
{
    private static final AnnotationConfiguration configuration = new AnnotationConfiguration();

    private static SessionFactory sessionFactory;

    public static void initialize()
    {
        sessionFactory = configuration.configure().buildSessionFactory();
    }

    public static Object fetch(String query)
    {
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        Query sessionQuery = session.createQuery(query);
        List list = sessionQuery.list();
        Object first = list.get(0);
        transaction.rollback();
        session.close();

        return first;
    }

    public static void saveOrUpdate(Object o)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try
        {
            session.save(o);
            transaction.commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            transaction.rollback();
        }

        session.close();
    }
}
