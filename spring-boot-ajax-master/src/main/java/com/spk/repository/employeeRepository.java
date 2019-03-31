package com.spk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spk.dto.Book;

public class employeeRepository {

	public interface EmployeeRepository extends JpaRepository<Book, Long> {

	}
}
