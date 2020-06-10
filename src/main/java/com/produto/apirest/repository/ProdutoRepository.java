package com.produto.apirest.repository;

import com.produto.apirest.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

    Produtos findById(long id);

}
