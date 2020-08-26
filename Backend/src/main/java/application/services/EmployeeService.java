package application.services;

import application.entity.EmployeeEntity;

import java.util.ArrayList;
import java.util.Optional;

public interface EmployeeService {

    Iterable findAll();
    Iterable findAllById(ArrayList idList);
    void save(EmployeeEntity newEmployeeEntity);
    Optional findById(int id);
    void deleteById(int id);

}
