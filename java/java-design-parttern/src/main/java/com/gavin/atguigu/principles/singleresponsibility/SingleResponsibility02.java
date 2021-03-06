package com.gavin.atguigu.principles.singleresponsibility;

public class SingleResponsibility02 {

  public static void main(String[] args) {
    RoadVehicle roadVehicle = new RoadVehicle();
    roadVehicle.run("摩托车");

    AirVehicle airVehicle = new AirVehicle();
    airVehicle.run("飞机");

    WaterVehicle waterVehicle =new WaterVehicle();
    waterVehicle.run("轮船");
  }
}

// 交通工具类
// 方式2
// 1.遵守了单一职责原则
// 2.但是这样做改动很大，即将类分解，同时修改客户端
// 3.改进：直接修改原来的Vechicle，改动的代码会比较少=》方案3
class RoadVehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + "在公路上运行。。。。");
  }
}

class AirVehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + "在天空上运行。。。。");
  }
}

class WaterVehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + "在水里运行。。。。");
  }
}