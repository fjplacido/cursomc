package br.com.jsolutions.cursomc.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jsolutions.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Serializable> {

}
