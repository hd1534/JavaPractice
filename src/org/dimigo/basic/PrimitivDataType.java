package org.dimigo.basic;

public class PrimitivDataType {
    public static void main(String[] args) {
        String name = "아이유";
        boolean castle	= false;
        int age = 25;
        double height = 161.8;
        float weight = 44.3f;
        char blood = 'A';
        String titleSong = "삐삐";
        System.out.println("<< 아이유 프로필 >>");
        System.out.println("이름 : " + name);
        System.out.println("성별 : " + (castle?"남자":"여자"));
        System.out.println("나이 : " + age + "세");
        System.out.println("키 : " + weight + "cm");
        System.out.println("몸무게 : " + weight + "kg");
        System.out.println("혈액형 : " + blood + "형");
        System.out.println("대표곡 : " + titleSong);


    }
}
