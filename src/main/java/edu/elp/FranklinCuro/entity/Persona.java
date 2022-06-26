package edu.elp.FranklinCuro.entity;

import javax.persistence.*;

@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Long idpersona;

    @Column(name = "Nombre ", length = 50)
    private  String Nombre;

    @Column(name = "Email", length = 50)
    private  String Email;

    @Column(name = "Telefono", length = 50)
    private  String Telefono;

    public Persona() {
    }

    public Persona(Long idpersona, String nombre, String email, String telefono) {
        this.idpersona = idpersona;
        Nombre = nombre;
        Email = email;
        Telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idpersona=" + idpersona +
                ", Nombre='" + Nombre + '\'' +
                ", Email='" + Email + '\'' +
                ", Telefono='" + Telefono + '\'' +
                '}';
    }
}
