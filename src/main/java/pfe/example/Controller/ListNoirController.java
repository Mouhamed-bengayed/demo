package pfe.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import pfe.example.Service.ListenoirService;

import javax.persistence.Access;

@Service
public class ListNoirController {
    @Autowired
    ListenoirService listenoirService;

    @GetMapping("/delete/utilisateur")
    public void deleteutilisateur(long id) {
        listenoirService.

    }
}
