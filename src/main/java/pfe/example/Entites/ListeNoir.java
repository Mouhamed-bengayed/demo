package pfe.example.Entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
@Data
public class ListeNoir {
    @Id
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "listeNoir")
    @JsonIgnoreProperties("listeNoir")
    private Collection<PorteurDeProject> porteurdeprojets;
    @OneToMany(mappedBy = "listeNoir")
    @JsonIgnoreProperties("listeNoir")
    private Collection<Contributeur> contibuteurs;


}
