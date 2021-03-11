package pfe.example.Entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


import javax.persistence.*;

import java.util.Collection;

@Entity
@DiscriminatorValue("contibuteur")
@Data
public class Contributeur extends Utilisateur {


    @ManyToOne
    private ListeNoir listeNoir;
    @OneToMany(mappedBy = "contributeur")
    @JsonIgnoreProperties("contributeur")
    private Collection<Contribution> contributions;
    @OneToMany(mappedBy = "contributeur")
    @JsonIgnoreProperties("contributeur")
    private Collection<Vote> votes;


}
