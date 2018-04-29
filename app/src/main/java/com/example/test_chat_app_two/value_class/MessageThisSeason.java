package com.example.test_chat_app_two.value_class;

import com.example.test_chat_app_two.R;

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
    private static final int IMAGE =6;
    private static final int DO_CHOICE = 0;
    private static final int DO_CHOICE_DONATE = 1;
    private static final int DO_FIGHT = 2;
    private int path;
    private int decide = 0;
    private int decideSms = 1;
    private int fight = 2;
    private int isMe[][][] = {

            //path 0
            {
                    {IMAGE, R.drawable.sence_mountain},
                        {MESSAGE_RIGHT_THINK},//0
                    {IMAGE,R.drawable.sence_twotravel},
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//2
                        {MESSAGE_RIGHT},//3
                        {MESSAGE_RIGHT},//4
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//5
                        {MESSAGE_RIGHT},//6
                        {MESSAGE_RIGHT_THINK},//7
                        {MESSAGE_RIGHT_THINK},//8
                        {MESSAGE_RIGHT_THINK},//9
                        {MESSAGE_RIGHT_THINK},//10
                        {MESSAGE_RIGHT_THINK},//11
                    {IMAGE,R.drawable.sence_allies},
                        {MESSAGE_RIGHT_THINK},//12
                    {IMAGE,R.drawable.sence_twotravel},
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//13
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//14
                        {MESSAGE_RIGHT},//15
                    {IMAGE,R.drawable.sence_twotravel},
                        {MESSAGE_RIGHT},//10

            },
            //path 1
            {
                        {MESSAGE_RIGHT},//0
                    {IMAGE,R.drawable.sence_camp},
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_RIGHT},//2
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//3
                        {MESSAGE_RIGHT},//4
                        {MESSAGE_RIGHT},//5
                        {MESSAGE_RIGHT},//6
            },
            //path 2
            {
                        {MESSAGE_RIGHT},//0
                    {IMAGE,R.drawable.sence_camp},
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_RIGHT},//2
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//13
                        {MESSAGE_RIGHT},//4
                        {MESSAGE_RIGHT},//5
                        {MESSAGE_RIGHT},//6
            },
            //path 3
            {
                    {IMAGE,R.drawable.sence_forest_night},
                    {IMAGE,R.drawable.sence_forest_night_shoot},
                        {MESSAGE_RIGHT_THINK},//0
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//1
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//2
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//3
                        {MESSAGE_RIGHT_THINK},//4
                        {MESSAGE_RIGHT},//5
                    {IMAGE,R.drawable.sence_evidence},
                        {MESSAGE_RIGHT},//6
                        {MESSAGE_RIGHT},//7
                        {MESSAGE_RIGHT},//8
                        {MESSAGE_RIGHT},//9
                        {MESSAGE_RIGHT_THINK},//10
                    {IMAGE,R.drawable.sence_mountain_night_shoot},
                        {MESSAGE_RIGHT_THINK},//11
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//12
                    {IMAGE,R.drawable.sence_hide},
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//13

            },
            //path 4
            {
                    {IMAGE,R.drawable.sence_forest_night},
                    {IMAGE,R.drawable.sence_forest_night_shoot},
                        {MESSAGE_RIGHT_THINK},//0
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//1
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//2
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//3
                        {MESSAGE_RIGHT_THINK},//4
                        {MESSAGE_RIGHT},//5
                    {IMAGE,R.drawable.sence_evidence},
                        {MESSAGE_RIGHT},//6
                        {MESSAGE_RIGHT},//7
                        {MESSAGE_RIGHT},//8
                        {MESSAGE_RIGHT},//9
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//10
                    {IMAGE,R.drawable.sence_bag},
                        {MESSAGE_RIGHT},//11
                        {MESSAGE_RIGHT},//12
                        {MESSAGE_RIGHT},//13
                        {MESSAGE_RIGHT}//14

            },
            //path 5
            {
                        {MESSAGE_RIGHT},//0
                        {MESSAGE_RIGHT},//1
                    {IMAGE,R.drawable.sence_mountain_night_shoot},
                        {MESSAGE_RIGHT_THINK},//2
                        {MESSAGE_LEFT,R.drawable.char_shout_1},//3
                        {MESSAGE_RIGHT},//4
                        {MESSAGE_LEFT,R.drawable.char_shout_1},//5
                        {MESSAGE_RIGHT_THINK},//6
                        {MESSAGE_RIGHT},//7
            },
            //path 6
            {
                        {MESSAGE_RIGHT},//0
                    {IMAGE,R.drawable.sence_mountain_night_shoot},
                        {MESSAGE_RIGHT_THINK},//1
                        {MESSAGE_RIGHT},//2
                        {MESSAGE_RIGHT},//3
            },
            //path 7
            {
                        {MESSAGE_RIGHT_THINK},//0
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//1
                        {MESSAGE_RIGHT},//2
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//3
                        {MESSAGE_RIGHT},//4
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//5
                    {IMAGE,R.drawable.sence_grab_gun},
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//6
                        {MESSAGE_RIGHT},//7
            },
            //path 8
            {
                        {MESSAGE_RIGHT_THINK},//0
                    {IMAGE,R.drawable.sence_run_shoot},
                        {MESSAGE_RIGHT_THINK},//1
                        {MESSAGE_RIGHT},//2
            },
            //path 9
            {
                    {IMAGE,R.drawable.sence_forest_night},
                        {MESSAGE_RIGHT_THINK},//0
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//1
                        {MESSAGE_RIGHT},//2
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//3
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//4
                    {IMAGE,R.drawable.sence_evidence},
                        {MESSAGE_RIGHT},//5
                        {MESSAGE_RIGHT},//6
            },
            //path 10
            {
                    {IMAGE,R.drawable.sence_shot},
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//0
                        {MESSAGE_RIGHT_THINK},//1
                        {MESSAGE_RIGHT},//2
            },
            //path 11
            {
                    {IMAGE,R.drawable.sence_search_shot},
                        {MESSAGE_RIGHT_THINK},//0
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_RIGHT},//2
            },
            //path 12
            {
                        {MESSAGE_RIGHT_THINK},//0
                    {IMAGE,R.drawable.sence_helping},
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//2
                    {IMAGE,R.drawable.sence_mountain_night_shoot},
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//3
                        {MESSAGE_RIGHT_THINK},//4
                        {MESSAGE_RIGHT},//5
            },
            //path 13
            {
                        {MESSAGE_RIGHT},//0
                    {IMAGE,R.drawable.sence_helping_back},
                        {MESSAGE_RIGHT_THINK},//1
                        {MESSAGE_RIGHT},//2
                    {IMAGE,R.drawable.sence_helicopter},
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//3
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//4
            },
            //path 14
            {
                    {IMAGE,R.drawable.sence_mountain_night_shoot},
                        {MESSAGE_RIGHT},//0
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_RIGHT},//2
                        {MESSAGE_RIGHT},//3

            },
            //path 15
            {
                    {IMAGE,R.drawable.sence_run_shoot},
                        {MESSAGE_RIGHT_THINK},//0
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_RIGHT},//2
                        {MESSAGE_RIGHT},//3
            },
            //path 16
            {
                        {MESSAGE_RIGHT_THINK},//0
                    {IMAGE,R.drawable.sence_hide_meet_thief},
                        {MESSAGE_RIGHT},//1
            },
            //path 17
            {
                    {IMAGE,R.drawable.sence_aim_shot},
                        {MESSAGE_RIGHT},//0
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_LEFT,R.drawable.char_shout_1},//2
                        {MESSAGE_RIGHT},//3
                    {IMAGE,R.drawable.sence_they_shot},
                        {MESSAGE_RIGHT_THINK},//4
                        {MESSAGE_RIGHT_THINK},//5
                        {MESSAGE_RIGHT_THINK},//6
            },
            //path 18
            {
                    {IMAGE,R.drawable.sence_search_shot},
                        {MESSAGE_LEFT,R.drawable.char_shout_1},//0
                        {MESSAGE_LEFT,R.drawable.char_shout_1},//1
                        {MESSAGE_RIGHT},//2
                    {IMAGE,R.drawable.sence_aim_shot},
                        {MESSAGE_RIGHT_THINK},//3
                        {MESSAGE_RIGHT_THINK},//4
                    {IMAGE,R.drawable.sence_they_shot},
                        {MESSAGE_RIGHT_THINK},//5
                    {IMAGE,R.drawable.sence_evidence},
                        {MESSAGE_RIGHT_THINK},//6
                    {IMAGE,R.drawable.sence_helicopter},
                        {MESSAGE_RIGHT_THINK},//7
                        {MESSAGE_RIGHT},//8
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//9
                        {MESSAGE_RIGHT},//10
            },

            //path 19
            {
                        {MESSAGE_RIGHT},//0
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_RIGHT},//2
                        {MESSAGE_RIGHT},//3
                        {MESSAGE_LEFT,R.drawable.char_shout_1},//4
                        {MESSAGE_RIGHT},//5
                        {MESSAGE_LEFT,R.drawable.char_shout_1},//6
                    {IMAGE,R.drawable.sence_mountain},
                        {MESSAGE_RIGHT_THINK},//7
                        {MESSAGE_RIGHT},//8
            },
            //path 20
            {
                    {IMAGE,R.drawable.sence_hide},
                        {MESSAGE_RIGHT_THINK},//0
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_RIGHT},//2
                        {MESSAGE_RIGHT},//3
            },
            //path 21
            {
                    {IMAGE,R.drawable.sence_shot},
                        {MESSAGE_LEFT,R.drawable.char_b_talk},//0
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_RIGHT},//2

            },
            //path 22
            {
                    {IMAGE,R.drawable.sence_mountain_night_shoot},
                        {MESSAGE_RIGHT_THINK},//0
                        {MESSAGE_RIGHT},//1
                        {MESSAGE_RIGHT},//2
                        {MESSAGE_RIGHT},//3
                    {IMAGE,R.drawable.sence_forest_night},
                        {MESSAGE_RIGHT}//4

            },
            //path 23
            {
                    {IMAGE,R.drawable.sence_hide_meet_thief},
                        {MESSAGE_LEFT,R.drawable.char_shout_1},//0
                        {MESSAGE_LEFT,R.drawable.char_shout_2},//1
                        {MESSAGE_RIGHT},//2
            },
            //path 24
            {
                    {IMAGE,R.drawable.sence_they_shot},
                        {MESSAGE_RIGHT_THINK},//0
                        {MESSAGE_RIGHT_THINK},//1
            }




    };

    private String message[][] = {
            // path0
            {
                    "IMAGE",
                        "ณ ป่าตะวันตกของประเทศไทย",//0
                    "IMAGE",
                        "วันนี้โครตร้อนเลย",//1
                        "ร้อนจริงๆ ปกติมันต้องเย็นกว่านี้แท้ๆ",//2
                        "งั้น",//3
                        "วันนี้พวกเราพอแค่นี้ม้ะ",//4
                        "โธ่ เพิ่งพักมาตะกี้นี้เองนี้นะ\n"+"ไม่สมกับผู้พิทักษ์ป่าเลย",//5
                        "เอาน่าๆ ฮ่าฮ่าฮ่า",//6
                        "ใช่แล้ว พวกเราเป็นผู้พิทักษ์ป่าไทย",//7
                        "เราจะคอยลาดตระเวนรอบๆบริเวณนี้",//8
                        "เพื่อรักษาผืนป่าของไทยไว้",//9
                        "ส่วนคนที่ผมคุยด้วยชื่อ แดง เป็นเพื่อนร่วมงาน",//10
                        "ที่จริงพวกเราไม่ได้มีกันแค่สองคนหรอก",//11
                    "IMAGE",
                         "แค่ตอนนี้แยกกันสำรวจพื้นที่อยู่\n" +
                            "เลยแยก กันออกเป็นกลุ่มละสองคน",//12
                    "IMAGE",
                        "งั้น คืนนี้เราตั้งแคมป์ตรงนู้นแหละกัน",//13
                        "ฝากด้วยนะ เด๋วจะจดบันทึกการเดินทางสักหน่อย",//14
                        "ไว้ใจได้เลย",//15
                    "IMAGE",
                        "เราจะผูกเปลไว้ที่ไหนดีนะ?"//16


            },
            //path 1&2
            {
                        "เราผูกเปลเสร็จแล้ว",//0
                    "IMAGE",
                        "เป็นพระอาทิตย์ตกที่สวยเหมือนเดิมเลย",//1
                        "เฮ้อ ธรรมชาตินี้มันดีจริงๆเลยนะ",//2
                        "มาพูดเพ้ออะไร ต้องไปเตรียมของต่อให้เสร็จไป",//3.
                        "จ้าๆ",//4
                        "ต้องจัดของไว้ให้ใกล้ตัว เวลานอน",//5
                        "มีปืนกับกระเป๋ายักษ์\n" +
                            "เอาอะไรไว้ข้างๆตัวตอนนอนดีนะ\n" //6
            },
            //path 2
            {
                        "เราผูกเปลเสร็จแล้ว",//0
                    "IMAGE",
                        "เป็นพระอาทิตย์ตกที่สวยเหมือนเดิมเลย",//1
                        "เฮ้อ ธรรมชาตินี้มันดีจริงๆเลยนะ",//2
                        "มาพูดเพ้ออะไร ต้องไปเตรียมของต่อให้เสร็จไป",//3.
                        "จ้าๆ",//4
                        "ต้องจัดของไว้ให้ใกล้ตัว เวลานอน",//5
                        "มีปืนกับกระเป๋ายักษ์\n" +
                                "เอาอะไรไว้ข้างๆตัวตอนนอนดีนะ\n" //6
            },
            //path 3
            {
                    "IMAGE",
                    "IMAGE",
                        "ปั้ง.   . ปั้ง...ปั้ง",//0
                        "เห้ยๆ ตื่นๆ ท่าไม่ดีแล้ว",//1
                        "เสียงปืนดังมาจากทางทิศตะวันตก",//2
                        "รีบไปดูเร็ว",//3
                        "เราคว้าเอาของใกล้ตัวขึ้นมา",//4
                        "ทุกครั้งที่มีเสียงปืน เมื่อเราไปถึงก็จะเจอแต่ซากสัตว์ที่ถูกยิงและโดนชำแหละ",//5
                    "IMAGE",
                        "ไม่เคยที่จะจับคนร้ายได้เลย\n" +
                                "มันก็เป็นโชคดีนะเพราะไม่มีพวกเราได้รับบาดเจ็บเลย",//6
                        "แต่...",//7
                        "พวกสัตว์ป่าไม่จำเป็นต้องมาตาย สัตว์ทุกตัวก็มีชีวิตของมันเอง",//8
                        "มนุษย์เราจะตัดสินชีวิตมันไม่ได้",//9
                        "ปั้ง...ปั้ง",//10
                    "IMAGE",
                        "เรารู้สึกได้ถึงกระสุนปืนที่วิ่งผ่านไป",//11
                        "หลบเร็ว มันเริ่มยิงพวกเราแล้ว",//12
                    "IMAGE",
                        "เราจะทำอย่างไรดี\n" +
                                "ดีนะที่เราคว้าปืนติดมาด้วย"//13
            },
            //path 4
            {
                    "IMAGE",
                    "IMAGE",
                        "ปั้ง.   . ปั้ง...ปั้ง",//0
                        "เห้ยๆ ตื่นๆ ท่าไม่ดีแล้ว",//1
                        "เสียงปืนดังมาจากทางทิศตะวันตก",//2
                        "รีบไปดูเร็ว",//3
                        "เราคว้าเอาของใกล้ตัวขึ้นมา",//4
                        "ทุกครั้งที่มีเสียงปืน เมื่อเราไปถึงก็จะเจอแต่ซากสัตว์ที่ถูกยิงและโดนชำแหละ",//5
                    "IMAGE",
                        "ไม่เคยที่จะจับคนร้ายได้เลย\n" +
                                "มันก็เป็นโชคดีนะเพราะไม่มีพวกเราได้รับบาดเจ็บเลย",//6
                        "แต่...",//7
                        "พวกสัตว์ป่าไม่จำเป็นต้องมาตาย สัตว์ทุกตัวก็มีชีวิตของมันเอง",//8
                        "มนุษย์เราจะตัดสินชีวิตมันไม่ได้",//9
                        "หลบเร็ว เด๋วพวกมันจะเห็นเอา",//10
                    "IMAGE",
                        "แมร่งเอ้ย ดันคว้ามาแต่กระเป๋า",//11
                        "ด้านในกระเป่ามี\n" +
                                "อาหารกระป๋อง น้ำขวด แผนที่ ไฟแช็ค ไฟฉาย" ,//12
                        "และก็โทรศัพท์",//13
                        "ทำอะไรกับของพวกนี้ได้บ้างเนี่ยยย"//14
            },
            // path5
            {
                        "นี่คือผู้พิทักษ์สัตว์ป่า",//0
                        "ขอให้หยุดยิง แล้วยอมมอบตัวซะ",//1
                    "IMAGE",
                        "ปั้งๆ",//2
                        "จะบ้ารึ ใครจะยอมให้จับกัน",//3
                        "ถ้าพวกแกยอมจำนน จากโทษหนักจะกลายเป็นเบา",//4
                        "ใครจะไปยอมกันเล่า",//5
                        "ปั้งๆ",//6
                        "เรารู้สึกได้ว่าพวกโจรกำลังจะหนีไปแล้ว",//7
            },
            // path6
            {
                        "เอาหละ นะ",//0
                    "IMAGE",
                        "เราและนายพรานต่างยิ่งสวนกันไปมา",//1
                        "ชิ ยิงกันไปยิงกันมาแบบนี้ มีแต่เปลืองกระสุน",//2
                        "เราต้องย้ายที่แล้วหละ ย้ายไปไหนดี"//3

            },
            // path7
            {
                        "เราหยิบโทรศัพท์ขึ้นมา",//0
                        "จะบ้าหรอ โทรศัพท์ ตอนนี้นี่นั้น",//1
                        "เรียกกำลังเสริมไง",//2
                        "มันไม่มีสัญญานโว้ย",//3
                        "เออ ลืมไปเลยแหะๆ",//4
                        "โว้ยเอานี้ไป",//5
                    "IMAGE",
                        "ตอนนี้พวกเราต้องทำอะไรสักอย่างก่อน\n" +
                                "เด๋วพวกนั้นได้ยินเสียงปืนก็ตามมาสมทบเอง",//6
                        "เอาหละเราได้ปืนมาแล้ว\n" +
                                "มาลุยกันสักตั้ง"//7
            },
            // path8
            {
                        "เราออกมาจากที่กันบัง",//0
                    "IMAGE",
                        "ปั้งๆ\n"+"โชคไม่ดีที่พวกนายพรานเห็น",//1
                        "ชิ ถ้าไม่ยิงสวนก็ต้องหลบก่อน\n" +
                                "ทำไงดีนะ",//2
            },
            // path9
            {
                    "IMAGE",
                        "ช้าไป พวกนายพรานหนีไปแล้ว",//0
                        "ไม่เป็นอะไรใช่ไหม",//1
                        "ก็ โอเค",//2
                        "เห้อ ครั้งหน้าต้องจับให้ได้",//3
                        "ไปเก็บหลักฐานกัน อาจจะใช้ในการตามตัวได้",//4
                    "IMAGE",
                        "เหมือนเดิม เจอแต่ซากสัตวฺ์อีกแล้ว",//5
                        "ครั้งหน้าต้องจับให้ได้เลย"//6
            },
            // path10
            {
                    "IMAGE",
                        "อ้าก",//0
                        "แดงถูกยิง",//1
                        "แย่แล้ว" +
                                "จะทำไรต้องรีบทำแล้วหละ",//2
            },
            // path11
            {
                    "IMAGE",
                        "เรายืนขึ้นแล้วพยายามเล็งหาศัตรู",//0
                        "แปลกจริง ทำไมมันเงียบขนาดนี้",//1
                        "พวกมันคงกำลังเติมกระสุนอยู่สินะ",//2
            },
            // path12
            {
                        "เราวิ่งข้ามไปหาเพื่อน",//0
                    "IMAGE",
                        "เป็นไงบ้าง",//1
                        "ดีนะที่ไม่โดนจุดสำคัญ",//2
                    "IMAGE",
                        "ระวังๆ\n" +
                                "ปั้งๆ",//3
                        "นายพรานเริ่มยิงหนักขึ้น",//4
                        "ในสถานาการแบบนี้เราควรทำไงดี ทำไงดี"//5
            },
            // path13
            {
                        "ไปเถอะ ถอยก่อน",//0
                    "IMAGE",
                        "เราพาแดงถอยจนปลอดภัยแล้ว",//1
                        "ตอนนี้โทรบอกที่ศูนย์แล้ว พวกเค้าจะส่งเฮลิคอปเตอร์มารับ",//2
                    "IMAGE",
                        "ชิ ฝากไว้ก่อนไอ้พวกนั้น",//3
                        "ครั้งหน้าต้องจับให้ได้เลย",//4
            },
            // path14
            {
                    "IMAGE",
                        "เราอยู่ไกลเกินไป เสียเปรียบมาก",//0
                        "ถ้าจะยิงให้โดนคงต้องวิ่งเข้าไปใกล้กว่านี้",//1
                        "แต่ แดงมันดันมาเจ็บอีก",//2
                        "ต้องตัดสินใจดีๆแล้วหละ"//3
            },
            // path15
            {
                    "IMAGE",
                        "ขณะ ที่กำลังเคลื่อนตัวไปนั้น",//0
                        "พวกนายพรานก็กระหน่ำยิง",//1
                        "แย่แล้ว",//2
                        "หลบหรือไปต่อดี",//3
            },
            // path16
            {
                        "เราวิ่งจนมาถึงหินที่ใกล้กับนายพราน",//0
                    "IMAGE",
                        "นั้นไงมัน",//1
            },
            // path17
            {
                    "IMAGE",
                        "ปั้งๆ",//0
                        "ชิไม่โดน",//1
                        "เห้ยๆ มันอ้อมมาแล้ว ยิงมันสิ ยิงมัน",//2
                        "แย่แล้ว",//3
                    "IMAGE",
                        "ปั้งๆ",//4
                        "ในขณะนั้นเราก็โดนนายพรานอีกคน "+"อ้อมมาด้านหลัง",//5
                        "และยิงเราพอดี..."//6
            },
            // path18
            {
                    "IMAGE",
                        "เห้ยเสร็จยังวะ นัดกุจะหมดแล้ว",//0
                        "เออเสร็จแล้วๆ ไปเลยๆ หนีเลยๆ",//1
                        "จังหวะนี้แหละ",//2
                    "IMAGE",
                        "เราเล็งปืนไปที่นายพรานแล้วยิง",//3
                        "นายพรานอีกคนกำลังจะยิงสวนกลับมา",//4
                    "IMAGE",
                        "เสียงปืนนั้นไม่ใช้เสียงปืนของใคร\n" +
                                "เป็นพวกเรานี่เองกลุ่มที่แยกไป",//5
                    "IMAGE",
                        "ทำให้เราจับพวกมันได้ทั้งสองคน\n" +
                                "ทั้งของกลาง และอาวุทปืน",//6
                    "IMAGE",
                        "พวกมันคงจะได้ไม่กล้ามาทำอะไรแบบนี้ครั้ง",//7
                        "จะไม่มีสัตว์ตาย ด้วยน้ำมือเจ้าพวกนี้อีกสักระยะ",//8
                        "แต่สุดท้ายเด๋วคนพวกนี้ก็กลับมากอีก",//9
                        "ถ้าพวกมันกล้ากลับมา เราก็จะจับมันทั้งหมด",//10
            },
            // path19
            {
                        "เอาหวะ พวกมันคงยอมฟังเรา",//0
                        "เราส่องไฟฉายไปเพื่อจะเจรจา",//1
                        "นี่คือผู้พิทักษ์ป่า",//2
                        "ขอให้หยุด แล้วยอมมอบตัวซะ",//3
                        "ใครจะยอมให้จับ",//4
                        "ถ้าพวกแกยอมจำนน จากโทษหนักจะกลายเป็นเบา",//5
                        "ใครจะไปยอมกันเหล่า",//6
                    "IMAGE",
                        "เราโดนยิงเข้าที่ท้อง",//7
                        "ไม่น่าไปญาติดีกับพวกนี้เลย"//8
            },
            // path20
            {
                "IMAGE",
                    "เราเช็คปืนของตัวเอง",//0
                    "ชิ ปืนอย่างเก่า" ,//1
                    "แต่ยังพอยิงได้",//2
                    "เอาหละ",//3
            },
            // path21
            {
                "IMAGE",
                    "อ้าก",//0
                    "แย่แล้ว",//1
                    "จะทำไรต้องรีบทำแล้วหละ",//2
            },
            // path22
            {
                "IMAGE",
                    "ปั้งๆ" ,//0
                    "สถานการณ์เริ่มแย่แล้วหละสิ",//1
                    "แดงก็เจ็บ",//2
                    "เรายังไม่เห็นพวกมันอีกคนเลย\n" +
                            "พวกพรานมันไม่น่ามาล่าสัตว์ ในเวลาแบบนี้คนเดียวสิ",//3
                "IMAGE",
                    "เอ้ะ ทำไมตอนนี้เสียงมันเงียบลง",//4
            },
            // path23
            {
                "IMAGE",
                    "เห้ยเสร็จยังวะ นัดกุจะหมดแล้ว" ,//0
                    "เออเสร็จแล้วๆ ไปเลยๆ หนีเลย",//1
                    "นั้นไงพวกมัน",//2
            },
            // path24
            {
                    "IMAGE",
                        "เราโดนยิง",//0
                        "เจ็บ เจ็บมาก",//1
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
                    DO_CHOICE,
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
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
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
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path8
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
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
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
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
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path14
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
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
                    DO_CHOICE,
                    //right
                    DO_CHOICE_DONATE,
            },
            // path17
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path18
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
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
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path21
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
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
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
            },
            // path24
            {
                    //left
                    DO_CHOICE,
                    //right
                    DO_CHOICE,
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
        return isMe[newPath][hit][0];
    }

    public int isCharacterimg(int newPath, int hit) {
        return isMe[newPath][hit][1];
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
