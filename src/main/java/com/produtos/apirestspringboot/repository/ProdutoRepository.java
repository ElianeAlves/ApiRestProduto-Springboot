package com.produtos.apirestspringboot.repository;

import com.produtos.apirestspringboot.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findById(long id);
}
