package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CommandeArticleId implements Serializable {
    private static final long serialVersionUID = 1586663134024237760L;
    @Column(name = "coa_com_id", nullable = false)
    private Long coaComId;

    @Column(name = "coa_art_id", nullable = false)
    private Long coaArtId;

    public Long getCoaComId() {
        return coaComId;
    }

    public void setCoaComId(Long coaComId) {
        this.coaComId = coaComId;
    }

    public Long getCoaArtId() {
        return coaArtId;
    }

    public void setCoaArtId(Long coaArtId) {
        this.coaArtId = coaArtId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CommandeArticleId entity = (CommandeArticleId) o;
        return Objects.equals(this.coaComId, entity.coaComId) &&
                Objects.equals(this.coaArtId, entity.coaArtId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coaComId, coaArtId);
    }

}
