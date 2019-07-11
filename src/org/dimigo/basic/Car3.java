package org.dimigo.basic;

public class Car3 {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;
    Car3(String company, String model, String color, int maxSpeed, int price){
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    Car3(String company, String model, String color, int maxSpeed) {
        this(company, model, color, maxSpeed, 0);
    }

    Car3(String company, String model, String color) {
        this(company, model, color, 0);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Car3 car1 = new Car3("현대자동차","제네시스","검정색",225,50000000);
        Car3 car2 = new Car3("기아자동차", "k7", "흰색", 246);
        Car3 car3 = new Car3("삼성자동차", "SM7", "회색" );

        System.out.println("<< 자동차 목록 >>\n" +
                "제조사명 :" + car1.getCompany() +'\n' +
                "모델명 : " + car1.getModel() + '\n' +
                "색상 : " + car1.getColor() + '\n' +
                "최대속도 :" + car1.getMaxSpeed() + "km/h");
        System.out.printf("가격 : %,d원\n", car1.getPrice());

        System.out.println("<< 자동차 목록 >>\n" +
                "제조사명 :" + car2.getCompany() +'\n' +
                "모델명 : " + car2.getModel() + '\n' +
                "색상 : " + car2.getColor() + '\n' +
                "최대속도 :" + car2.getMaxSpeed() + "km/h");
        System.out.printf("가격 : %,d원\n", car2.getPrice());

        System.out.println("<< 자동차 목록 >>\n" +
                "제조사명 :" + car3.getCompany() +'\n' +
                "모델명 : " + car3.getModel() + '\n' +
                "색상 : " + car3.getColor() + '\n' +
                "최대속도 :" + car3.getMaxSpeed() + "km/h");
        System.out.printf("가격 : %,d원\n", car3.getPrice());

    }

}
