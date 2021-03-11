package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.example.Entites.Compte;

public interface CompteRepository extends JpaRepository<Compte,String> {

}
