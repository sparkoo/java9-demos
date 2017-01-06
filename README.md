# java9-demos

Demos of new Java9 features.

### setup
Check `j8.sh` and `j9.sh` and set correct `JAVA_HOME` paths

### run
#### demos with Main.java
To run individual demo, enter directory and run `../buildj8.sh` or `../buildj9.sh`

```
mvala[~/dev/devconf/demos] λ cd d03_anonymousClassDiamond/
mvala[~/dev/devconf/demos/d03_anonymousClassDiamond] λ sh ../buildj8.sh 
src/Main.java:7: error: cannot infer type arguments for Iface<T>
        anonymous = new Iface<>() {
                             ^
  reason: cannot use '<>' with anonymous inner classes
  where T is a type-variable:
    T extends Object declared in interface Iface
1 error
Error: Could not find or load main class Main
mvala[~/dev/devconf/demos/d03_anonymousClassDiamond] λ sh ../buildj9.sh 
not set yet
Hello
```
