package com.undec.level.repository;

import com.undec.level.model.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {
}
