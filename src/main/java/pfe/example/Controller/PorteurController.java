package pfe.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfe.example.Entites.Category;
import pfe.example.Entites.Commentaire;
import pfe.example.Entites.Project;
import pfe.example.Service.PorteurService;

import java.util.List;

@RestController
public class PorteurController {

    @Autowired
    PorteurService porteurService;

    @GetMapping("/list/Category")
    public List<Category> getAllCategory() {
        porteurService.getAllCategories();
        return getAllCategory();
    }

    @PostMapping("/add/Project")
    public void addProject(@RequestParam Project p1) {
        porteurService.addProject(p1);
    }

    @PostMapping("/add/Comments")
    public void addProject(@RequestParam Commentaire commentaire) {
        porteurService.addCommmebts(commentaire);
    }

    @GetMapping("/list/Project")
    public List<Category> getAllProject() {
        porteurService.getAllProject();
        return getAllProject();
    }


    @GetMapping("/List/Comments")
    public List<Project> getComments() {
        porteurService.getAllComments();
        return getComments();
    }

    @DeleteMapping("/delete/comments")
    public void deleteComments(@RequestBody Long id) {
        porteurService.deleteComments(id);
    }

    @DeleteMapping("/delete/comments")
    public void deleteProject(@RequestBody Long id) {
        porteurService.deleteProject(id);
    }

}
