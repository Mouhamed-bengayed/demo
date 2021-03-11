package pfe.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfe.example.Entites.Category;
import pfe.example.Entites.Project;
import pfe.example.Service.Moderateursevice;

import java.util.List;

@RestController
public class ModerateurController {


    @Autowired
    Moderateursevice moderateursevice;

    @GetMapping("/list/project")
    public List<Project> getAllProject() {
        return moderateursevice.getAllProject();
    }

    @GetMapping("/list/Category")
    public List<Project> getAllCategory() {
        List<Category> lp = moderateursevice.getAllCategory();
        return getAllCategory();
    }

    @PostMapping("/add/category")
    public void addCategory(@RequestBody Category newCategory) {
        moderateursevice.addCategory(newCategory);
    }

    @DeleteMapping("locked/Carrier")
    public void lockedCarrier(@RequestBody Long id) {
        moderateursevice.blockedcarrier(id);
    }

    @DeleteMapping("locked/Carrier")
    public void lockedContributor(@RequestBody Long id) {
        moderateursevice.bloqueContributor(id);

    }


}
