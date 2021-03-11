package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.*;
import pfe.example.Entites.Moderateur;
import pfe.example.Entites.PorteurDeProject;
import pfe.example.Entites.Project;
import pfe.example.Entites.Utilisateur;

@Service
public class ListenoirService {

    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Autowired
    PorteurRepository porteurRepository;
    @Autowired
    ContibuteurRepository contibuteurRepository;
    @Autowired
    ModerateurRepository moderateurRepository;

    public void addModeurateur(Moderateur moderateur) {
        moderateurRepository.save(moderateur);
    }

    public void addPorteur(PorteurDeProject porteurDeProject) {
        porteurRepository.save(porteurDeProject);
    }

    public void deleteModurateur(Long idmoderateur) {
        utilisateurRepository.deleteById(idmoderateur);
    }

    public void deletePorteur(Long idporteur) {
        utilisateurRepository.deleteById(idporteur);
    }


}
