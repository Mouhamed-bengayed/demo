package pfe.example.Entites;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@DiscriminatorValue("moderateur")
@Data
public class Moderateur extends Utilisateur {

}
