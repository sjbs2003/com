package com.oops.staticExample2;

public class Human {
        int age;
        String name;
        boolean married;
        int salary;
        static long population;

        public Human(int age, String name, boolean married, int salary){
            this.age=age;
            this.salary=salary;
            this.married=married;
            this.name=name;
            Human.population += 1;
        }


}
