package com.example.test_chat_app_two;

/**
 * Created by Toddy on 25/02/2018.
 */
public class MessageThisSeason {

    private boolean isMe[][] = {
            //path 1
            {
                    false,
                    false,
                    false,
                    false,
                    true,
                    false,
                    false,
                    false,

            },
            //path 2
            {
                    false,
                    false,
                    true,
                    false,
                    false,
                    false,
            },
            //path 3
            {
                    true,
                    true,
                    false,
                    true,
                    true,
                    true,
            }
    };
    private String message[][] = {
            // path1
            {
                    "โลกตอนนี้มันเน่าเฟะ",
                    "ทุกอย่างที่มีอยู่ตอนนี้มันก็สะดวกดีอยู่หรอก",
                    "แต่สิ่งที่ผมไม่ชอบเลยหนึ่งอย่าง",
                    "อากาศ มันแย่มาก ผมไม่ชอบมันเลย ฝุ่นละอองที่มีอยู่ทั่วเมืองมันทำให้เมืองตอนนี้ดำไปหมด",
                    "เจ้านายครับเรากำลังจะสายแล้วครับ!",
                    "รู้แล้วน่ะ น่ารำคาญจริง",
                  "ไอ้นี่มันชื่อ nxz-190x ไอ้ตัวกลมๆที่บินไปบินมาอยู่รอบๆตัวผมนี่แหละ",
                    "เราจะทำอย่างไรกับมันดี"
            },
            //path 2
            {
                    "test20",
                    "test21",
                    "test22",
                    "test23",
                    "test24",
                    "test25",
            },
            //path 3
            {
                    "test30",
                    "test31",
                    "test32",
                    "test33",
                    "test34",
                    "test35",
            }

    };

    private int path;

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        System.out.println(path);
        this.path = path;
    }

    public int generateNextPath(boolean path,int nowPath){
        int newPath;
        if(path){//on left side
            switch (nowPath){
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

        }else{//on right side
            switch (nowPath){
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

    public boolean isdone(int newPath,int hit){
        if(hit<(isMe[newPath].length)) {
            return false;
        }else {
            return true;
        }
    }

    public boolean isMe(int newPath,int hit) {
        if(hit<isMe[newPath].length) {
            return isMe[newPath][hit];
        }else{
            return false;
        }
    }

    public String getMessage(int newPath,int hit) {
        if(hit<message[newPath].length) {
            return message[newPath][hit];
        }else{
            return null;
        }
    }






}
