package tn.esprit.spring.service.Impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Reservation;
import tn.esprit.spring.repository.ReservationRepository;
import tn.esprit.spring.service.Interface.IReservationService;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceIMPL implements IReservationService {

    ReservationRepository reservationRepository;

    @Transactional
    @Override
    public Reservation desaffecterReservationVehicule(Long idReservation) {
       Reservation reservation = reservationRepository.findById(idReservation).orElse(null);

       reservation.setVehicule(null);
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation ajouterContartReservation(Reservation r) {
        return reservationRepository.save(r);


    }

    @Override
    public Reservation creer(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation obtenirParId(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> listerTous() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation mettreAJour(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimer(Long id) {
reservationRepository.deleteById(id);
    }
}
