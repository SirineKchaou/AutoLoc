package tn.esprit.spring.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.dto.AgenceDTO;
import tn.esprit.spring.service.Interface.IAgenceDTOService;

import java.util.List;

@Service
@AllArgsConstructor
public abstract class AgenceServiceDTOIMPL implements IAgenceDTOService {
    @Override
    public AgenceDTO creer(AgenceDTO agenceDTO) {
        return null;
    }

    @Override
    public AgenceDTO obtenirParId(Long id) {
        return null;
    }

    @Override
    public List<AgenceDTO> listerTous() {
        return List.of();
    }

    @Override
    public AgenceDTO mettreAJour(AgenceDTO agenceDTO) {
        return null;
    }

    @Override
    public void supprimer(Long id) {

    }
}
