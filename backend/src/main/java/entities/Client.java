package entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @ColumnDefault("nextval('client_cli_id_seq')")
    @Column(name = "cli_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cli_emp_id")
    private Employe cliEmp;

    @Column(name = "cli_table", nullable = false)
    private Long cliTable;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "cli_debut")
    private Instant cliDebut;

    @Column(name = "cli_fin")
    private Instant cliFin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employe getCliEmp() {
        return cliEmp;
    }

    public void setCliEmp(Employe cliEmp) {
        this.cliEmp = cliEmp;
    }

    public Long getCliTable() {
        return cliTable;
    }

    public void setCliTable(Long cliTable) {
        this.cliTable = cliTable;
    }

    public Instant getCliDebut() {
        return cliDebut;
    }

    public void setCliDebut(Instant cliDebut) {
        this.cliDebut = cliDebut;
    }

    public Instant getCliFin() {
        return cliFin;
    }

    public void setCliFin(Instant cliFin) {
        this.cliFin = cliFin;
    }

}
