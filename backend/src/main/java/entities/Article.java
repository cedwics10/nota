package entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Entity
@Table(name = "article")
public class Article {
    @Id
    @ColumnDefault("nextval('article_art_id_seq')")
    @Column(name = "art_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "art_typ_id")
    private TypeArticle artTyp;

    @Column(name = "art_nom", nullable = false, length = Integer.MAX_VALUE)
    private String artNom;

    @Column(name = "art_prix", nullable = false, precision = 6, scale = 2)
    private BigDecimal artPrix;

    @Column(name = "art_stock", nullable = false)
    private Long artStock;

    @ColumnDefault("true")
    @Column(name = "art_actif")
    private Boolean artActif;

    @Column(name = "art_photo", length = Integer.MAX_VALUE)
    private String artPhoto;

    @Column(name = "art_description", nullable = false, length = Integer.MAX_VALUE)
    private String artDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeArticle getArtTyp() {
        return artTyp;
    }

    public void setArtTyp(TypeArticle artTyp) {
        this.artTyp = artTyp;
    }

    public String getArtNom() {
        return artNom;
    }

    public void setArtNom(String artNom) {
        this.artNom = artNom;
    }

    public BigDecimal getArtPrix() {
        return artPrix;
    }

    public void setArtPrix(BigDecimal artPrix) {
        this.artPrix = artPrix;
    }

    public Long getArtStock() {
        return artStock;
    }

    public void setArtStock(Long artStock) {
        this.artStock = artStock;
    }

    public Boolean getArtActif() {
        return artActif;
    }

    public void setArtActif(Boolean artActif) {
        this.artActif = artActif;
    }

    public String getArtPhoto() {
        return artPhoto;
    }

    public void setArtPhoto(String artPhoto) {
        this.artPhoto = artPhoto;
    }

    public String getArtDescription() {
        return artDescription;
    }

    public void setArtDescription(String artDescription) {
        this.artDescription = artDescription;
    }

}
