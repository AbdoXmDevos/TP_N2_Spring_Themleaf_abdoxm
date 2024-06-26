package ma.enset.karimi.hospital.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank //@NotEmpty //Not Blank : n'accept pas les espaces , par contre NotEmpty
    @Size(min = 4 , max = 20)
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Le nom ne doit contenir que des lettres et des chiffres.")

    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
    @Min(100)
    private int score;
}
