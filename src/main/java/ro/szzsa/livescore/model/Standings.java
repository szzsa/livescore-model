package ro.szzsa.livescore.model;

import java.util.List;

public class Standings {

  private int id;

  private String title;

  private List<TeamStats> stats;

  private boolean isGroup;

  private int seriesLimit;

  private boolean active;

  private String places;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<TeamStats> getStats() {
    return stats;
  }

  public void setStats(List<TeamStats> stats) {
    this.stats = stats;
  }

  public boolean isGroup() {
    return isGroup;
  }

  public void setGroup(boolean isGroup) {
    this.isGroup = isGroup;
  }

  public int getSeriesLimit() {
    return seriesLimit;
  }

  public void setSeriesLimit(int seriesLimit) {
    this.seriesLimit = seriesLimit;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean isActive) {
    this.active = isActive;
  }

  public String getPlaces() {
    return places;
  }

  public void setPlaces(String places) {
    this.places = places;
  }
}
