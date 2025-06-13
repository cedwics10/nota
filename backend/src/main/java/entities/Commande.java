package entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @ColumnDefault("nextval('commande_com_id_seq')")
    @Column(name = "com_id", nullable = false)
    private Long id;

    @Column(name = "com_numero", nullable = false, length = Integer.MAX_VALUE)
    private String comNumero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "com_tab_id")
    private Table comTab;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "com_datetime")
    private Instant comDatetime;

    @Column(name = "com_statut", nullable = false, length = Integer.MAX_VALUE)
    private String comStatut;

    @Column(name = "com_total_ht", precision = 8, scale = 2)
    private BigDecimal comTotalHt;

    @Column(name = "com_total_ttc", precision = 8, scale = 2)
    private BigDecimal comTotalTtc;

    @Column(name = "com_remise", precision = 8, scale = 2)
    private BigDecimal comRemise;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComNumero() {
        return comNumero;
    }

    public void setComNumero(String comNumero) {
        this.comNumero = comNumero;
    }

    public Table getComTab() {
        return comTab;
    }

    public void setComTab(Table comTab) {
        this.comTab = comTab;
    }

    public Instant getComDatetime() {
        return comDatetime;
    }

    public void setComDatetime(Instant comDatetime) {
        this.comDatetime = comDatetime;
    }

    public String getComStatut() {
        return comStatut;
    }

    public void setComStatut(String comStatut) {
        this.comStatut = comStatut;
    }

    public BigDecimal getComTotalHt() {
        return comTotalHt;
    }

    public void setComTotalHt(BigDecimal comTotalHt) {
        this.comTotalHt = comTotalHt;
    }

    public BigDecimal getComTotalTtc() {
        return comTotalTtc;
    }

    public void setComTotalTtc(BigDecimal comTotalTtc) {
        this.comTotalTtc = comTotalTtc;
    }

    public BigDecimal getComRemise() {
        return comRemise;
    }

    public void setComRemise(BigDecimal comRemise) {
        this.comRemise = comRemise;
    }

}
