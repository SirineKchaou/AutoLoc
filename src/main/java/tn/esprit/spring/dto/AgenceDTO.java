package tn.esprit.spring.dto;

import lombok.Data;

@Data
public class AgenceDTO {

    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String tel;
}
