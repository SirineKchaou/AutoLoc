package tn.esprit.spring.service.Interface;

import tn.esprit.spring.dto.AgenceDTO;

import java.util.List;

public interface IAgenceDTOService {
    AgenceDTO creer(AgenceDTO agenceDTO);

    AgenceDTO obtenirParId(Long id);

    List<AgenceDTO> listerTous();

    AgenceDTO mettreAJour(AgenceDTO agenceDTO);

    void supprimer(Long id);
}
