package edu.wctc.wholesale.service;

import edu.wctc.wholesale.ResourceNotFoundException;
import edu.wctc.wholesale.entity.Product;
import edu.wctc.wholesale.repos.CustomerRepository;
import edu.wctc.wholesale.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        productRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Product getProduct(int productId) throws ResourceNotFoundException {
        return productRepository.findById(productId).orElseThrow(
                () -> new ResourceNotFoundException("Event", "id", productId));
    }
}