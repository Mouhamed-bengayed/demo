package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfe.example.Entites.Project;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

    static void deleteById(long id) {
    }

    public List<Project> findbycategorie(long id);
    public void deleteBy(long id);


}
