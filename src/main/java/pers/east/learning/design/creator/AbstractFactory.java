package pers.east.learning.design.creator;

/**
 * Abstract Factory:抽象工厂模式
 */
public class AbstractFactory {

    public void test(){
        Car c1 = new AbstractFactoryByd();
        Car c2 = new AbstractFactoryBenz();
        Car c3 = new AbstractFactoryHonda();
    }
}

interface Car{
    void country();
}

class AbstractFactoryByd implements Car {

    @Override
    public void country() {
        System.out.println("i am from China");
    }
}

class AbstractFactoryBenz implements Car{
    @Override
    public void country() {
        System.out.println("i am from Germany");
    }
}

class AbstractFactoryHonda implements Car{
    @Override
    public void country() {
        System.out.println("i am from Japan");
    }
}


