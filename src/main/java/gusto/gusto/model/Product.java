package gusto.gusto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Locale;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    @NotBlank
    @Size(min=5,message = "length should at least be 50")
    private String description;
    @NotBlank
    @Size(min=5,message = "length should at least be 5")
    private String productName;
    @NotBlank
    private Integer quantity;
    @NotBlank
    private double price;
    @NotBlank
    private String image;
@NotBlank
    private double discount;
    @NotBlank
    private  double specialPrice;

    @ManyToOne
    @JoinColumn(name ="category_id")
  private category category;


}
