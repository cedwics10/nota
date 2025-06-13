package entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "stock_log")
public class StockLog {
    @Id
    @ColumnDefault("nextval('stock_log_stl_id_seq')")
    @Column(name = "stl_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stl_art_id")
    private Article stlArt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stl_emp_id")
    private Employe stlEmp;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "stl_datetime")
    private Instant stlDatetime;

    @Column(name = "stl_variation", nullable = false)
    private Long stlVariation;

    @Column(name = "stl_motif")
    private String stlMotif;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getStlArt() {
        return stlArt;
    }

    public void setStlArt(Article stlArt) {
        this.stlArt = stlArt;
    }

    public Employe getStlEmp() {
        return stlEmp;
    }

    public void setStlEmp(Employe stlEmp) {
        this.stlEmp = stlEmp;
    }

    public Instant getStlDatetime() {
        return stlDatetime;
    }

    public void setStlDatetime(Instant stlDatetime) {
        this.stlDatetime = stlDatetime;
    }

    public Long getStlVariation() {
        return stlVariation;
    }

    public void setStlVariation(Long stlVariation) {
        this.stlVariation = stlVariation;
    }

    public String getStlMotif() {
        return stlMotif;
    }

    public void setStlMotif(String stlMotif) {
        this.stlMotif = stlMotif;
    }

}
