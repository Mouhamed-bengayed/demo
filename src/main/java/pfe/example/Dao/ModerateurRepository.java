package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfe.example.Entites.Moderateur;

@Repository
public interface ModerateurRepository extends JpaRepository<Moderateur,Long> {



}
