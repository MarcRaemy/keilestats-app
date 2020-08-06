package ch.keilestats.app.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.keilestats.app.entities.*;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

	Optional<Player> findByFirstnameAndLastname(String firstname, String lastname);

}
