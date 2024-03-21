package com.project.opendota.dto;
public class ApiResponse {
    public ApiResponse(String personaname, String name, boolean plus, String steamid){
        this.personaname = personaname;
        this.name = name;
        this.plus = plus;
        this.steamid = steamid;

    }

    private String personaname;
    private String name;
    private boolean plus;
    private String steamid;

    public String getPersonaname() {
        return personaname;
    }
    public void setPersonaname(String personaname) {
        this.personaname = personaname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPlus() {
        return plus;
    }
    public void setPlus(boolean plus) {
        this.plus = plus;
    }

    public String getSteamid() {
        return steamid;
    }

    public void setSteamid(String steamid) {
        this.steamid = steamid;
    }
}
