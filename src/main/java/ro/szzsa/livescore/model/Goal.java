package ro.szzsa.livescore.model;

import java.util.List;

public class Goal {

  private String gameId;

  private String teamCode;

  private String author;

  private List<String> assists;

  private String time;

  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public String getTeamCode() {
    return teamCode;
  }

  public void setTeamCode(String teamCode) {
    this.teamCode = teamCode;
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
