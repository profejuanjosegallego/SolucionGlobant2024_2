package com.example.LogisticAPP.repositorios;

import com.example.LogisticAPP.modelos.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBodegaRepositorio extends JpaRepository<Bodega, Integer> {
}
