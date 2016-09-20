package ro.szzsa.livescore.model;

public class Penalty {

  private PenaltyType type;

  private String gameId;

  private String player;

  private String teamCode;

  private String time;

  public PenaltyType getType() {
    return type;
  }

  public void setType(PenaltyType type) {
    this.type = type;
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
