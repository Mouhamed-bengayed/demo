package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfe.example.Entites.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
}
