package edu.elp.FranklinCuro.entity;

import javax.persistence.*;

@Entity
@Table(name = "Direccion")
public class Direccion  {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idDireccion")
    private Long idDireccion;


    @Column(name = "Calle", length = 50)
    private  String Calle;

    @Column(name = "Ciudad", length = 50)
    private  String Ciudad;

    @Column(name = "Estado", length = 50)
    private  String Estado;

    @Column(name = "Pais", length = 50)
    private  String Pais;

    @Column(name = "CodigoPostal", length = 50)
    private  String CodigoPostal;

    public Direccion() {
    }

    public Direccion(Long idDireccion, String calle, String ciudad, String estado, String pais, String codigoPostal) {
        this.idDireccion = idDireccion;
        Calle = calle;
        Ciudad = ciudad;
        Estado = estado;
        Pais = pais;
        CodigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "idDireccion=" + idDireccion +
                ", Calle='" + Calle + '\'' +
                ", Ciudad='" + Ciudad + '\'' +
                ", Estado='" + Estado + '\'' +
                ", Pais='" + Pais + '\'' +
                ", CodigoPostal='" + CodigoPostal + '\'' +
                '}';
    }
}
