package com.example.test_chat_app_two.value_class;

/**
 * Created by Toddy on 25/02/2018.
 */

    ///////////////////
    //Message storage//
    ///////////////////

public class MessageThisSeason {

    private static final String thisCharity = "serb";

    public static String getThisCharity() {
        return thisCharity;
    }

    private static final int MESSAGE_RIGHT = 0;
    private static final int MESSAGE_LEFT = 1;
    private static final int MESSAGE_RIGHT_THINK = 2;
    private static final int MESSAGE_RIGHT_HURT = 3;
    private static final int MESSAGE_LEFT_HURT = 4;
    private static final int MESSAGE_Choose = 5;
    private static final int DO_CHOICE = 0;
    private static final int DO_CHOICE_DONATE = 1;
    private static final int DO_FIGHT = 2;
    private int path;
    private int decide = 0;
    private int decideSms = 1;
    private int fight = 2;
    private int isMe[][] = {

            //path 0
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_RIGHT,//1
                    MESSAGE_LEFT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_RIGHT_THINK,//5
                    MESSAGE_RIGHT_THINK,//6
                    MESSAGE_RIGHT_THINK,//7
                    MESSAGE_LEFT,//8
                    MESSAGE_LEFT,//9
                    MESSAGE_RIGHT,//10

            },
            //path 1
            {
                    MESSAGE_LEFT,//0
                    MESSAGE_LEFT,//1
            },
            //path 2
            {
                    MESSAGE_LEFT,//0
                    MESSAGE_LEFT,//1
            },
            //path 3
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_LEFT,//1
                    MESSAGE_LEFT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_RIGHT_THINK,//5
                    MESSAGE_RIGHT,//6
                    MESSAGE_RIGHT,//7
                    MESSAGE_RIGHT,//8
                    MESSAGE_RIGHT,//9
                    MESSAGE_RIGHT,//1
                    MESSAGE_LEFT,//11
                    MESSAGE_RIGHT_THINK,//12
                    MESSAGE_LEFT,//13
                    MESSAGE_RIGHT//14

            },
            //path 4
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_LEFT,//1
                    MESSAGE_LEFT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_RIGHT_THINK,//5
                    MESSAGE_RIGHT,//6
                    MESSAGE_RIGHT,//7
                    MESSAGE_RIGHT,//8
                    MESSAGE_RIGHT,//9
                    MESSAGE_RIGHT,//1
                    MESSAGE_LEFT,//11
                    MESSAGE_RIGHT_THINK,//12
                    MESSAGE_RIGHT,//13

            },
            //path 5
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_RIGHT,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_RIGHT,//5
                    MESSAGE_LEFT,//6
                    MESSAGE_LEFT,//7
                    MESSAGE_RIGHT_THINK,//8
            },
            //path 6
            {
                    MESSAGE_LEFT,//0
                    MESSAGE_LEFT,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_RIGHT_THINK,//3
            },
            //path 7
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_LEFT,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_RIGHT_THINK,//5
                    MESSAGE_RIGHT_THINK,//6
            },
            //path 8
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_RIGHT_THINK,//1
                    MESSAGE_LEFT,//2
                    MESSAGE_RIGHT,//3
                    MESSAGE_RIGHT,//4
            },
            //path 9
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_LEFT,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_LEFT,//5
                    MESSAGE_RIGHT,//6
                    MESSAGE_RIGHT,//7
                    MESSAGE_RIGHT,//8
                    MESSAGE_RIGHT,//9
                    MESSAGE_RIGHT,//1
                    MESSAGE_RIGHT,//11
            },
            //path 10
            {
                    MESSAGE_LEFT,//0
                    MESSAGE_RIGHT_THINK,//1
                    MESSAGE_RIGHT_THINK,//2
                    MESSAGE_RIGHT,//3
            },
            //path 11
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_RIGHT_THINK,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_RIGHT,//3
            },
            //path 12
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_RIGHT,//1
                    MESSAGE_LEFT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_RIGHT_THINK,//4
                    MESSAGE_RIGHT,//5
            },
            //path 13
            {
                    MESSAGE_LEFT,//0
                    MESSAGE_RIGHT_THINK,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_RIGHT,//5
            },
            //path 14
            {
                    MESSAGE_LEFT,//0
                    MESSAGE_RIGHT,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_RIGHT,//3

            },
            //path 15
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_RIGHT,//1
                    MESSAGE_RIGHT,//2
            },
            //path 16
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_RIGHT,//1
                    MESSAGE_RIGHT,//2
            },
            //path 17
            {
                    MESSAGE_RIGHT,//0
                    MESSAGE_RIGHT,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_RIGHT,//4
                    MESSAGE_LEFT,//5
                    MESSAGE_RIGHT_THINK,//6
                    MESSAGE_RIGHT_THINK,//7
            },
            //path 18
            {
                    MESSAGE_RIGHT_THINK,//0
                    MESSAGE_LEFT,//1
                    MESSAGE_LEFT,//2
                    MESSAGE_RIGHT,//3
                    MESSAGE_RIGHT_THINK,//4
                    MESSAGE_RIGHT_THINK,//5
                    MESSAGE_RIGHT_THINK,//6
                    MESSAGE_RIGHT_THINK,//7
                    MESSAGE_RIGHT,//8
                    MESSAGE_LEFT,//9
                    MESSAGE_RIGHT,//10
                    MESSAGE_RIGHT,//11
                    MESSAGE_RIGHT,//12
            },

            //path 19
            {
                    MESSAGE_RIGHT,//0
                    MESSAGE_RIGHT,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_LEFT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_RIGHT,//5
                    MESSAGE_LEFT,//6
                    MESSAGE_RIGHT_THINK,//7
                    MESSAGE_RIGHT_THINK,//8
                    MESSAGE_LEFT,//9
                    MESSAGE_RIGHT,//10
                    MESSAGE_RIGHT_THINK,//11
                    MESSAGE_LEFT,//12
                    MESSAGE_RIGHT,//13
                    MESSAGE_LEFT,//14
                    MESSAGE_LEFT,//15
                    MESSAGE_RIGHT_THINK,//15
                    MESSAGE_RIGHT_THINK//16
            },
            //path 20
            {
                    MESSAGE_RIGHT,//0
                    MESSAGE_RIGHT,//1
                    MESSAGE_RIGHT,//2
            },
            //path 21
            {
                    MESSAGE_LEFT,//0
                    MESSAGE_LEFT,//1
                    MESSAGE_RIGHT_THINK,//2
                    MESSAGE_RIGHT,//3
                    MESSAGE_RIGHT//4

            },
            //path 22
            {
                    MESSAGE_LEFT,//0
                    MESSAGE_RIGHT,//1
                    MESSAGE_RIGHT,//2
                    MESSAGE_RIGHT,//3
                    MESSAGE_RIGHT//4

            },
            //path 23
            {
                    MESSAGE_LEFT,//0
                    MESSAGE_LEFT,//1
                    MESSAGE_RIGHT_THINK,//2
            },
            //path 24
            {
                    MESSAGE_RIGHT,//0
                    MESSAGE_RIGHT_THINK,//1
                    MESSAGE_LEFT,//2
                    MESSAGE_RIGHT,//3
                    MESSAGE_LEFT,//4
                    MESSAGE_LEFT,//5
                    MESSAGE_RIGHT,//6
                    MESSAGE_RIGHT,//7
            }




    };

    private String message[][] = {
            // path0
            {
                    "ณ ป่าตะวันตกของประเทศไทย",//0
                    "วันนี้โครตร้อนเลย",//1
                    "ใช่ ร้อนจริงๆ",//2
                    "งั้นคืนนี้เราพักที่ริมธารตรงนู้นแหละกัน",//3
                    "งั้นขึ้งเปลเเลยนะครับ",//4
                    "พวกเราเป็นผู้พิทักษ์ป่าไทย\nคนที่ผมคุยด้วยก็เป็นเพื่อนที่ทำงาน",//5
                    "เขาชื่อ แดง อายุเท่ากัน\n" +
                            "ทำงานด้วยกันมา แปดปีแหละ",//6
                    "ที่จริงพวกเราก็มีอีกกันหลายคน\n" +
                            "แต่ตอนนี้แยกกันสำรวจพื้นที่อยู่",//7
                    "เออเอาเลย ขึงเลย",//8
                    "ขึ้งดีๆด้วยหละ ครั้งที่แล้วนอนๆหลุดเฉย",//9
                    "ค้าบๆๆ"//10
            },
            //path 1&2
            {
                    "เราขึ่งแปลเส็ดแล้ว",//0
                    "พักดีกว่า"//1
            },
            //path 2
            {
                    "เราขึ่งแปลเส็ดแล้ว",//0
                    "พักดีกว่า"//1
            },
            //path 3
            {
                    "ตกกลางคืน",//0
                    "ปั้ง.   . ปั้ง...ปั้ง",//1
                    "เห้ยๆตื่นๆ ไม่ดีแล้ว",//2
                    "เสียดังมาจากทิศตะวันตก",//3
                    "รีบไปดูเร็ว",//4
                    "เราหยิบของใกล้ตัวขึ้นมา",//5
                    "นี้เป็นครั้งที่เท่าไหร่แล้วนะ" +
                            "ทุกครั้งที่มีเสียงปืน เมื่อเราไปถึงก็จะเจอแต่ซากสัตว์ที่ถูกยิงและโดนชำแหละ",//6
                    "ไม่เคยที่จะจับคนร้ายได้เลย\n" +
                            "มันก็เป็นโชคดีนะเพราะไม่มีพวกเราได้รับบาดเจ็บเลย",//7
                    "แต่...",//8
                    "พวกสัตว์ป่าไม่จำเป็นต้องมาตาย สัตว์ทุกตัวก็มีชีวิตของมันเอง...",//9
                    "มนุษย์เราจะตัดสินชีวิตมันไม่ได้",//10
                    "ปั้ง...ปั้ง",//11
                    "เรารู้สึกถึงกระสุนที่วิ่งผ่านไปตัวเราไป",//12
                    "หลบเร็ว มันเริ่มยิงพวกเราแล้ว",//13
                    "เราจะทำอย่างไรดี\n" +
                            "ตอนนี้มีแค่ปืนที่ติดมาด้วย"//14
            },
            //path 4
            {
                    "ตกกลางคืน",//0
                    "ปั้ง.   . ปั้ง...ปั้ง",//1
                    "เห้ยๆตื่นๆ ไม่ดีแล้ว",//2
                    "เสียดังมาจากทิศตะวันตก",//3
                    "งรีบไปดูเร็ว",//4
                    "เราหยิบของใกล้ตัวขึ้นมา",//5
                    "นี้เป็นครั้งที่เท่าไหร่แล้วนะ\n" +
                            "ทุกครั้งที่มีเสียงปืน เมื่อเราไปถึงก็จะเจอแต่ซากสัตว์ที่ถูกยิงและโดนชำแหละ",//6
                    "ไม่เคยที่จะจับคนร้ายได้เลย\n" +
                            "มันก็เป็นโชคดีนะดพราะไม่มีพวกเราได้รับบาทเจ็บเลย",//7
                    "แต่...",//8
                    "พวกสัตว์ป่าไม่จำเป็นต้องมาตาย สัตว์ทุกตัวก็มีชีวิตของมันเอง...",//9
                    "มนุษย์เราจะตัดสินชีวิตมันไม่ได้",//10
                    "หลบเร็ว เด๋วพวกมันจะเห็นเอา",//11
                    "เราจะทำอย่างไรดี\n" +
                            "ตอนนี้มีแค่กระเป่าเป้ที่ติดมาด้วย",//12
                    "ด้านในกระเป่ามี\n" +
                            "อาหารกระป๋อง น้ำขวด แผนที่ ไฟแช็ค ไฟฉาย" +
                            "และก็โทรศัพท์"//13
            },
            // path5
            {
                    "เราหลบเข้าสู่ที่ปลอดภัย",//0
                    "นี่คือผู้พิทักษ์สัตว์ป่า",//1
                    "ใขอให้หยุด แล้วยอมมอบตัวซะ",//2
                    "จะบ้ารึ ใครจะยอมให้จับ",//3
                    "ปั้งๆ",//4
                    "ถ้าพวกแกยอมจำนน จากโทษหนักจะกลายเป็นเบา",//5
                    "ใครจะไปยอมกันเหล่า\n" +
                            "ปั้งๆ",//6
                    "เที่จริงพวกเราก็มีอีกกันหลายคน\n" +
                            "แต่ตอนนี้แยกกันสำรวจพื้นที่อยู่",//7
                    "พวกโจรกำลังจะหนีแล้ว",//8
            },
            // path6
            {
                    "เอาหละ นะ",//0
                    "ปั้งๆ",//1
                    "ปั้งๆ",//2
                    "ยิ่งสวนกันไปมา",//3
            },
            // path7
            {
                    "เราหยิบโทรศัพท์ขึ้นมา",//0
                    "จะบ้าหรอ โทรศัพท์ ตอนนี้นี่นั้น",//1
                    "เรียกกำลังเสริมไง",//2
                    "ใครจะมาเวลานี้",//3
                    "แหนะ ไม่ได้หยิบปืนมาสินะ",//4
                    "โว้ยเอานี้ไป",//5
                    "ตรง ส่งปืนสั้นมา\n" +
                            "และผลักเราเอาที่กันบัง"//6
            },
            // path8
            {
                    "เราออกมาจากที่กันบัง\n" +
                            "ทำให้ศัตรูรู้ตำแหน่ง",//0
                    "ปั้งๆ",//1
                    "ใครจะมาเวลานี้",//2
                    "ชิงถ้าไม่ยิงสวนก็ต้องหลบก่อน\n" +
                            "ทำไงดีนะ",//3
                    "พวกมันเงียบไป\n" +
                            "แปลก แปลกมาก",//4
            },
            // path9
            {
                    "พวกนายพรานหนีไปแล้ว",//0
                    "ไม่เป็นอะไรใช่ไหม",//1
                    "ก็ โอเค",//2
                    "โอเคก็ดีแล้ว",//3
                    "เป็นแบบนี้อีกแล้ว หนีไปได้ตลอด",//4
                    "เห้อ ครั้งหน้าต้องจับให้ได้",//5
                    "ไปเก็บหลักฐานกัน อาจจะใช้ในการตามตัวได้",//6
                    "โอ็ส",//7
                    "คร้งหน้าต้องจับให้ได้เลย",//8
                    "แล้วก็เป็นแบบนี้ หนีไปได้สินะ",//9
                    "ถึงแม้จะอีกกี่รอบ เราก็จะตามปกป้องรักษาพื้นป่านี้ไว้ให้ได้",//10
                    "เพื่อสัตว์ทุกตัว และคนไทยทุกคน"//11
            },
            // path10
            {
                    "ปั้งๆ",//0
                    "อ้าก",//1
                    "ตรง ถูกยิงที่หัวไหล่ซ้าย\n" +
                            "และกำลังล้มลง",//2
                    "แย่แล้ว" +
                            "จะทำไรต้องรีบทำแล้วหละ",//3
            },
            // path11
            {
                    "เราเริ่มเปิดฉากยิงปืน",//0
                    "ไม่มีใครยิงสวนกลับมา",//1
                    "เอะ เสียงปืนฝั่งนั้นเงียบลง",//2
                    "พวกมันคงหลบไปเติมนัดด้านหลังสินะ",//3
            },
            // path12
            {
                    "เราวิ่งข้ามไปหาเพื่อน",//0
                    "เป็นไงบ้าง",//1
                    "ไม่เป็นไรๆ",//2
                    "ระวังๆ\n" +
                            "ปั้งๆ",//3
                    "โจรเริ่มยิงหนักขึ้น",//4
                    "ในสถานาการแบบนี้ทำไงดี ทำไงดี"//5
            },
            // path13
            {
                    "ไปเถอะ ไปเถอะหนีก่อน",//0
                    "เราวิ่งหนีจนกลับมาถึงแคมป์ของเรา\n",//1
                    "ตอนนี้โทรบอกที่ศูนย์แล้ว เค้ากำลังมารับ\n" +
                            "เด๋วพวกเค้าจะเข้าไปหาหลักฐาน\n" +
                            "หลังทุกอย่างสงบ",//2
                    "ชิ ฝากไว้ก่อนไอ้พวกนั้น",//3
                    "ครั้งหน้าต้องจับให้ได้เลย",//4
                    "ใช่ ต้องจับให้ได้เลยี"//5
            },
            // path14
            {
                    "ปั้งๆ",//0
                    "เร่าอยู่ไกลเกินไปเสียเปรียบมาก",//1
                    "ถ้าจะยิงให้โดน ก็ลำบาก",//2
                    "ชตรง ดันมาเจ็บอีก",//3
            },
            // path15
            {
                    "ขณะ ที่กำลังเคลื่อนตัวไปนั้น",//0
                    "มันน่าจะไม่ปลอดภัยนะ",//1
                    "แต่มันจะมีโอกาสทำให้เรายิงโดนพวกมันได้",//2
            },
            // path16
            {
                    "เมื่อถึงที่หิน\n" +
                            "เรามองเห็นนายพรานหนึ่งคนกำลังหลบอยู่หลังต้นไม้",//0
                    "มันกำลังเติมนัดอยู่",//1
                    "มันจะมีคนอื่นอีกไหมนะ",//2
            },
            // path17
            {
                    "โอ้ มันเติมกระสุนอยู่จริงๆด้วย",//0
                    "ปั้งๆ",//1
                    "ชิไม่โดน",//2
                    "เห้ยๆ มันอ้อมมาแล้ว ยิงมันสิ ยิงมัน",//3
                    "แย่แล้ว",//4
                    "ปั้งๆ",//5
                    "ในขณะนั้นเราก็โดนนายพรานอีกคน"+"อ้อมมาด้านหลัง",//6
                    "และยิงเราพอดี..."//7
            },
            // path18
            {
                    "เเห้ยเสร็จยังวะ นัดกุจะหมดแล้ว",//0
                    "เออเสร็จแล้วๆ ไปเลยๆ หนีเลยๆ",//1
                    "จังหวะนี้แหละ",//2
                    "เรายิงปืนนัดแรกเราที่มือขวามของคนที่ถือปืน",//3
                    "นายพรานอีกคนยิงสวนกลับมา",//4
                    "แต่พวกของเรากลุ่มอื่นมาพอดี\n" +
                            "และยิงมันได้พอดี",//5
                    "ทำให้เราจับพวกมันได้ทั้งสองตน\n" +
                            "ทั้งของกลาง และอาวุทปืน",//6
                    "เราจับพวกมันได้แล้ว",//7
                    "ดีพวกมันจะได้ไม่มากวนป่าพวกเราอีก",//8
                    "จะไม่มีสัตว์ตาย ด้วยน้ำมือเจ้าพวกนี้อีกสักระยะ",//9
                    "แต่สุดท้ายเด๋วคนพวกนี้ก็กลับมากอีก",//10
                    "เอาเหอะ มีครั้งหน้า เราก็จะทำแบบนี้อีก",//11
                    "โอ้ส"//12
            },
            // path19
            {
                    "เอาหวะ พวกมันคงยอมฟังเรา",//0
                    "นี่คือผู้พิทักษ์สัตว์ป่า",//1
                    "ขอให้หยุด แล้วยอมมอบตัวซะ",//2
                    "จะบ้ารึ ใครจะยอมให้จับ",//3
                    "ปั้งๆ",//4
                    "ถ้าพวกแกยอมจำนน จากโทษหนักจะกลายเป็นเบา",//5
                    "ใครจะไปยอมกันเหล่า\n" +
                            "ปั้งๆ",//6
                    "เราโดนยิงเข้าที่ท้อง",//7
                    "แดงวิ่งเข้ามาหาเรา",//8
                    "เห้ยเป็นไงบ้าง",//9
                    "โดน ยิงเข้าที่ท้องนะสิ",//10
                    "ตรงผยุงเราขึ้นแหละหนีกลับมาที่แคมป์",//11
                    "หนีเถอะ อยากเอาชีวิตมาเสี่ยงขนาดนี่เลย",//12
                    "แต่นี่มันงานเรา นะปกป้องพื้นป่านี้ไว้",//13
                    "ไว้ครั้งหน้าแหละกัน",//14
                    "ครั้งหน้าต้องจับได้แน่นอน",//15
                    "เราไม่มีแรงที่จะตอบ\n" +
                            "เลยต้องทำตามการตัดสินใจของเพื่อน",//16
                    "เราสัญญากับตัวเองว่า คราวหน้า \n" +
                            "เราจะกลับมาจับพวกมันให้หมด"//16
            },
            // path20
            {
                    "ชิ ปืนอย่างเก่า" ,//0
                    "แต่ยังพอยิงได้",//1
                    "เอาหละ",//2
            },
            // path21
            {
                    "ปั้งๆ" ,//0
                    "อ้าก",//1
                    "ตรง ถูกยิงที่หัวไหล่ซ้าย\n" +
                            "และกำลังล้มลง",//2
                    "แย่แล้ว",//3
                    "จะทำไรต้องรีบทำแล้วหละ",//4
            },
            // path22
            {
                    "ปั้งๆ" ,//0
                    "สถานการณ์เริ่มแย่แล้วหละสิ",//1
                    "เพื่อนก็เจ็บ",//2
                    "แต่เรายังไม่เห็นพวกมันอีกคนเลย\n" +
                            "พวกพรานมันไม่น่าม่าล่าสัตว์ ในเวลาแบบนี้คนเดียวสิ",//3
                    "เอ้ะ ทำไมตอนนี้เสียงมันเงียบลง",//4
            },
            // path23
            {
                    "เห้ยเสร็จยังวะ นัดกุจะหมดแล้ว" ,//0
                    "เออเสร็จแล้วๆ ไปเลยๆ หนีเลย",//1
                    "โจรก็เก็บของแล้วกำลังวิ่งนี้ไป",//2
            },
            // path24
            {
                    "ปั้งๆ" ,//0
                    "เราโดนยิงเข้าที่ท้อง\n" +
                            "แหละล้มลง",//1
                    "เห้ยเป็นไงบ้าง",//2
                    "โดน ยิงเข้าที่ท้องนะสิ\n" +
                            "รู้สึกว่าพวกเราจะทำอะไรไม่ได้เลย",//3
                    "นอนนิ่งๆไว้ แล้วก็เงียบเดี๋ยวพวกมันเห็น",//4
                    "พวกเราที่แยกไปคงกำลังตามเสียงปืนมา",//5
                    "ชิ ทำไมพระเจ้าต้องเข้าข้างพวกชั่วๆด้วย\n" +
                            "ไว้ครั้งหน้าแหละกัน" +
                            "ครั้งหน้าต้องจับได้แน่นอน\n",//6
                    "เราสัญญากับตัวเองว่า คราวหน้า \n" +
                            "เราจะกลับมาจับพวกมันให้หมด"//7
            },






    };

    private int WhatToDO[][] = {
            // path0
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path1
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE,
            },
            // path2
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE_DONATE,
            },
            // path3
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path4
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE,
            },
            // path5
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE_DONATE,
            },
            // path6
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path7
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE,
            },
            // path8
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE_DONATE,
            },
            // path9
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path10
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE,
            },
            // path11
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE_DONATE,
            },
            // path12
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path13
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE,
            },
            // path14
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE_DONATE,
            },
            // path15
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path16
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE,
            },
            // path17
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE_DONATE,
            },
            // path18
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE_DONATE,
            },
            // path19
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path20
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE,
            },
            // path21
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE_DONATE,
            },
            // path22
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path23
            {
                    //left
                    DO_CHOICE_DONATE,
                    //right
                    DO_CHOICE,
            },
            // path24
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
            // path0 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "ขรึงไว้ริมแม่น้ำ",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "ขรึงไว้ในป่าข้างแม่น้ำ",
                            //description
                            "you choose left choice make you hit that hard"
                    }

            },

            ///////////
            // path1 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "นำปืนไว้ข้างตัว",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "นำกระเป๋าติดตัวไว้ข้างตัว",
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
                            "นำปืนไว้ข้างตัว",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "นำกระเป๋าติดตัวไว้ข้างตัว",
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
                            "เปิดฉากยิงกับศัตรู",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "ตะโกนเจรจาร กับผู้ร้าย",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ///////////
            // path4 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "หยิบโทรศัพท์ขึ้นมาโทรหากำลังเสริม",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "ตะโกนเจรกับนายพราน",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ///////////
            // path5 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "วิ่งตามโจรไป",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "รอดูสถานการ",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ///////////
            // path6 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "หลบที่ก้อนหนิก้อนใหญ่ด้านหน้า",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "ถอยกลับไปด้านหลังต้นไม้",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ///////////
            // path7 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "เปิดฉากยิงกับศัตรู",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "รอดูสถานการ",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ///////////
            // path8 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "วิ่งเขาไปใกล้ขึ้น",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "หลบก่อน",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ///////////
            // path9 //
            ///////////
            {
                    // Right
                    {
                            //head
                            "END",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "END",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path10 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "วิ่งเข้าไปดูเพื่อน",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "เริ่มเปิดฉากยิงศัตรู",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path11 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "วิ่งเข้าไปใกล้กว่านี้",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "เริ่มเปิดฉากยิง กับศัตรู",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path12 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "หนีก่อน",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "เริ่มเปิดฉากยิง กับศัตรู",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path13 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "END",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "END",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path14 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "หนีก่อน",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "วิ่งเข้าชาร์ต จากด้านข้าง",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path15 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "เคลื่อนตัวต่อไป",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "ถอยกลับไปตั้งหลัก",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path16 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "ยิง",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "เราเช็คปืนของตัวเอง",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path17 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "END",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "END",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path18 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "END",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "END",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path19 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "END",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "END",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path20 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "เริ่มเปิดฉากยิง",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "รอจังหวะอีกนิด",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path21 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "วิ่งเข้าไปดูเพื่อน",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "รอจังหวะอีกนิด",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path22 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "เริ่มเปิดฉากยิง",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "เชื่อว่ามันจะมีอีกคนซุ่มอยู่",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path23 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "วิ่งตามโจรไป",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "กลับไปดูเพื่อน",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },
            ////////////
            // path24 //
            ////////////
            {
                    // Right
                    {
                            //head
                            "END",
                            //description
                            "you choose right choice make you hit that hard"
                    },
                    // Left
                    {
                            //head
                            "END",
                            //description
                            "you choose left choice make you hit that hard"

                    }
            },



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
                    newPath = 2;
                    break;
                case 1:
                    // initialize head path name here :
                    newPath = 4;
                    break;
                case 2:
                    newPath = 4;
                    break;
                case 3:
                    newPath = 5;
                    break;
                case 4:
                    newPath = 19;
                    break;
                case 5:
                    newPath = 9;
                    break;
                case 6:
                    newPath = 16;
                    break;
                case 7:
                    newPath = 10;
                    break;
                case 8:
                    newPath = 9;
                    break;
                case 9:
                    newPath = -1;
                    break;
                case 10:
                    newPath = 11;
                    break;
                case 11:
                    newPath = 14;
                    break;
                case 12:
                    newPath = 14;
                    break;
                case 13:
                    newPath = -1;
                    break;
                case 14:
                    newPath = 17;
                    break;
                case 15:
                    newPath = 10;
                    break;
                case 16:
                    newPath = 21;
                    break;
                case 17:
                    newPath = -1;
                    break;
                case 18:
                    newPath = -1;
                    break;
                case 19:
                    newPath = -1;
                    break;
                case 20:
                    newPath = 22;
                    break;
                case 21:
                    newPath = 20;
                    break;
                case 22:
                    newPath = 23;
                    break;
                case 23:
                    newPath = 9;
                    break;
                case 24:
                    newPath = -1;
                    break;

                default:
                    newPath = -1;
                    break;
            }

        } else {//on right side
            switch (nowPath) {
                case 0:
                    // initialize head path name here :
                    newPath = 1;
                    break;
                case 1:
                    // initialize head path name here :
                    newPath = 3;
                    break;
                case 2:
                    newPath = 3;
                    break;
                case 3:
                    newPath = 6;
                    break;
                case 4:
                    newPath = 7;
                    break;
                case 5:
                    newPath = 8;
                    break;
                case 6:
                    newPath = 15;
                    break;
                case 7:
                    newPath = 6;
                    break;
                case 8:
                    newPath = 17;
                    break;
                case 9:
                    newPath = -1;
                    break;
                case 10:
                    newPath = 12;
                    break;
                case 11:
                    newPath = 24;
                    break;
                case 12:
                    newPath = 13;
                    break;
                case 13:
                    newPath =-1 ;
                    break;
                case 14:
                    newPath = 13;
                    break;
                case 15:
                    newPath = 16;
                    break;
                case 16:
                    newPath = 17;
                    break;
                case 17:
                    newPath = -1;
                    break;
                case 18:
                    newPath = -1;
                    break;
                case 19:
                    newPath = -1;
                    break;
                case 20:
                    newPath = 11;
                    break;
                case 21:
                    newPath = 12;
                    break;
                case 22:
                    newPath = 18;
                    break;
                case 23:
                    newPath = 8;
                    break;
                case 24:
                    newPath = -1;
                    break;

                default:
                    newPath = -1;
                    break;
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
