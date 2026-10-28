package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.CategorieVehicule;
import tn.esprit.spring.entity.Client;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    List<Client> findByNomAndPrenomAndReservationsVehiculeMarqueAndReservationsVehiculeCategorie(String nom, String prenom, String marque, CategorieVehicule categorie);
}
