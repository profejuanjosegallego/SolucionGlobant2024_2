package com.example.LogisticAPP.repositorios;


import com.example.LogisticAPP.modelos.Mercancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMercanciaRepositorio extends JpaRepository<Mercancia,Integer> {


}
