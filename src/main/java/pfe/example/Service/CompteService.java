package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.CompteRepository;
import pfe.example.Entites.*;
import java.util.List;

@Service
public class CompteService {
    @Autowired
    CompteRepository compteRepository;

    public List<Compte> getAllCompte(){
        compteRepository.findAll();
        return getAllCompte();
    }


}
