package pfe.example.Entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
public class Commentaire implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private Date datecommontaire;
private String commontaire;


    @ManyToOne
    private Contributeur contibuteur;
    @ManyToOne
    private Project project;
    @OneToMany(mappedBy = "commentaire")
    @JsonIgnoreProperties("commentaire")
    private Collection<Reponse> reponses;

}
