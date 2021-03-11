package pfe.example.Entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("Porteur_p")
@Data
public class PorteurDeProject extends Utilisateur {
    @ManyToOne
    private ListeNoir listeNoir;
    @OneToMany(mappedBy = "porteurDeProject")
    @JsonIgnoreProperties("porteurDeProject")
    private List<Project> project;


}
