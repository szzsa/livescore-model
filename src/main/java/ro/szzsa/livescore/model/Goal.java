package ro.szzsa.livescore.model;

import java.util.List;

public class Goal extends Event {

  private GoalType type;

  private String author;

  private List<String> assists;

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
}
