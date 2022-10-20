package rikkei.academy.repository;

import rikkei.academy.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void save(Product product);
    Product findById(Long id);
    void deleteById(Long id);
}
