package com.cice.gestionalumnos.resository.dao;

import com.cice.gestionalumnos.resository.entity.AlumnoOldEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlumnosOldDAO extends JpaRepository<AlumnoOldEntity, Long> {

    Optional<AlumnoOldEntity> findByNombreCompletoAndFechaNacimiento(String nombreCompleto, String fechaNacimiento);
}