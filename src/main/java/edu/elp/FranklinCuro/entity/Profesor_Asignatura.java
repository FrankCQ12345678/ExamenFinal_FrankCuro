package edu.elp.FranklinCuro.entity;
import javax.persistence.*;

@Entity
@Table(name = "Profesor_Asignatura")
public class Profesor_Asignatura {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idprofasignatura")
    private Long idprofasignatura;



    @Column(name = "idprofesor", length = 50)
    private  String idprofesor;

    @Column(name = "idasignatura", length = 50)
    private  String idasignatura;



    @Column(name = "Semestre", length = 50)
    private  String Semestre;

    public Profesor_Asignatura() {
    }

    public Profesor_Asignatura(Long idprofasignatura, String idprofesor, String idasignatura, String semestre) {
        this.idprofasignatura = idprofasignatura;
        this.idprofesor = idprofesor;
        this.idasignatura = idasignatura;
        Semestre = semestre;
    }

    @Override
    public String toString() {
        return "Profesor_Asignatura{" +
                "idprofasignatura=" + idprofasignatura +
                ", idprofesor='" + idprofesor + '\'' +
                ", idasignatura='" + idasignatura + '\'' +
                ", Semestre='" + Semestre + '\'' +
                '}';
    }
}
