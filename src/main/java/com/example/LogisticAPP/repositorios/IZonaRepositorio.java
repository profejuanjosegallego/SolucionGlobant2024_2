package com.example.LogisticAPP.repositorios;


import com.example.LogisticAPP.modelos.ZonaBodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IZonaRepositorio extends JpaRepository<ZonaBodega, Integer> {
}
