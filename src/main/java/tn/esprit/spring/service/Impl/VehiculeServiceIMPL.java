package tn.esprit.spring.service.Impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Equipement;
import tn.esprit.spring.entity.Vehicule;
import tn.esprit.spring.repository.EquipementRepository;
import tn.esprit.spring.repository.VehiculeRepository;
import tn.esprit.spring.service.Interface.IVehiculeService;

import java.util.List;


@Service
@AllArgsConstructor
public class VehiculeServiceIMPL implements IVehiculeService {

    VehiculeRepository vehiculeRepository;
    EquipementRepository equipementRepository;

    @Transactional
    @Override
    public Vehicule desaffecterEquipementVehicule(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElse(null);
        Equipement equipement = equipementRepository.findById(idEquipement).orElse(null);

        vehicule.getEquipements().remove(equipement);
        return vehiculeRepository.save(vehicule);
    }

    @Transactional
    @Override
    public Vehicule affecterVehiculeEquipement(Long idVehicule, Long idEquipement) {
       Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElse(null);
       Equipement equipement = equipementRepository.findById(idEquipement).orElse(null);

       assert vehicule != null;

       vehicule.getEquipements().add(equipement);


        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule creer(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule obtenirParId(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> listerTous() {
        return (List<Vehicule>)  vehiculeRepository.findAll();
    }

    @Override
    public Vehicule mettreAJour(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void supprimer(Long id) {
vehiculeRepository.deleteById(id);
    }
}
