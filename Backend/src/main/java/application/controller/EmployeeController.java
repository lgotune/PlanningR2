package application.controller;

import application.entity.EmployeeEntity;
import application.services.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@Api(description="API pour les opérations CRUD sur les employees.")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "Récupère tout les employee")
    @GetMapping("/allEmployee")
    public Iterable findAll() {
        return employeeService.findAll();
    }

    @ApiOperation(value = "Récupère tout les employee dont l'ID est dans la liste")
    @PostMapping("/allEmployee")
    public Iterable findAllById(@RequestBody ArrayList idList) {
        return employeeService.findAllById(idList);
    }

    @ApiOperation(value = "Ajoute un nouveau employee")
    @PostMapping("/employee/add")
    public void save(@RequestBody EmployeeEntity newEmployeeEntity) {
        employeeService.save(newEmployeeEntity);
    }


    @ApiOperation(value = "Récupère un employee grâce à son ID")
    @GetMapping("/employee/{id}")
    public Optional findById(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @ApiOperation(value = "Supprime un employee grâce à son ID")
    @DeleteMapping("/employee/{id}")
    public void deleteById(@PathVariable int id) {
        employeeService.deleteById(id);
    }
}
