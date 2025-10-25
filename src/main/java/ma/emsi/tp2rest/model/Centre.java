package ma.emsi.tp2rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor @Builder
public class Centre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,name = "nom_Ctr")
    private String nom_centre;
    private String adresse;

    @OneToMany(mappedBy = "centre")
    private List<Etudiant> etudiants;
}
