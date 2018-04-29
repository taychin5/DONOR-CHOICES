package com.example.test_chat_app_two.value_class;

/**
 * Created by Toddy on 29/03/2018.
 */

public class DonateList {
    private String when;
    private String time;
    private int story;
    private int patch;
    private String chooseDescription;
    private String charity;

    public DonateList(String time,String when, int story,String charity, int patch, String chooseDescription) {
        this.time = time;
        this.when = when;
        this.story = story;
        this.patch = patch;
        this.chooseDescription = chooseDescription;
        this.charity = charity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCharity() { return charity; }
    public void setCharity(String charity) { this.charity = charity; }

    public String getWhen() {
        return when;
    }
    public void setWhen(String when) {
        this.when = when;
    }

    public int getStory() {
        return story;
    }
    public void setStory(int story) {
        this.story = story;
    }

    public int getPatch() {
        return patch;
    }
    public void setPatch(int patch) {
        this.patch = patch;
    }

    public String getChooseDescription() {
        return chooseDescription;
    }

    public void setChooseDescription(String chooseDescription) {
        this.chooseDescription = chooseDescription;
    }
}
