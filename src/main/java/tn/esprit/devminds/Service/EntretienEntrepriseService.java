package tn.esprit.devminds.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.esprit.devminds.Entities.EntretienEntreprise;
import tn.esprit.devminds.Repository.EntretienEntrepriseRepository;

@AllArgsConstructor
@Service
public class EntretienEntrepriseService implements IEntretienEntreprise {
    @Autowired
    EntretienEntrepriseRepository entretienRepository;

    @Override
    public List<EntretienEntreprise> getAllEntretiens() {
        return (List<EntretienEntreprise>) entretienRepository.findAll();
    }

    @Override
    public EntretienEntreprise getEntretienById(Long id) {
        return entretienRepository.findById(id).orElse(null);
    }

    @Override
    public EntretienEntreprise addEntretien(EntretienEntreprise entretien) {
        return entretienRepository.save(entretien);
    }

    @Override
    public EntretienEntreprise updateEntretien(EntretienEntreprise entretien) {
        return entretienRepository.save(entretien);
    }

    @Override
    public void deleteEntretien(Long id) {
        entretienRepository.deleteById(id);
    }
}
