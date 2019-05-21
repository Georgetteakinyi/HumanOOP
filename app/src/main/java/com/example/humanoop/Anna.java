package com.example.humanoop;

import android.util.Log;

public class Anna extends Human {
    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }
    private int height;

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        int annaWeight=getWeight();
        annaWeight=annaWeight+2;
        setWeight(annaWeight);
    }

    @Override
    public void birhday() {
        int annaAge=getAge();
        annaAge=annaAge+4;
        setAge(annaAge);
    }
    //  public int eat (int weight) {
     //   weight = weight + 2;
    //  return Log.d("Anna","I am eating food" + weight + "Kgs");

   // }
    //public int birhday (int age){
    //    age = age + 4;
     //   return age;
   //  }



}
