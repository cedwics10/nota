package entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "paiement")
public class Paiement {
    @Id
    @ColumnDefault("nextval('paiement_pai_id_seq')")
    @Column(name = "pai_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pai_com_id")
    private Commande paiCom;

    @Column(name = "pai_moyen", nullable = false, length = 10)
    private String paiMoyen;

    @Column(name = "pai_montant", nullable = false, precision = 8, scale = 2)
    private BigDecimal paiMontant;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "pai_datetime")
    private Instant paiDatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Commande getPaiCom() {
        return paiCom;
    }

    public void setPaiCom(Commande paiCom) {
        this.paiCom = paiCom;
    }

    public String getPaiMoyen() {
        return paiMoyen;
    }

    public void setPaiMoyen(String paiMoyen) {
        this.paiMoyen = paiMoyen;
    }

    public BigDecimal getPaiMontant() {
        return paiMontant;
    }

    public void setPaiMontant(BigDecimal paiMontant) {
        this.paiMontant = paiMontant;
    }

    public Instant getPaiDatetime() {
        return paiDatetime;
    }

    public void setPaiDatetime(Instant paiDatetime) {
        this.paiDatetime = paiDatetime;
    }

}
