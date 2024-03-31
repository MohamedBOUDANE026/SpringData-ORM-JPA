package ma.emsi.activity2;

import ma.emsi.activity2.Entites.Product;
import ma.emsi.activity2.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Activity2Application implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(Activity2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //productRepository.save(new Product(null, "Bimo", 20, 5));
        //productRepository.save(new Product(null, "Sucre", 10, 10));
        //productRepository.save(new Product(null, "Limonade", 9, 15));
        //productRepository.save(new Product(null, "Eau", 30, 20));
        List<Product> products = productRepository.findAll();
        products.forEach(p ->
        {
            System.out.println(p.toString());
        });
        Product product = productRepository.findById(Long.valueOf(3)).get();
        System.out.println("************************");
        System.out.println(product.getId());
        System.out.println(product.getNom());
        System.out.println(product.getPrix());
        System.out.println(product.getQte());
        System.out.println("************************");
        System.out.println("---------------------");

        System.out.println("---------------------");
        List<Product> productList2 = productRepository.search("%c%");
        productList2.forEach(p -> {
            System.out.println(p);
        });


    }
}
