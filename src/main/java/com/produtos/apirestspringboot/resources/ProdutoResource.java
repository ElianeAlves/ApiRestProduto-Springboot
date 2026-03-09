package com.produtos.apirestspringboot.resources;

import com.produtos.apirestspringboot.models.Produto;
import com.produtos.apirestspringboot.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> getProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produto getProdutoById(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping
    public Produto postProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deleteProdutoById(@PathVariable(value = "id") long id) {
        produtoRepository.deleteById(id);
    }

    @PutMapping
    public Produto putProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
