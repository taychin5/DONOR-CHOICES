package com.example.test_chat_app_two.value_class;

public class CharityInfo {
    private String charityName;
    private String charityInfo;

    public CharityInfo(String charityName) {
        this.charityName = charityName;
    }


    public String getCharityInfo() {

        switch (charityName){
            case "serb" :
                charityInfo = "this is serb narak sti charity ";
                break;


            default:

                charityInfo = "can't find the charity";

        }

        return charityInfo;
    }
}
