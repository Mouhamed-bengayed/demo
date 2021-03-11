package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.example.Entites.Category;

public interface CategorieRepository extends JpaRepository<Category,Long> {
}
