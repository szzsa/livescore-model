package ro.szzsa.livescore.model;

import java.util.List;

public class Standings {

  private String id;

  private String title;

  private List<TeamStats> stats;

  private boolean isPlayoff;

  private int seriesLimit;

  private boolean isActive;

  private String places;

  public String getId() {
    return id;
  }

  public void setId(String id) {
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

  public boolean isPlayoff() {
    return isPlayoff;
  }

  public void setPlayoff(boolean isGroup) {
    this.isPlayoff = isGroup;
  }

  public int getSeriesLimit() {
    return seriesLimit;
  }

  public void setSeriesLimit(int seriesLimit) {
    this.seriesLimit = seriesLimit;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  public String getPlaces() {
    return places;
  }

  public void setPlaces(String places) {
    this.places = places;
  }
}
