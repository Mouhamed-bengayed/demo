package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.*;

import pfe.example.Entites.Commentaire;
import pfe.example.Entites.Message;
import pfe.example.Entites.Project;

@Service
public class PorteurService {

    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    CommentaireRepository commentaireRepository;

    @Autowired
    MessageRepository messageRepository;

    public Project addProject(Project newproject) {
        return projectRepository.save(newproject);
    }


    public void getAllCategories() {
        categorieRepository.findAll();
    }

    public void getAllProject() {
        projectRepository.findAll();
    }

    public void deleteProject(long id) {
        ProjectRepository.deleteById(id);
    }

    public void deleteComments(long id) { commentaireRepository.deleteById(id); }


    public void getAllComments() {
        commentaireRepository.findAll();
    }

    public void addCommmebts(Commentaire commentaire) {
        commentaireRepository.save(commentaire);
    }

}
