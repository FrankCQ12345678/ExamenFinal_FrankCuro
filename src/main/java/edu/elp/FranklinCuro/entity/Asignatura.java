package edu.elp.FranklinCuro.entity;

import javax.persistence.*;

@Entity
@Table(name = "asignatura")

public class Asignatura  {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idasignatura")
    private Long idasignatura;

    @Column(name = "denominacion", length = 50)
    private  String denominacion;

    @Column(name = "sigla", length = 50)
    private  String sigla;

    @Column(name = "credito", length = 50)
    private  String credito;

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public Asignatura(Long idasignatura, String denominacion, String sigla, String credito) {
        this.idasignatura = idasignatura;
        this.denominacion = denominacion;
        this.sigla = sigla;
        this.credito = credito;
    }

    public Asignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public Asignatura() {
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "idasignatura=" + idasignatura +
                ", denominacion='" + denominacion + '\'' +
                ", sigla='" + sigla + '\'' +
                ", credito='" + credito + '\'' +
                '}';
    }
}
