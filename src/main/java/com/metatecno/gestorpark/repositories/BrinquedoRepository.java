package com.metatecno.gestorpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metatecno.gestorpark.domain.Brinquedo;

@Repository
public interface BrinquedoRepository extends JpaRepository<Brinquedo, Integer> {

}
