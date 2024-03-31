package ma.emsi.activity2.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) /* Entité JPA */
    private Long id;
    private String nom;
    private double prix;
    private int qte;
}
