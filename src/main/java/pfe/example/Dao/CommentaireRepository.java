package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.example.Entites.Commentaire;
public interface CommentaireRepository extends JpaRepository<Commentaire,Long> {

}
