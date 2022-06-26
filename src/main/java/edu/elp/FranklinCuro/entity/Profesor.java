package edu.elp.FranklinCuro.entity;

import javax.persistence.*;

@Entity
@Table(name = "Profesor")
public class Profesor {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idprofesor")
    private Long idprofesor;


    @Column(name = "Salario", length = 50)
    private  String Salario;

    public Profesor() {
    }

    public Profesor(Long idprofesor, String salario) {
        this.idprofesor = idprofesor;
        Salario = salario;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "idprofesor=" + idprofesor +
                ", Salario='" + Salario + '\'' +
                '}';
    }
}