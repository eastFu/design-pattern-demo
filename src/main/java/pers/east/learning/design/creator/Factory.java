package pers.east.learning.design.creator;

/**
 * Factory: 简单工厂模式
 */
public class Factory {

    public Father instance(int type){
        if(type==0){
            return new A();
        }else if(type==1){
            return new B();
        }else if(type==2){
            return new C();
        }else{
            return null;
        }
    }
}

interface Father{}

class A implements  Father {}

class B implements  Father{}

class C implements  Father{}

