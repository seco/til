package examples.boot.sunnyboard.repository;

import examples.boot.sunnyboard.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

// <entity, identificationType>
public interface BoardRepository extends JpaRepository<Board, Long> {

}
