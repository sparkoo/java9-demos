package cz.sparko.j9demo.moduleB;

import cz.sparko.j9demo.moduleA.ModuleAClass;

public class ModuleBClass {
    public void sayHello() {
        System.out.println("hello from B");
    }

    public void callA() {
        new ModuleAClass().sayHello();
    }
}
