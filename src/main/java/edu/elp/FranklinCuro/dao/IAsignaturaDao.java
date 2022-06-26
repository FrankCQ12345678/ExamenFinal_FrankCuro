package edu.elp.FranklinCuro.dao;

import elp.edu.examendbbautista.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IAsignaturaDao extends JpaRepository<Asignatura,Long> {


    @Query("SELECT a FROM Asignatura a")
    Asignatura listaAsignaturas();

    @Query("SELECT a FROM Asignatura a WHERE a.denominacion = :denoSig OR a.sigla = :denoSig")
    Asignatura obtenerPorDenominacionOrSigla(@Param("denoSig") String denoSig);

}
