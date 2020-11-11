package com.my.package3;

public class Demo159PhoneExtends {
    public static void main(String[] args) {
        Demo159Phone phone = new Demo159Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("====================");

        Demo159NewPhone newPhone = new Demo159NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();

    }
}
