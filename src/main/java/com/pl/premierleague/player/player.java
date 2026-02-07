package com.pl.premierleague.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pl_players_2018_2019", schema = "public")
public class player {

    @Id
    @Column(name = "full_name", unique = true)
    private String full_name;

    private Integer age;

    private String position;

    @Column(name = "Current Club")
    private String Current_Club;

    private Integer minutes_played_overall;
    private Integer minutes_played_home;
    private Integer minutes_played_away;

    @Column(name = "nationality")
    private String Nationality;

    private Integer appearances_overall;
    private Integer appearances_home;
    private Integer appearances_away;
    private Integer goals_overall;
    private Integer goals_home;
    private Integer goals_away;
    private Integer assists_overall;
    private Integer assists_home;
    private Integer assists_away;
    private Integer penalty_goals;
    private Integer penalty_misses;
    private Integer yellow_cards_overall;
    private Integer red_cards_overall;

    private Double goals_involved_per_90_overall;
    private Double assists_involved_per_90_overall;
    private Double goals_per_90_overall;
    private Double min_per_match;
    private Double cards_per_90_overall;

    public player() {
    }

    public player(String full_name) {
        this.full_name = full_name;
    }


    public String getFull_name() { return full_name; }
    public void setFull_name(String full_name) { this.full_name = full_name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getCurrent_Club() { return Current_Club; }
    public void setCurrent_Club(String current_Club) { Current_Club = current_Club; }

    public Integer getMinutes_played_overall() { return minutes_played_overall; }
    public void setMinutes_played_overall(Integer minutes_played_overall) { this.minutes_played_overall = minutes_played_overall; }

    public Integer getMinutes_played_home() { return minutes_played_home; }
    public void setMinutes_played_home(Integer minutes_played_home) { this.minutes_played_home = minutes_played_home; }

    public Integer getMinutes_played_away() { return minutes_played_away; }
    public void setMinutes_played_away(Integer minutes_played_away) { this.minutes_played_away = minutes_played_away; }

    public String getNationality() { return Nationality; }
    public void setNationality(String nationality) { Nationality = nationality; }

    public Integer getAppearances_overall() { return appearances_overall; }
    public void setAppearances_overall(Integer appearances_overall) { this.appearances_overall = appearances_overall; }

    public Integer getAppearances_home() { return appearances_home; }
    public void setAppearances_home(Integer appearances_home) { this.appearances_home = appearances_home; }

    public Integer getAppearances_away() { return appearances_away; }
    public void setAppearances_away(Integer appearances_away) { this.appearances_away = appearances_away; }

    public Integer getGoals_overall() { return goals_overall; }
    public void setGoals_overall(Integer goals_overall) { this.goals_overall = goals_overall; }

    public Integer getGoals_home() { return goals_home; }
    public void setGoals_home(Integer goals_home) { this.goals_home = goals_home; }

    public Integer getGoals_away() { return goals_away; }
    public void setGoals_away(Integer goals_away) { this.goals_away = goals_away; }

    public Integer getAssists_overall() { return assists_overall; }
    public void setAssists_overall(Integer assists_overall) { this.assists_overall = assists_overall; }

    public Integer getAssists_home() { return assists_home; }
    public void setAssists_home(Integer assists_home) { this.assists_home = assists_home; }

    public Integer getAssists_away() { return assists_away; }
    public void setAssists_away(Integer assists_away) { this.assists_away = assists_away; }

    public Integer getPenalty_goals() { return penalty_goals; }
    public void setPenalty_goals(Integer penalty_goals) { this.penalty_goals = penalty_goals; }

    public Integer getPenalty_misses() { return penalty_misses; }
    public void setPenalty_misses(Integer penalty_misses) { this.penalty_misses = penalty_misses; }

    public Integer getYellow_cards_overall() { return yellow_cards_overall; }
    public void setYellow_cards_overall(Integer yellow_cards_overall) { this.yellow_cards_overall = yellow_cards_overall; }

    public Integer getRed_cards_overall() { return red_cards_overall; }
    public void setRed_cards_overall(Integer red_cards_overall) { this.red_cards_overall = red_cards_overall; }

    public Double getGoals_involved_per_90_overall() { return goals_involved_per_90_overall; }
    public void setGoals_involved_per_90_overall(Double goals_involved_per_90_overall) { this.goals_involved_per_90_overall = goals_involved_per_90_overall; }

    public Double getAssists_involved_per_90_overall() { return assists_involved_per_90_overall; }
    public void setAssists_involved_per_90_overall(Double assists_involved_per_90_overall) { this.assists_involved_per_90_overall = assists_involved_per_90_overall; }

    public Double getGoals_per_90_overall() { return goals_per_90_overall; }
    public void setGoals_per_90_overall(Double goals_per_90_overall) { this.goals_per_90_overall = goals_per_90_overall; }

    public Double getMin_per_match() { return min_per_match; }
    public void setMin_per_match(Double min_per_match) { this.min_per_match = min_per_match; }

    public Double getCards_per_90_overall() { return cards_per_90_overall; }
    public void setCards_per_90_overall(Double cards_per_90_overall) { this.cards_per_90_overall = cards_per_90_overall; }
}