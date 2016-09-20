package ro.szzsa.livescore.model;

/**
 *
 */
public enum GoalType {

  /**
   * Goal scored when both teams have the same amount of skater are on the ice.
   */
  EQ,

  /**
   * Goal scored by a team that has one more skater on ice than its opponent.
   */
  PP1,

  /**
   * Goal scored by a team that has two more skaters on ice than its opponent.
   */
  PP2,

  /**
   * Goal scored by a team that has one fewer skater on ice than its opponent.
   */
  SH1,

  /**
   * Goal scored by a team that has two fewer skaters on ice than its opponent.
   */
  SH2,

  /**
   * Goal scored during a penalty shot.
   */
  PS,

  /**
   * Goal scored during the game winner shootout.
   */
  GWS
}
