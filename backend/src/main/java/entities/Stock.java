package entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "stock")
public class Stock {
    @Id
    @ColumnDefault("nextval('stock_sto_id_seq')")
    @Column(name = "sto_id", nullable = false)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sto_art_id")
    private Article stoArt;

    @Column(name = "sto_qte", nullable = false)
    private Integer stoQte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getStoArt() {
        return stoArt;
    }

    public void setStoArt(Article stoArt) {
        this.stoArt = stoArt;
    }

    public Integer getStoQte() {
        return stoQte;
    }

    public void setStoQte(Integer stoQte) {
        this.stoQte = stoQte;
    }

}
