package tnsif.c2tc.b09.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tnsif.c2tc.b09.entity.Employee;



public interface EmployeeRepo extends
                   //CrudRepository<Student, Integer> {
                       JpaRepository<Employee, Integer>{ 

}
