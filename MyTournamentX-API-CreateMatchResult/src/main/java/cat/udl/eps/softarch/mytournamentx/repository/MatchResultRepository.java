package cat.udl.eps.softarch.mytournamentx.repository;

import cat.udl.eps.softarch.mytournamentx.domain.MatchResult;
import cat.udl.eps.softarch.mytournamentx.domain.Player;
import cat.udl.eps.softarch.mytournamentx.domain.Match;
import cat.udl.eps.softarch.mytournamentx.domain.Team;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatchResultRepository extends PagingAndSortingRepository<MatchResult, String> {

    MatchResult findById(@Param("id") Integer id);

    List<MatchResult> findByMatch(@Param("match") Match match);

    List<MatchResult> findByWinner(@Param("winner") Team winner);

    List<MatchResult> findByDescriptionContaining(@Param("description") String description);

}
