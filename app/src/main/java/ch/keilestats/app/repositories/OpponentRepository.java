package ch.keilestats.app.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ch.keilestats.app.entities.*;

@Repository
public interface OpponentRepository extends JpaRepository<Opponent, Long> {

	Optional<Opponent> findByOpponentName(String opponentName);

}