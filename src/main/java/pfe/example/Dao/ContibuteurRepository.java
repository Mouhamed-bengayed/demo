package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfe.example.Entites.Contributeur;
import pfe.example.Entites.Project;

import java.util.List;

@Repository
public interface ContibuteurRepository extends JpaRepository<Contributeur,Long> {

public List<Project> findFirstByNom(String nom);

}
