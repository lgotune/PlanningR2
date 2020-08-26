package application.repository;

import application.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Serializable> {

}
