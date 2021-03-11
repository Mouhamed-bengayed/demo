package pfe.example.Entites;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Message {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Contributeur contributeur;
    @ManyToOne
    private PorteurDeProject porteurDeProject;
}
