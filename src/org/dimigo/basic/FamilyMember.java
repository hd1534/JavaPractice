package org.dimigo.basic;

public class FamilyMember {
    private static int memberCnt = 0;
    private String memberName;

    public static void printMemberCnt() {
        System.out.println("가족 총 인원 수 : " + memberCnt + "명");
    }

    public String getMemberName() {
        return memberName;
    }

    public FamilyMember(String memberName) {
        memberCnt ++;
        this.memberName = memberName;
    }
}
