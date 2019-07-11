package org.dimigo.basic;

public abstract class SmartPhone {
    private String model, company;
    private int price;

    public static void main(String[] args) {
        SmartPhone[] phones = {
                new IPhone("iPhone Xs","애플",1370000),
                new Galaxy("갤럭시 S10","삼성",1500000)
        };

        for(SmartPhone phone : phones) {
            System.out.println(phone);
            phone.turnOn();
            phone.pay();
            phone.useSpecialFunction();
            phone.turnOff();
            System.out.println();
        }
    }

    public SmartPhone(){

    }
    public SmartPhone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public void turnOn(){
        System.out.println(model + "의 전원을 킵니다.");
    }
    public void turnOff(){
        System.out.println(model + "의 전원을 끕니다.");
    }
    
    abstract public void pay();

    public void useSpecialFunction(){
        if (this instanceof IPhone){
            ((IPhone)this).useAirDrop();
        }
        else if (this instanceof Galaxy){
            ((Galaxy)this).useWirelessCharging();
        }
    }

    @Override
    public String toString() {
        return "모델명 : " + model +
                ", 제조사 : " + company +
                ", 가격 : " + String.format("%,d", price) + "원";
    }
}
