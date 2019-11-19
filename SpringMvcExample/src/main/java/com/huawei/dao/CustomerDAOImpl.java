package com.huawei.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.huawei.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory factory;

	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub

		Session session = factory.getCurrentSession();
		session.saveOrUpdate(customer);

	}

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
		Root<Customer> root = cq.from(Customer.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		  Session currentSession = factory.getCurrentSession();
	        Customer theCustomer = currentSession.get(Customer.class, theId);
	        return theCustomer;
	}

	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		Customer book = session.byId(Customer.class).load(theId);
		session.delete(book);

	}

}
