package tn.esprit.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrément
    @Column(name = "id")
    private Long id;
    private long idEmploye;
    @NotBlank
    private String nom;
    @Size(min = 2, max = 10, message = "le nom doit être entre 2 et 10 caractères")
    @Pattern(regexp = "^[A-Z][a-zA-Z]{3,5}$", message = "1er lettere maj et min 3 max 5")
    private String prenom;
    @Enumerated(EnumType.STRING)
    private RoleEmploye role;

    @JsonIgnore
    @ManyToOne
    private Agence agence;


}
