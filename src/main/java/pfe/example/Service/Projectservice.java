package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import pfe.example.Dao.ProjectRepository;
import pfe.example.Entites.Project;

import java.util.List;

public class Projectservice {
    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getAllProject() {

        projectRepository.findAll();
        return getAllProject();
    }
   // public Project addProject(Project p1){

    //    projectRepository.save(p1);

       // return addProject();}

}
