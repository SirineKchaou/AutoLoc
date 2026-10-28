package tn.esprit.spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.entity.Vehicule;
import tn.esprit.spring.service.Interface.IVehiculeService;

import java.math.BigDecimal;
import java.util.List;

@Tag(name = "Gestion des véhicules")
@RestController
@AllArgsConstructor
@RequestMapping("/VehiculeController")
public class VehiculeController {
    IVehiculeService iVehiculeService;

    @GetMapping("/VehiculeMoreEqual/{tarifJournalier}")
    public List<Vehicule> tarifVehiculeMoreEqual(@PathVariable BigDecimal tarifJournalier) {
        return iVehiculeService.tarifVehiculeMoreEqual(tarifJournalier);
    }

    @GetMapping("/VehiculeLess/{tarifJournalier}")
    public List<Vehicule> tarifVehiculeMoins(@PathVariable BigDecimal tarifJournalier) {
        return iVehiculeService.tarifVehiculeMoins(tarifJournalier);
    }

    @GetMapping("/Vehicule/{tarifJournalier}")
    public List<Vehicule> tarifVehicule(@PathVariable BigDecimal tarifJournalier) {
        return iVehiculeService.tarifVehicule(tarifJournalier);
    }

    @GetMapping("/VehiculeMarque/{marque}")
    public Long conterVehicule(@PathVariable String marque) {
        return iVehiculeService.conterVehicule(marque);
    }

    @GetMapping("/listsVeh/{immatriculation}")
    public Boolean vehiculeExist(@PathVariable String immatriculation) {
        return iVehiculeService.vehiculeExist(immatriculation);
    }

    @GetMapping("/listVeh/{modele}")
    public List<Vehicule> getModele(@PathVariable String modele) {
        return iVehiculeService.getModele(modele);
    }

    @GetMapping("/listVe/{marque}")
    public List<Vehicule> getMarqueSansCasse(@PathVariable String marque) {
        return iVehiculeService.getMarqueSansCasse(marque);
    }

    @GetMapping("/listValeurEnd/{valeur}")
    public List<Vehicule> getLastValeurMarque(@PathVariable String valeur) {
        return iVehiculeService.getLastValeurMarque(valeur);
    }

    @GetMapping("/listVal/{val}")
    public List<Vehicule> getValeurMarque(@PathVariable String val) {
        return iVehiculeService.getValeurMarque(val);
    }

    @GetMapping("/listV/{mot}")
    public List<Vehicule> getMarque(@PathVariable String mot) {
        return iVehiculeService.getMarque(mot);
    }

    @GetMapping("/listVehicules/{marque}")
    public List<Vehicule> getByMarque(@PathVariable String marque) {
        return iVehiculeService.getByMarque(marque);
    }

    @PutMapping("/Affect/{idAgence}/{idVehicule}")
    public Vehicule affecterVehiculeAgence(@PathVariable  Long idAgence, @PathVariable Long idVehicule) {
        return iVehiculeService.affecterVehiculeAgence(idAgence, idVehicule);
    }

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
