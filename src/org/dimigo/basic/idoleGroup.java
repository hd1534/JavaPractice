package org.dimigo.basic;

public interface idoleGroup {
    public static void main(String[] args) throws Exception {
        int i = 0;
        String[ ] groupName = {"방탄", "2NE1", "걸스데이"};
        String[ ][ ] memberName = {
                {"정국", "지민", "뷔", "슈가", "진"},
                {"CL", "산다라박", "박봄", "민지"},
                {"유라", "혜리", "소진", "민아"}
        };
        for (String group : groupName){
            System.out.println("<< " + group + " >>");
            for (String name : memberName[i])
                System.out.println(name);
            System.out.println();
            i++;
        }
    }
}
