package cz.sparko.j9demo.moduleA;

import cz.sparko.j9demo.moduleB.ModuleBClass;

public class ModuleAClass {
    public void sayHello() {
        System.out.println("hello from A");
    }

    public void callB() {
        new ModuleBClass().sayHello();
    }
}
