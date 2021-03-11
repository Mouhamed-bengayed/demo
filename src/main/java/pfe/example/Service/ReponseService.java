package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.MessageRepository;
import pfe.example.Entites.Message;

@Service
public class ReponseService {
    @Autowired
    MessageRepository messageRepository;

    public void reponseMessage(Message message) {




    }
}
