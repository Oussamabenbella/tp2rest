package ma.emsi.tp2rest;

import ma.emsi.tp2rest.enums.Genre;
import ma.emsi.tp2rest.model.Centre;
import ma.emsi.tp2rest.model.Etudiant;
import ma.emsi.tp2rest.repositories.CentreRepository;
import ma.emsi.tp2rest.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp2RestApplication implements CommandLineRunner {
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	CentreRepository centreRepository;
	@Override
	public void run(String... args) throws Exception {
		Centre centre1 = Centre.builder()
				.nom_centre("Centre 1")
				.adresse("Maarif")
				.build();
		centreRepository.save(centre1);
		Centre centre2 = Centre.builder()
				.nom_centre("Centre 2")
				.adresse("Roudani")
				.build();
		centreRepository.save(centre2);
		Etudiant etudiant1 = Etudiant.builder()
				.nom("Benbella")
				.prenom("Oussama")
				.genre(Genre.HOMME)
				.centre(centre1)
				.build();
		etudiantRepository.save(etudiant1);
		Etudiant etudiant2 = Etudiant.builder()
				.nom("Feddi")
				.prenom("haitam")
				.genre(Genre.HOMME)
				.centre(centre1)
				.build();
		etudiantRepository.save(etudiant2);
		Etudiant etudiant3 = Etudiant.builder()
				.nom("Benbella")
				.prenom("Oussama")
				.genre(Genre.HOMME)
				.centre(centre2)
				.build();
		etudiantRepository.save(etudiant3);
	}

	public static void main(String[] args) {
		SpringApplication.run(Tp2RestApplication.class, args);
	}

}
