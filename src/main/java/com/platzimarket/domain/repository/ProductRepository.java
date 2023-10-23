package com.platzimarket.domain.repository;

import com.platzimarket.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Producto> getAll();
    Optional<List<Producto>> getByCategory(int categoryId);
    Optional<List<Producto>> getProductsEscasos(int quantity);
    Optional<Producto> getProduct(int prodcutId);
    Producto save (Producto producto);
    void delete(int productId);

}
