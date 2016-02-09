package br.com.util;

import org.hibernate.Session;

import br.com.hbn.Product;

public class TesteHibernate {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Product p = new Product();
		p.setNome("aaaaa");
		session.save(p);
		 /*Long id = (Long) session.save(p);
		 Product pdel = new Product();
		 pdel.setId(id);
		 session.delete(pdel);*/
		 

		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}