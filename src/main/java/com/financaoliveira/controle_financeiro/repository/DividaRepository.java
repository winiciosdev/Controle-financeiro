package com.financaoliveira.controle_financeiro.repository;

import com.financaoliveira.controle_financeiro.entity.Divida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DividaRepository extends JpaRepository<Divida, Long> {
    List<Divida> findByUsuarioId(Long usuarioId);
}
