package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "employe")
public class Employe {
    @Id
    @ColumnDefault("nextval('employe_emp_id_seq')")
    @Column(name = "emp_id", nullable = false)
    private Long id;

    @Column(name = "emp_prenom", nullable = false, length = 500)
    private String empPrenom;

    @Column(name = "emp_nom", nullable = false, length = 500)
    private String empNom;

    @Column(name = "emp_email", nullable = false, length = 500)
    private String empEmail;

    @Column(name = "emp_passe", nullable = false, length = 500)
    private String empPasse;

    @Column(name = "emp_role", nullable = false, length = 500)
    private String empRole;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpPrenom() {
        return empPrenom;
    }

    public void setEmpPrenom(String empPrenom) {
        this.empPrenom = empPrenom;
    }

    public String getEmpNom() {
        return empNom;
    }

    public void setEmpNom(String empNom) {
        this.empNom = empNom;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPasse() {
        return empPasse;
    }

    public void setEmpPasse(String empPasse) {
        this.empPasse = empPasse;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

}
