package ma.emsi.tp2rest.repositories;

import ma.emsi.tp2rest.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CentreRepository extends JpaRepository<Centre, Integer> {
}