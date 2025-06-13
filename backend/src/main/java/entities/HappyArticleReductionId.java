package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class HappyArticleReductionId implements Serializable {
    private static final long serialVersionUID = 991072791413166948L;
    @Column(name = "har_hap_id", nullable = false)
    private Long harHapId;

    @Column(name = "har_art_id", nullable = false)
    private Long harArtId;

    public Long getHarHapId() {
        return harHapId;
    }

    public void setHarHapId(Long harHapId) {
        this.harHapId = harHapId;
    }

    public Long getHarArtId() {
        return harArtId;
    }

    public void setHarArtId(Long harArtId) {
        this.harArtId = harArtId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        HappyArticleReductionId entity = (HappyArticleReductionId) o;
        return Objects.equals(this.harHapId, entity.harHapId) &&
                Objects.equals(this.harArtId, entity.harArtId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(harHapId, harArtId);
    }

}
