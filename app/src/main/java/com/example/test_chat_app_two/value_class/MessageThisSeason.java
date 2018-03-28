package com.example.test_chat_app_two.value_class;

/**
 * Created by Toddy on 25/02/2018.
 */

    ///////////////////
    //Message storage//
    ///////////////////

public class MessageThisSeason {

    private static final int MESSAGE_RIGHT = 0;
    private static final int MESSAGE_LEFT = 1;
    private static final int MESSAGE_RIGHT_THINK = 2;
    private static final int MESSAGE_RIGHT_HURT = 3;
    private static final int MESSAGE_LEFT_HURT = 4;
    private static final int DO_CHOICE = 0;
    private static final int DO_CHOICE_DONATE = 1;
    private static final int DO_FIGHT = 2;
    private int path;
    private int decide = 0;
    private int decideSms = 1;
    private int fight = 2;
    private int isMe[][] = {

            //path 1
            {
                    MESSAGE_RIGHT,//0
                    MESSAGE_RIGHT_HURT,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_RIGHT,//3
                    MESSAGE_RIGHT,//4
                    MESSAGE_LEFT,//5
                    MESSAGE_LEFT,//6
                    MESSAGE_RIGHT_HURT,//7

            },
            //path 2
            {
                    MESSAGE_LEFT,//0
                    MESSAGE_LEFT,//1
                    MESSAGE_RIGHT_HURT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_LEFT,//5
            },
            //path 3
            {
                    MESSAGE_RIGHT,//0
                    MESSAGE_RIGHT_HURT,//1
                    MESSAGE_LEFT,//2
                    MESSAGE_RIGHT_HURT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_RIGHT_HURT,//5
            }
    };

    private String message[][] = {
            // path1
            {
                    "โลกตอนนี้มันเน่าเฟะ",//0
                    "ทุกอย่างที่มีอยู่ตอนนี้มันก็สะดวกดีอยู่หรอก",//1
                    "แต่สิ่งที่ผมไม่ชอบเลยหนึ่งอย่าง",//2
                    "อากาศ มันแย่มาก ผมไม่ชอบมันเลย ฝุ่นละอองที่มีอยู่ทั่วเมืองมันทำให้เมืองตอนนี้ดำไปหมด",//3
                    "เจ้านายครับเรากำลังจะสายแล้วครับ!",//4
                    "รู้แล้วน่ะ น่ารำคาญจริง",//5
                    "ไอ้นี่มันชื่อ nxz-190x ไอ้ตัวกลมๆที่บินไปบินมาอยู่รอบๆตัวผมนี่แหละ",//6
                    "เราจะทำอย่างไรกับมันดี"//7
            },
            //path 2
            {
                    "test20",//0
                    "test21",//1
                    "test22",//2
                    "test23",//3
                    "test24",//4
                    "test25",//5
            },
            //path 3
            {
                    "test30",//0
                    "test31",//1
                    "test32",//2
                    "test33",//3
                    "test34",//4
                    "test35",//5
            }

    };

    private int WhatToDO[][] = {
            // path1
            {
                    //left
                    DO_CHOICE,

                    //right
                    DO_CHOICE,
            },
            // path2
            {
                    //left
                    DO_CHOICE_DONATE,

                    //right
                    DO_CHOICE,
            },
            // path3
            {
                    //left
                    DO_CHOICE_DONATE,

                    //right
                    DO_CHOICE_DONATE,
            }

    };

    private String chooseDescription[][][] = {

            // for popup index

            // 0[x] = path
            // 1[][x] = right left
            // 2[][][x] = 0 head
            //          = 1 description
            //          = 2

            ///////////
            // path1 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "hello world this is right1",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "hello world this is Left1",
                            //description
                            "you choose left choice make you hit that hard"
                    }

            },

            ///////////
            // path2 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "hello world this is right2",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "hello world this is Left2",
                            //description
                            "you choose left choice make you hit that hard"
                    }

            },

            ///////////
            // path3 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "hello world this is right3",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "hello world this is Left3",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            }

    };


    public String getChooseDescription(int path, boolean choose, int index) {
        int chooseint;
        if (choose) {
            chooseint = 1;
        } else {
            chooseint = 0;
        }

        return chooseDescription[path][chooseint][index];
    }

    public int generateNextPath(boolean path, int nowPath) {
        int newPath;
        if (path) {//on left side
            switch (nowPath) {
                case 0:
                    // initialize head path name here :
                    newPath = 1;
                    break;
                case 1:
                    // initialize head path name here :
                    newPath = 0;
                    break;
                default:
                    newPath = 0;
            }

        } else {//on right side
            switch (nowPath) {
                case 0:
                    // initialize head path name here :
                    newPath = 2;
                    break;
                case 1:
                    // initialize head path name here :
                    newPath = 0;
                    break;
                default:
                    newPath = 0;
            }

        }


        return newPath;
    }

    public boolean isdone(int newPath, int hit) {
        if (hit == (isMe[newPath].length)) {
            return true;
        } else {
            return false;
        }
    }

    public int isMe(int newPath, int hit) {
        return isMe[newPath][hit];
    }

    public String getMessage(int newPath, int hit) {
        if (hit < message[newPath].length) {
            return message[newPath][hit];
        } else {
            return null;
        }
    }

    public int getWhatToDO(int path, boolean leftRight) {
        int LR;
        if (leftRight) {
            LR = 0;
        } else {
            LR = 1;
        }
        return WhatToDO[path][LR];
    }
}
