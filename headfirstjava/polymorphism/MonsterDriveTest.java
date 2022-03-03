package com.headfirstjava.polymorphism;

class Monster{
    boolean frighten(int x){
        System.out.println("aargghh");
        return  true;
    }
}

class Dragon extends Monster{
    boolean frighten(int x){
        System.out.println("Breath Fire ");
        return false;
    }
}

class Vampire extends Monster{
    boolean scare(int x){
        System.out.println("a bite ?");
        return true;
    }
}

public class MonsterDriveTest {
    public static void main(String[] args) {
        Monster[] monster = new Monster[3];
        monster[0] = new Vampire();
        monster[1] = new Dragon();
        monster[2] = new Monster();
        for(int i = 0; i < 3; i++){
            monster[i].frighten(i);
        }
    }
}
