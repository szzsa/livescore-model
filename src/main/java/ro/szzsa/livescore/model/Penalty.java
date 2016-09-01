package ro.szzsa.livescore.model;

import java.util.List;

public class Penalty {

  private List<PenaltyType> types;

  private String gameId;

  private String player;

  private String teamCode;

  private String time;

  public List<PenaltyType> getTypes() {
    return types;
  }

  public void setTypes(List<PenaltyType> types) {
    this.types = types;
  }

  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public String getPlayer() {
    return player;
  }

  public void setPlayer(String player) {
    this.player = player;
  }

  public String getTeamCode() {
    return teamCode;
  }

  public void setTeamCode(String teamCode) {
    this.teamCode = teamCode;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}
