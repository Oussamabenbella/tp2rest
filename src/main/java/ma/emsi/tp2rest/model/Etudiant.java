package ma.emsi.tp2rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.tp2rest.enums.Genre;
@Entity @Data @NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
@Builder
public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false,name = "nom_Et")
    private String nom;
    @Column(name = "prenom_Et",nullable = false)
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "id_centre",nullable = false)
    private Centre centre;

}