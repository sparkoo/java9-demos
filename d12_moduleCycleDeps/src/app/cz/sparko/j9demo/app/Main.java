package cz.sparko.j9demo.app;

import cz.sparko.j9demo.moduleA.ModuleAClass;
import cz.sparko.j9demo.moduleB.ModuleBClass;

public class Main {
    public static void main(String[] args) {
        ModuleAClass a = new ModuleAClass();
        ModuleBClass b = new ModuleBClass();

        a.sayHello();
        a.callB();

        b.sayHello();
        b.callA();
    }
}
