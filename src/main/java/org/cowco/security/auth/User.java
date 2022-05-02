package org.cowco.security.auth;

import java.util.List;

public class User {
    private String identifier;
    private List<String> teams;

    public User(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }
}
