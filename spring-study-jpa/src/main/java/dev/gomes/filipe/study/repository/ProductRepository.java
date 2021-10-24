package dev.gomes.filipe.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.gomes.filipe.study.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
