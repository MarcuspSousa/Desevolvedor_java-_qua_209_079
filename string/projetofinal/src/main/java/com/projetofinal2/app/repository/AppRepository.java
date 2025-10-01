package com.projetofinal2.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.projetofinal2.app.models.Caso;

public interface AppRepository extends CrudRepository<Caso, Long> {
    Caso findByIdCaso(long idCaso);
}
