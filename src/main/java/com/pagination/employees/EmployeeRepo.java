package com.pagination.employees;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepo extends PagingAndSortingRepository<Employee , Long> {
}
