package pfe.example.Entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
@Entity
@Data
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long numeroproject;
    private String nom;
    private String descrption;
    private Date dateDecreation;
    @ManyToOne
    private Category category;
    @OneToMany(mappedBy = "project")
    private Collection<Vote> votes;
    @OneToMany(mappedBy = "project")
    @JsonIgnoreProperties("project")
    private List<Contribution> contribution;
    @ManyToOne
    private PorteurDeProject porteurDeProject;


}
