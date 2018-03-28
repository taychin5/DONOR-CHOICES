package com.example.test_chat_app_two.value_class;

/**
 * Created by Toddy on 29/03/2018.
 */

public class DonateList {
    private int when;
    private int story;
    private int patch;
    private String chooseDescription;

    public DonateList(int when, int story, int patch, String chooseDescription) {
        this.when = when;
        this.story = story;
        this.patch = patch;
        this.chooseDescription = chooseDescription;
    }

    public int getWhen() {
        return when;
    }

    public void setWhen(int when) {
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
