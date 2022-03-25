package com.ido85.interfaces.interfacetest_;

/**
 * 宠物
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Pet[] pet = new Pet[6];
        pet[0] = new Cat("田园猫", 10, 10);
        pet[1] = new Cat("蓝猫", 30, 3);
        pet[2] = new Cat("加菲猫", 60, 1);
        pet[3] = new Dog("恶霸", 10, 10);
        pet[4] = new Dog("杜宾", 20, 40);
        pet[5] = new Dog("德牧", 15, 30);
        for (int i = 0; i < pet.length; i++) {
            System.out.println(pet[i]);
            if (pet[i] instanceof Dog) {
                ((Dog) pet[i]).say();
            }
        }
    }
}
