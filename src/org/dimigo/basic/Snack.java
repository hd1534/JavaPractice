package org.dimigo.basic;

public class Snack {

    String name, company;
    int price, number;
    StringBuilder stringB = new StringBuilder();

    public Snack(){

    }

    public Snack(String name, String company, int price, int number){
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return stringB.append("이름 : ").append(name).append('\n')
                .append("제조사 : ").append(company).append('\n')
                .append("가격 : ").append(String.format("%,d", price)).append("원\n")
                .append("개수 : ").append(number).append("개").toString();
    }

    public int calcPrice() {
        return this.price * this.number;
    }

    public static void main(String[] args) {
        int sum = 0;
        Snack[] snacks = {
                new Snack("새우깡", "농심", 1100, 2),
                new Snack("콘칲", "크라운", 1200, 1),
                new Snack("허니버터칩", "해태", 1500, 4)
        };
        for (Snack value : snacks){
            System.out.println(value);
            System.out.println();
            sum += value.calcPrice();
        }
        System.out.printf("총 구매 금액 : %,d원", sum);
    }
}
