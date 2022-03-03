package com.headfirstjava;

public class MixedMessage {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        MixedMessage[] m4a = new MixedMessage[20];
        int x = 0;
        while (x < 9){
            m4a[x] = new MixedMessage();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            System.out.println("Count : "+count);
            x++;
        }
        System.out.println(count + " "+m4a[1].counter);
    }

    public int maybeNew(int index){
        if(index < 5) {
            MixedMessage m4 = new MixedMessage();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
        }
    }
