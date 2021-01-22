/*
- Abstraction can be achieved with either abstract classes or interfaces (?)

- The abstract keyword is a non-access modifier:
  - Abstract class: restricted & cannot create objects (only when inherited).
    -Abstract method: only used in an abstract class, without body (it is inherited from subClass).
*/

abstract class AbstractClass {

    public abstract void AbstractClass();
    /*Because they do not have a body, you cannot inset {} after*/
    public void nonAbstractClass() {
        System.out.println("This is inside the ABSTRACT class.");
    }

}
