package com.atharva.Greet;

public class Greet {

    interface Greeting {
        void sayHello();
    }

    class GreetingImpl implements Greeting {
        @Override
        public void sayHello() {
            System.out.println("Hello World");
        }
    }

    public void anotherDemo() {

        class LocalGreetingImpl implements Greeting {
            @Override
            public void sayHello() {
                System.out.println("Greeting nested impl");
            }
        }

        new LocalGreetingImpl().sayHello();
    }

    public static void main(String[] args) {

        Greet demo = new Greet();

        Greeting g1 = demo.new GreetingImpl();
        g1.sayHello();

        demo.anotherDemo();

        Greeting anonymousGreeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Greeting from Anonymous Class!!");
            }
        };

        anonymousGreeting.sayHello();

        Greeting lambdaGreeting =
                () -> System.out.println("Greeting from Lambda Function");

        lambdaGreeting.sayHello();
    }
}