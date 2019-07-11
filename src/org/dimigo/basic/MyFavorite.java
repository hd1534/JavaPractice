package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {
    public static void main(String[] args) {
        int i = 0, j, ran;
        Scanner s  = new Scanner(System.in);
        String[] questions = {
                "가장 좋아하는 가수는? ",
                "가장 좋아하는 배우는? ",
                "가장 좋아하는 과목은? "
        };
        String[] answers = {
                "아이유",
                "원빈",
                "자료구조"
        };
        StringBuilder sb = new StringBuilder();
        for (j=0; j<3; j++)
            sb.append(questions[j]).append(answers[j]).append("입니다\n");
        while (i != 9)
        {
            System.out.println("--------------------------------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("--------------------------------------------");
            System.out.print("메뉴 선택 => ");
            i = s.nextInt();
            switch (i)
            {
                case 1:
                    ran = new Random().nextInt(3);
                    System.out.print(questions[ran]);
                    System.out.println(answers[ran].equals(s.next())?"정답입니다!":"틀렸습니다!");
                    break;
                case 2:
                    System.out.print(sb);
                    break;
                case 9:
                    System.out.println("Bye~");
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");
            }
        }
    }
}
