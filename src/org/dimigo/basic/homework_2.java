package org.dimigo.basic;

public class homework_2 {
    public static void main(String[] args) {
        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.println("월 평균 급여 : 1,700,000원");
        System.out.println("점포 내 직원 수 : 3명");
        System.out.println("점포 수 : 1,500개");
        System.out.printf("연간 인건비 : %,d원",1700000L * 12 * 3 * 1500);
    }
}
