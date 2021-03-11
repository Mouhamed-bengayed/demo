package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.CommentaireRepository;
import pfe.example.Entites.Commentaire;

import java.util.List;

@Service
public class CommentaireService {

    @Autowired
    CommentaireRepository commentaireRepository;
    public List<Commentaire> getAllCommentaires(){
        commentaireRepository.findAll();
        return getAllCommentaires();
    }
}
