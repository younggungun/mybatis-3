package org.apache.ibatis.reflection;


public class Person {
  private String name ;//姓名
  int age ;
  public String address ;

  //构造方法
  //公共无参构造
  public Person() {

  }

  //私有的带一个参数的构造方法
  private Person(String name) {
    this.name = name ;
  }

  //单两个参数的,默认修饰符的构造方法
  Person(String name,int age){
    this.name = name ;
    this.age = age ;
  }
  //公共的带三个参数的构造方法
  public Person(String name,int age,String address) {
    this.name = name ;
    this.age = age ;
    this.address = address;
  }

  //提供一个成员方法
  public void show() {
    System.out.println("show Person...");
  }

  public String function() {
    return "hello" ;
  }
  public String method(int num) {
    return "JavaEE"+num ;
  }

  private void function2(String str) {
    System.out.println(str);
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
  }

}
