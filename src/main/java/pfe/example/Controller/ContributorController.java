package pfe.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pfe.example.Entites.Category;
import pfe.example.Entites.Commentaire;
import pfe.example.Entites.Project;
import pfe.example.Service.CategoryService;
import pfe.example.Service.CommentaireService;
import pfe.example.Service.Projectservice;

import java.util.List;

@Controller
public class ContributorController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    Projectservice projectservice;
    @Autowired
    CommentaireService commentaireService;

    @GetMapping("/list/Category")
    public String getAllCategory(Model model) {
        try {
            List<Category> ls = categoryService.getAllCategories();
            model.addAllAttributes(ls);
        } catch (Exception e) {
            model.addAllAttributes('exception', e);
        }
        return "getAllCategory";
    }

    @GetMapping("/List/comment")
    public List<Commentaire> gettAllcomment() {

        List<Commentaire> ls = commentaireService.getAllCommentaires();

        return gettAllcomment();
    }

    @GetMapping("/list/project")
    public String getAllProject() {
        List<Project> lp = projectservice.getAllProject();

        return "lp";
    }


}