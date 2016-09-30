package ro.szzsa.livescore.model;

public class Penalty extends Model {

  private long gameId;

  private long teamId;

  private int order;

  private PenaltyType type;

  private String player;

  private String time;

  public long getGameId() {
    return gameId;
  }

  public void setGameId(long gameId) {
    this.gameId = gameId;
  }

  public long getTeamId() {
    return teamId;
  }

  public void setTeamId(long teamId) {
    this.teamId = teamId;
  }

  public int getOrder() {
    return order;
  }

  public void setOrder(int order) {
    this.order = order;
  }

  public PenaltyType getType() {
    return type;
  }

  public void setType(PenaltyType type) {
    this.type = type;
  }

  public String getPlayer() {
    return player;
  }

  public void setPlayer(String player) {
    this.player = player;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}
