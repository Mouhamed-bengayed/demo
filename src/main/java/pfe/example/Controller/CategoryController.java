package pfe.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pfe.example.Entites.Category;
import pfe.example.Service.CategoryService;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/list/category")
    public List<Category> getAllCategory(){
        categoryService.getAllCategories();
        return getAllCategory();
    }

}
