package com.driver;

public class Main {
    public static class A {
        public String meth()
        {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth()
        {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.meth());//class A when meth() in class B is not made

        B obj2=new B();
        System.out.println(obj2.meth());//class B
    }

}