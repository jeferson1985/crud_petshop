package br.com.petshopcaramelo.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 *
 * @author jeferson
 */
@Entity
@Table(name = "animal")
public class Animal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Date nascimento;

    @Column(nullable = false)
    private Double peso;

    @Column(nullable = false)
    private String sexo;

    @Column(nullable = false)
    private String observacao;

//    @ManyToOne
//    @JoinColumn(name = "comportamento")
//    private Comportamento comportamento;

//    public Comportamento getComportamento() {
//        return comportamento;
//    }
//
//    public void setComportamento(Comportamento comportamento) {
//        this.comportamento = comportamento;
//    }

    public Animal() {
    }

    public Animal(String nome, Date nascimento, Double peso, String sexo, String observacao) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.peso = peso;
        this.sexo = sexo;
        this.observacao = observacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.petshopcaramelo.entidade.Animal[ id=" + id + " ]";
    }

}
