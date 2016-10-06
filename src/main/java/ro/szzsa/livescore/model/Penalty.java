package ro.szzsa.livescore.model;

public class Penalty extends Event {

  private PenaltyType type;

  private String player;

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
}
