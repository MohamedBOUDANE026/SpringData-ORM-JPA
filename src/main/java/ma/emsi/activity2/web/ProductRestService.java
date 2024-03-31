package ma.emsi.activity2.web;

import ma.emsi.activity2.Entites.Product;
import ma.emsi.activity2.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products") /* Création du web service */
    public List<Product> products()
    {
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}") /* Création du web service */
    public Product findProduct(@PathVariable Long id)
    {
        return productRepository.findById(id).get();
    }

}
