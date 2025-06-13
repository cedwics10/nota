package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.ColumnDefault;

@Entity
@jakarta.persistence.Table(name = "tables")
public class Table {
    @Id
    @ColumnDefault("nextval('tables_tab_id_seq')")
    @Column(name = "tab_id", nullable = false)
    private Long id;

    @Column(name = "tab_numero", nullable = false)
    private Long tabNumero;

    @Column(name = "tab_qr_code", length = Integer.MAX_VALUE)
    private String tabQrCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTabNumero() {
        return tabNumero;
    }

    public void setTabNumero(Long tabNumero) {
        this.tabNumero = tabNumero;
    }

    public String getTabQrCode() {
        return tabQrCode;
    }

    public void setTabQrCode(String tabQrCode) {
        this.tabQrCode = tabQrCode;
    }

}
