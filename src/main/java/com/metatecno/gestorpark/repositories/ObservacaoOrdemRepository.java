package com.metatecno.gestorpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metatecno.gestorpark.domain.ObservacaoOrdem;

@Repository
public interface ObservacaoOrdemRepository extends JpaRepository<ObservacaoOrdem, Integer> {

}
