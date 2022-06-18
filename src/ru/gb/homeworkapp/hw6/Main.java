package ru.gb.homeworkapp.hw6;

public class Main {
 public static void main(String[] args) {

  Animal cat1 = new Cat("Murka", 5, 0);
  Animal dog1 = new Dog("Rex", 10, 8);

  System.out.println(cat1.toString());
  cat1.run(16);
  cat1.swim(20);
  cat1.run(202);
  dog1.swim(25);
  dog1.run(200);

  System.out.println(Animal.getCount());



 }
}
