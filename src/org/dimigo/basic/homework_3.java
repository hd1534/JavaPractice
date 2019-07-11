package org.dimigo.basic;

import java.util.*;
public class homework_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] attackPoint = {100, 100, 100, 100};
        String[] character = {"마법사", "영주", "기사", "농민"};
        int player = -1;
        int i=0;
        while(i != 9) {
            System.out.println(
                    "--------------------\n" +
                            "<< 게임 메뉴 >>\n" +
                            "1. 캐릭터 설정\n" +
                            "2. 공격력 증가\n" +
                            "3. 공격력 감소\n" +
                            "9. 종료");
            System.out.println("--------------------");
            System.out.println("메뉴입력 => ");
            i = s.nextInt();
            switch (i){
                case 1:
                    if (player == -1){
                        System.out.println("캐릭터를 설정해 주세요");
                        break;
                    }
                    player = new Random().nextInt(4);
                    System.out.println(character[player]+"(으)로 설정되었습니다.");
                    break;
                case 2:
                    if (player == -1){
                        System.out.println("캐릭터를 설정해 주세요");
                        break;
                    }
                    attackPoint[player] += 10;
                    System.out.println(character[player]+"공격력이 증가되었습니다. 현재 공격력"+attackPoint[player]);
                    break;
                case 3:
                    if (player == -1){
                        System.out.println("캐릭터를 설정해 주세요");
                        break;
                    }
                    attackPoint[player] -= 10;
                    System.out.println(character[player]+"공격력이 감소되었습니다. 현재 공격력"+attackPoint[player]);
                    break;
                case 9:
                    System.out.println("이제 공부하세요");

                default:

            }
        }
    }
}
