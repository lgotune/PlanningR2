package application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {

    @Id
    private int id;

    private String nom;
    private String prenom;

    private String typeContrat;


    public EmployeeEntity() { }

    public EmployeeEntity(String nom, String prenom, String typeContrat) {
        this.nom = nom;
        this.prenom = prenom;
        this.typeContrat = typeContrat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTypeContrat() { return typeContrat; }

    public void setTypeContrat(String typeContrat) { this.typeContrat = typeContrat; }
}
