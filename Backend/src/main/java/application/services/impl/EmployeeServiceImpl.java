package application.services.impl;

import application.entity.EmployeeEntity;
import application.repository.EmployeeRepository;
import application.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Iterable findAll() {
        return repository.findAll();
    }

    @Override
    public Iterable findAllById(ArrayList idList) {
        return repository.findAllById(idList);
    }

    @Override
    public void save(EmployeeEntity newEmployeeEntity) {
        repository.save(newEmployeeEntity);
    }

    @Override
    public Optional findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    private static Document convertStringToXMLDocument(String xmlString)
    {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try
        {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();

            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
