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

    private int age;

    private String position;

    private String Current_Club;

    private int minutes_played_overall;

    private int minutes_played_home;

    private int minutes_played_away;

    private String Nationality;

    private int appearances_overall;

    private int appearances_home;

    private int appearances_away;

    private int goals_overall;

    private int goals_home;

    private int goals_away;

    private int assists_overall;

    private int assists_home;

    private int assists_away;

    private int penalty_goals;

    private int penalty_misses;

    private int yellow_cards_overall;

    private int red_cards_overall;

    private int goals_involved_per_90_overall;

    private int assists_involved_per_90_overall;

    private int goals_per_90_overall;

    private int min_per_match;

    private int cards_per_90_overall;

    public player(String full_name) {
        this.full_name = full_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCurrent_Club() {
        return Current_Club;
    }

    public void setCurrent_Club(String current_Club) {
        Current_Club = current_Club;
    }

    public int getMinutes_played_overall() {
        return minutes_played_overall;
    }

    public void setMinutes_played_overall(int minutes_played_overall) {
        this.minutes_played_overall = minutes_played_overall;
    }

    public int getMinutes_played_home() {
        return minutes_played_home;
    }

    public void setMinutes_played_home(int minutes_played_home) {
        this.minutes_played_home = minutes_played_home;
    }

    public int getMinutes_played_away() {
        return minutes_played_away;
    }

    public void setMinutes_played_away(int minutes_played_away) {
        this.minutes_played_away = minutes_played_away;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public int getAppearances_overall() {
        return appearances_overall;
    }

    public void setAppearances_overall(int appearances_overall) {
        this.appearances_overall = appearances_overall;
    }

    public int getAppearances_home() {
        return appearances_home;
    }

    public void setAppearances_home(int appearances_home) {
        this.appearances_home = appearances_home;
    }

    public int getAppearances_away() {
        return appearances_away;
    }

    public void setAppearances_away(int appearances_away) {
        this.appearances_away = appearances_away;
    }

    public int getGoals_overall() {
        return goals_overall;
    }

    public void setGoals_overall(int goals_overall) {
        this.goals_overall = goals_overall;
    }

    public int getGoals_home() {
        return goals_home;
    }

    public void setGoals_home(int goals_home) {
        this.goals_home = goals_home;
    }

    public int getGoals_away() {
        return goals_away;
    }

    public void setGoals_away(int goals_away) {
        this.goals_away = goals_away;
    }

    public int getAssists_overall() {
        return assists_overall;
    }

    public void setAssists_overall(int assists_overall) {
        this.assists_overall = assists_overall;
    }

    public int getAssists_home() {
        return assists_home;
    }

    public void setAssists_home(int assists_home) {
        this.assists_home = assists_home;
    }

    public int getAssists_away() {
        return assists_away;
    }

    public void setAssists_away(int assists_away) {
        this.assists_away = assists_away;
    }

    public int getPenalty_goals() {
        return penalty_goals;
    }

    public void setPenalty_goals(int penalty_goals) {
        this.penalty_goals = penalty_goals;
    }

    public int getPenalty_misses() {
        return penalty_misses;
    }

    public void setPenalty_misses(int penalty_misses) {
        this.penalty_misses = penalty_misses;
    }

    public int getYellow_cards_overall() {
        return yellow_cards_overall;
    }

    public void setYellow_cards_overall(int yellow_cards_overall) {
        this.yellow_cards_overall = yellow_cards_overall;
    }

    public int getRed_cards_overall() {
        return red_cards_overall;
    }

    public void setRed_cards_overall(int red_cards_overall) {
        this.red_cards_overall = red_cards_overall;
    }

    public int getGoals_involved_per_90_overall() {
        return goals_involved_per_90_overall;
    }

    public void setGoals_involved_per_90_overall(int goals_involved_per_90_overall) {
        this.goals_involved_per_90_overall = goals_involved_per_90_overall;
    }

    public int getAssists_involved_per_90_overall() {
        return assists_involved_per_90_overall;
    }

    public void setAssists_involved_per_90_overall(int assists_involved_per_90_overall) {
        this.assists_involved_per_90_overall = assists_involved_per_90_overall;
    }

    public int getGoals_per_90_overall() {
        return goals_per_90_overall;
    }

    public void setGoals_per_90_overall(int goals_per_90_overall) {
        this.goals_per_90_overall = goals_per_90_overall;
    }

    public int getMin_per_match() {
        return min_per_match;
    }

    public void setMin_per_match(int min_per_match) {
        this.min_per_match = min_per_match;
    }

    public int getCards_per_90_overall() {
        return cards_per_90_overall;
    }

    public void setCards_per_90_overall(int cards_per_90_overall) {
        this.cards_per_90_overall = cards_per_90_overall;
    }
}
