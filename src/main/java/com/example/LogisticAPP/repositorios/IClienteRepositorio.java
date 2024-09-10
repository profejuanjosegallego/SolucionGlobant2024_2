package com.example.LogisticAPP.repositorios;

import com.example.LogisticAPP.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {
}
