package ro.szzsa.livescore.model;

import java.util.List;

/**
 *
 */
public class LeaguePhase extends Model {

  private String title;

  private boolean isActive;

  private boolean isPlayoff;

  private int seriesLimit;

  private String places;

  private int numberOfTeams;

  private List<Standings> standingsList;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  public boolean isPlayoff() {
    return isPlayoff;
  }

  public void setPlayoff(boolean playoff) {
    isPlayoff = playoff;
  }

  public int getSeriesLimit() {
    return seriesLimit;
  }

  public void setSeriesLimit(int seriesLimit) {
    this.seriesLimit = seriesLimit;
  }

  public String getPlaces() {
    return places;
  }

  public void setPlaces(String places) {
    this.places = places;
  }

  public int getNumberOfTeams() {
    return numberOfTeams;
  }

  public void setNumberOfTeams(int numberOfTeams) {
    this.numberOfTeams = numberOfTeams;
  }

  public List<Standings> getStandingsList() {
    return standingsList;
  }

  public void setStandingsList(List<Standings> standingsList) {
    this.standingsList = standingsList;
  }
}
