package tn.esprit.spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Vehicule;
import tn.esprit.spring.service.Interface.IVehiculeService;

import java.util.List;

@Tag(name = "Gestion des véhicules")
@RestController
@AllArgsConstructor
@RequestMapping("/VehiculeController")
public class VehiculeController {
    IVehiculeService iVehiculeService;



    @PutMapping("/desaffectEquipement/{idVehicule}/{idEquipement}")
    public Vehicule desaffecterEquipementVehicule(@PathVariable  Long idVehicule,@PathVariable Long idEquipement) {
        return iVehiculeService.desaffecterEquipementVehicule(idVehicule, idEquipement);
    }

    @PutMapping("/affect/{idVehicule}/{idEquipement}")
    public Vehicule affecterVehiculeEquipement(Long idVehicule, Long idEquipement) {
        return iVehiculeService.affecterVehiculeEquipement(idVehicule, idEquipement);
    }

    @Operation(description = "Ajouter les véhicules")
    @PostMapping("/Add")
    public Vehicule creer(@RequestBody Vehicule vehicule) {
        return iVehiculeService.creer(vehicule);
    }

    @Operation(description = "Rechercher les véhicules")
    @GetMapping("/SearchByID/{id}")
    public Vehicule obtenirParId(@PathVariable Long id) {
        return iVehiculeService.obtenirParId(id);
    }

    @Operation(description = "Lister les véhicules")
    @GetMapping("/ListerTous")
    public List<Vehicule> listerTous() {
        return iVehiculeService.listerTous();
    }

    @Operation(description = "Modifier les véhicules")
    @PutMapping("/Update")
    public Vehicule mettreAJour(@RequestBody Vehicule vehicule) {
        return iVehiculeService.mettreAJour(vehicule);
    }

    @Operation(description = "Supprimer les véhicules")
    @DeleteMapping("/Delete/{id}")
    public void supprimer(@PathVariable Long id) {
        iVehiculeService.supprimer(id);
    }
}
