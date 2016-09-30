package ro.szzsa.livescore.model;

import java.util.List;

public class Goal extends Model {

  private long gameId;

  private long teamId;

  private GoalType type;

  private String author;

  private List<String> assists;

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

  public GoalType getType() {
    return type;
  }

  public void setType(GoalType type) {
    this.type = type;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public List<String> getAssists() {
    return assists;
  }

  public void setAssists(List<String> assists) {
    this.assists = assists;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}
