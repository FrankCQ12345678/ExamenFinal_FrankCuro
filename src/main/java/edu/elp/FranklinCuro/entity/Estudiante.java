package edu.elp.FranklinCuro.entity;

import javax.persistence.*;

@Entity
@Table(name = "Estudiante")
public class Estudiante  {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idEstudiante")
    private Long idEstudiante;




    @Column(name = "Serie", length = 50)
    private  String Serie;

    @Column(name = "Codigo", length = 50)
    private  String Codigo;

    public Estudiante() {
    }

    public Estudiante(Long idEstudiante, String serie, String codigo) {
        this.idEstudiante = idEstudiante;
        Serie = serie;
        Codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "idEstudiante=" + idEstudiante +
                ", Serie='" + Serie + '\'' +
                ", Codigo='" + Codigo + '\'' +
                '}';
    }
}
