package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.CategorieRepository;
import pfe.example.Dao.ProjectRepository;
import pfe.example.Entites.Category;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    CategorieRepository categorieRepository;

public List<Category> getAllCategories(){
    categorieRepository.findAll();
    return getAllCategories();
}




}
