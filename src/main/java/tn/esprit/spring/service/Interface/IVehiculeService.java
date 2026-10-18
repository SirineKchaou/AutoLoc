package tn.esprit.spring.service.Interface;

import tn.esprit.spring.entity.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule creer(Vehicule vehicule);

    Vehicule obtenirParId(Long id);

    List<Vehicule> listerTous();

    Vehicule mettreAJour(Vehicule vehicule);

    void supprimer(Long id);

    Vehicule affecterVehiculeEquipement(Long idVehicule, Long idEquipement);

   Vehicule desaffecterEquipementVehicule(Long idVehicule, Long idEquipement);
}
