package com.gavin.atguigu.principles.singleresponsibility;

public class SingleResponsibility01 {
  public static void main(String[] args) {
    Vehicle vehicle =new Vehicle();
    vehicle.run("摩托车");
    vehicle.run("汽车");
    vehicle.run("飞机");
  }
}

// 交通工具类
// 方式1
// 1.在方式1的run方法中，违反了单一职责原则
// 2.解决方案的方法非常的简单，根据交通工具运行方法的不同，分解成不同的类
class Vehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + "在公路上运行。。。。");
  }
}