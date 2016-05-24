package com.sarojkmb.common;

import org.hibernate.Session;

import com.sarojkmb.model.Stock;
import com.sarojkmb.persistence.HibernateAnnotationUtil;
import com.sarojkmb.persistence.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App objApp=new App();
        //objApp.demoHibernateXml();
        objApp.demoHibernateAnnotation();
        
    }
    
    public void demoHibernateAnnotation(){
    	System.out.println("Maven + Hibernate + MySQL + Annotation");
        Session session = HibernateAnnotationUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("472355");
        stock.setStockName("GEGTNMse");
        
        session.save(stock);
        session.getTransaction().commit();
    }
    
    public void demoHibernateXml(){
    	System.out.println("Maven + Hibernate + MySQL + xml");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("47155");
        stock.setStockName("GENMse");
        
        session.save(stock);
        session.getTransaction().commit();
    }
    
}
