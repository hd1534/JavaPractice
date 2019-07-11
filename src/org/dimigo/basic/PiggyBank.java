package org.dimigo.basic;

public class PiggyBank {
    public static void main(String[] args) {
        FamilyMember[] familys = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("나"),
                new FamilyMember("남동생")
        };
        FamilyMember.printMemberCnt();
        PiggyBank.putMoney(familys[0], 10000);
        PiggyBank.putMoney(familys[1], 5000);
        PiggyBank.putMoney(familys[2], 2000);
        PiggyBank.putMoney(familys[3], 1000);
        PiggyBank.printBalance();
        PiggyBank.putMoney(familys[2], 1000);
        PiggyBank.printBalance();

    }

    private static int balance = 0;

    public static void putMoney(FamilyMember member, int amount){
        balance += amount;
        System.out.printf("%s : %,d원 넣음\n", member.getMemberName(), amount);
    }

    public static void printBalance(){
        System.out.printf("돼지저금통 총 금액 : %,d원\n", balance);
    }
}
