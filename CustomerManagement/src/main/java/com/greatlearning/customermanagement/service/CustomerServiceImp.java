package com.greatlearning.customermanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.customermanagement.entity.Customer;
import com.greatlearning.customermanagement.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Override
	@Transactional
	public List<Customer> findAll() {
		return repository.findAll();

	}

	@Override
	@Transactional
	public Customer findById(int id) {

		return repository.findById(id);

	}

	@Override
	@Transactional
	public void save(Customer customer) {
		repository.save(customer);

	}

	@Override
	@Transactional
	public void deleteById(int id) {

		repository.deleteById(id);

	}

}
