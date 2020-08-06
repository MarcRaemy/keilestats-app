package ch.keilestats.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.keilestats.app.entities.Goal;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {

}