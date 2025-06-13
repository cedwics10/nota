package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "type_article")
public class TypeArticle {
    @Id
    @ColumnDefault("nextval('type_article_typ_id_seq')")
    @Column(name = "typ_id", nullable = false)
    private Long id;

    @Column(name = "typ_nom", nullable = false, length = Integer.MAX_VALUE)
    private String typNom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypNom() {
        return typNom;
    }

    public void setTypNom(String typNom) {
        this.typNom = typNom;
    }

}
