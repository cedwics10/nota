package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalTime;

@Entity
@Table(name = "happy_hour")
public class HappyHour {
    @Id
    @ColumnDefault("nextval('happy_hour_hap_id_seq')")
    @Column(name = "hap_id", nullable = false)
    private Long id;

    @Column(name = "hap_jour", nullable = false)
    private Integer hapJour;

    @Column(name = "hap_debut", nullable = false)
    private LocalTime hapDebut;

    @Column(name = "hap_fin", nullable = false)
    private LocalTime hapFin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHapJour() {
        return hapJour;
    }

    public void setHapJour(Integer hapJour) {
        this.hapJour = hapJour;
    }

    public LocalTime getHapDebut() {
        return hapDebut;
    }

    public void setHapDebut(LocalTime hapDebut) {
        this.hapDebut = hapDebut;
    }

    public LocalTime getHapFin() {
        return hapFin;
    }

    public void setHapFin(LocalTime hapFin) {
        this.hapFin = hapFin;
    }

}
