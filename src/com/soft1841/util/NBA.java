package com.soft1841.util;

import java.util.ArrayList;
import java.util.List;

public class NBA {
    private String name;
    private String nickname;
    private Double score;
    private Double rebound;
    private Double assist;

    public NBA(String name, String nickname, Double score, Double rebound, Double assist) {
        this.name = name;
        this.nickname = nickname;
        this.score = score;
        this.rebound = rebound;
        this.assist = assist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getRebound() {
        return rebound;
    }

    public void setRebound(Double rebound) {
        this.rebound = rebound;
    }

    public Double getAssist() {
        return assist;
    }

    public void setAssist(Double assist) {
        this.assist = assist;
    }

    @Override
    public String toString() {
        return "NBA{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", score=" + score +
                ", rebound=" + rebound +
                ", assist=" + assist +
                '}';
    }
}

