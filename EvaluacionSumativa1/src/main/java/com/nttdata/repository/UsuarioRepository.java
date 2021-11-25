package com.nttdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.models.Usuarios;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuarios, Long>{

}
