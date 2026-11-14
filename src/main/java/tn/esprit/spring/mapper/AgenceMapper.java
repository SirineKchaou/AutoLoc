package tn.esprit.spring.mapper;

import org.springframework.stereotype.Component;
import tn.esprit.spring.entity.Agence;
import tn.esprit.spring.dto.AgenceDTO;

@Component
public class AgenceMapper {

  /*  // Entity vers DTO
    public tn.esprit.spring.service.Impl.AgenceDTO toDTO(Agence agence) {

        if (agence == null) {
            return null;
        }

        AgenceDTO dto = new AgenceDTO();

        dto.setIdAgence(agence.getIdAgence());
        dto.setNom(agence.getNom());
        dto.setVille(agence.getVille());
        dto.setAdresse(agence.getAdresse());
        dto.setTel(agence.getTelephone());

        return dto;
    }

    // DTO vers Entity
    public Agence toEntity(AgenceDTO dto) {

        if (dto == null) {
            return null;
        }

        Agence agence = new Agence();

        agence.setIdAgence(dto.getIdAgence());
        agence.setNom(dto.getNom());
        agence.setVille(dto.getVille());
        agence.setAdresse(dto.getAdresse());
        agence.setTelephone(dto.getTel());

        return agence;
    } */
}