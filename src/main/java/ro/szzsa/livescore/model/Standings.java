package ro.szzsa.livescore.model;

import java.util.List;

public class Standings extends Model {

  private long leaguePhaseId;

  private List<TeamStats> stats;

  public long getLeaguePhaseId() {
    return leaguePhaseId;
  }

  public void setLeaguePhaseId(long leaguePhaseId) {
    this.leaguePhaseId = leaguePhaseId;
  }

  public List<TeamStats> getStats() {
    return stats;
  }

  public void setStats(List<TeamStats> stats) {
    this.stats = stats;
  }
}
