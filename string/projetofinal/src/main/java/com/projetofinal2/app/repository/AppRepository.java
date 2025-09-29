package com.projetofinal2.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.projetofinal2.app.models.Caso;

public interface AppRepository extends CrudRepository<Caso,String>{
    Caso findByIdCaso(long idCaso);
    Caso deleteByidCaso(long idcaso);

}
