package ro.szzsa.livescore.model;

import java.util.List;

public class Game {

  private String id;

  private String homeTeamCode;

  private String visitorTeamCode;

  private long date;

  private GameStatus status;

  private int homeTeamScore;

  private int visitorTeamScore;

  private String time;

  private List<Goal> goals;

  private List<Penalty> penalties;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getHomeTeamCode() {
    return homeTeamCode;
  }

  public void setHomeTeamCode(String homeTeamCode) {
    this.homeTeamCode = homeTeamCode;
  }

  public String getVisitorTeamCode() {
    return visitorTeamCode;
  }

  public void setVisitorTeamCode(String visitorTeamCode) {
    this.visitorTeamCode = visitorTeamCode;
  }

  public long getDate() {
    return date;
  }

  public void setDate(long date) {
    this.date = date;
  }

  public GameStatus getStatus() {
    return status;
  }

  public void setStatus(GameStatus status) {
    this.status = status;
  }

  public int getHomeTeamScore() {
    return homeTeamScore;
  }

  public void setHomeTeamScore(int homeTeamScore) {
    this.homeTeamScore = homeTeamScore;
  }

  public int getVisitorTeamScore() {
    return visitorTeamScore;
  }

  public void setVisitorTeamScore(int visitorTeamScore) {
    this.visitorTeamScore = visitorTeamScore;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public List<Goal> getGoals() {
    return goals;
  }

  public void setGoals(List<Goal> goals) {
    this.goals = goals;
  }

  public List<Penalty> getPenalties() {
    return penalties;
  }

  public void setPenalties(List<Penalty> penalties) {
    this.penalties = penalties;
  }
}
