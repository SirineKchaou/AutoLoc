package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Vehicule;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {

    List<Vehicule> findByMarque(String m);

    List<Vehicule> findByMarqueContaining(String mot);

    List<Vehicule> findByMarqueStartingWith(String val);

    List<Vehicule> findByMarqueEndingWith(String valeur);

    List<Vehicule> findByMarqueIgnoreCase(String marque);

    List<Vehicule> findByModele(String modele);

    Boolean existsByImmatriculation(String immatriculation);

    Long countByMarque(String marque);

    List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarifJournalier);

    List<Vehicule> findByTarifJournalierLessThan(BigDecimal tarifJournalier);

    List<Vehicule> findByTarifJournalierGreaterThanEqual(BigDecimal tarifJournalier);

    List<Vehicule> findByTarifJournalierBetween(
            BigDecimal min,
            BigDecimal max
    );

    List<Vehicule> findAllByOrderByTarifJournalierAsc();

    List<Vehicule> findAllByOrderByTarifJournalierDesc();


}
