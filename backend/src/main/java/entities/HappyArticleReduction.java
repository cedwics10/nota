package entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "happy_article_reduction")
public class HappyArticleReduction {
    @EmbeddedId
    private HappyArticleReductionId id;

    @MapsId("harHapId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "har_hap_id", nullable = false)
    private HappyHour harHap;

    @MapsId("harArtId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "har_art_id", nullable = false)
    private Article harArt;

    @Column(name = "har_prix", nullable = false, precision = 6, scale = 2)
    private BigDecimal harPrix;

    public HappyArticleReductionId getId() {
        return id;
    }

    public void setId(HappyArticleReductionId id) {
        this.id = id;
    }

    public HappyHour getHarHap() {
        return harHap;
    }

    public void setHarHap(HappyHour harHap) {
        this.harHap = harHap;
    }

    public Article getHarArt() {
        return harArt;
    }

    public void setHarArt(Article harArt) {
        this.harArt = harArt;
    }

    public BigDecimal getHarPrix() {
        return harPrix;
    }

    public void setHarPrix(BigDecimal harPrix) {
        this.harPrix = harPrix;
    }

}
