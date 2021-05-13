package edu.wctc.wholesale.service;

import edu.wctc.wholesale.ResourceNotFoundException;
import edu.wctc.wholesale.entity.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(int productId) throws ResourceNotFoundException;
    List<Product> getAllProduct();
}
