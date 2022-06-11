package br.com.petshopcaramelo.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 *
 * @author jeferson
 */
@Entity
@Table(name="gato")
public class Gato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private boolean filv;

    @Column(nullable=false)
    private boolean felv;

    public boolean isFilv() {
        return filv;
    }

    public void setFilv(boolean filv) {
        this.filv = filv;
    }

    public boolean isFelv() {
        return felv;
    }

    public void setFelv(boolean felv) {
        this.felv = felv;
    }

    public Gato() {
    }

    public Gato(boolean filv, boolean felv) {
        this.filv = filv;
        this.felv = felv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gato)) {
            return false;
        }
        Gato other = (Gato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.petshopcaramelo.entidade.Gato[ id=" + id + " ]";
    }

}
