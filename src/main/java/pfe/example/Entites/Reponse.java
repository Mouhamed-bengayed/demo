package pfe.example.Entites;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;
@Entity
@Data
public class Reponse implements Serializable {
    @Id
    private Long id;
    private Date datereponse;
    private String reponse;
    @ManyToOne
    private PorteurDeProject porteurDeProject;
    @ManyToOne
    private Commentaire commentaire;
    }
