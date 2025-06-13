package entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
@Table(name = "commande_article")
public class CommandeArticle {
    @EmbeddedId
    private CommandeArticleId id;

    @MapsId("coaComId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "coa_com_id", nullable = false)
    private Commande coaCom;

    @MapsId("coaArtId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "coa_art_id", nullable = false)
    private Article coaArt;

    @Column(name = "coa_qte", nullable = false)
    private Long coaQte;

    @Column(name = "coa_statut", length = 10)
    private String coaStatut;

    @Column(name = "coa_prix_unitaire", nullable = false, precision = 6, scale = 2)
    private BigDecimal coaPrixUnitaire;

    @Column(name = "coa_source_prix", length = 500)
    private String coaSourcePrix;

    @ColumnDefault("CURRENT_TIME")
    @Column(name = "coa_heure")
    private LocalTime coaHeure;

    public CommandeArticleId getId() {
        return id;
    }

    public void setId(CommandeArticleId id) {
        this.id = id;
    }

    public Commande getCoaCom() {
        return coaCom;
    }

    public void setCoaCom(Commande coaCom) {
        this.coaCom = coaCom;
    }

    public Article getCoaArt() {
        return coaArt;
    }

    public void setCoaArt(Article coaArt) {
        this.coaArt = coaArt;
    }

    public Long getCoaQte() {
        return coaQte;
    }

    public void setCoaQte(Long coaQte) {
        this.coaQte = coaQte;
    }

    public String getCoaStatut() {
        return coaStatut;
    }

    public void setCoaStatut(String coaStatut) {
        this.coaStatut = coaStatut;
    }

    public BigDecimal getCoaPrixUnitaire() {
        return coaPrixUnitaire;
    }

    public void setCoaPrixUnitaire(BigDecimal coaPrixUnitaire) {
        this.coaPrixUnitaire = coaPrixUnitaire;
    }

    public String getCoaSourcePrix() {
        return coaSourcePrix;
    }

    public void setCoaSourcePrix(String coaSourcePrix) {
        this.coaSourcePrix = coaSourcePrix;
    }

    public LocalTime getCoaHeure() {
        return coaHeure;
    }

    public void setCoaHeure(LocalTime coaHeure) {
        this.coaHeure = coaHeure;
    }

}
