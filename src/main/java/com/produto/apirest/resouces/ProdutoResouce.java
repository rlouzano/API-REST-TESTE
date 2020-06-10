package com.produto.apirest.resouces;

import com.produto.apirest.models.Produtos;
import com.produto.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProdutoResouce {

    @Autowired
    ProdutoRepository produtoRepository;

    //Listar todos os produtos do banco de dados
    @GetMapping("/produtos")
    public List<Produtos> listaProdutos(){
        return produtoRepository.findAll();
    }

    //Retorna um produto por id
    @GetMapping("/produto/{id}")
    public Produtos listaProdutoUnico(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }

    @PostMapping("/produto")
    public Produtos salvaProduto(@RequestBody Produtos produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    public void deletaProduto(@RequestBody Produtos produto){
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    public Produtos atualizaProduto(@RequestBody Produtos produto){
        return produtoRepository.save(produto);
    }

}
