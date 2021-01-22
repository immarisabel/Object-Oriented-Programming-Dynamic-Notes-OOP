/*
- Abstraction can be achieved with either abstract classes or interfaces (?)

- The abstract keyword is a non-access modifier:
  - Abstract class: restricted & cannot create objects (only when inherited).
    -Abstract method: only used in an abstract class, without body (it is inherited from subClass).
   - You use it to create other classes via inheritance.
      Because they do not have a body, you cannot inset {} after

 - Abstract methods force the same "idea" or "concept" , a list of fields needed, on new classes.
 EXAMPLE:

    Template recipe for cookies cannot be used until we add the conditions of using the recipes in summer or winter, and the flavors will change accordingly to how we want. So we do nto use the recipe, UNTIL we want to add something to it.

Abstracts CANNOT be private.
Compile safety, make sure it is all correctly used.
Also to evade repition. But you cannot make them final, so kind of pointless after Java 9?


The main reason to use an abstract class is when you need to support inheritance.
I'd prefer using interfaces when you can. The example is when you're designing a class hierarchy,
where you expect the user to derive from your abstract class in order to use it.
In this case, there should be shared functionality in the abstract class.
If you're simply expecting several classes to share the same similar behavior (method names),
then you want to stick with interfaces.


*/

public abstract class AbstractClass {

    /*Abstract Method*/
    abstract void AbstractClassMethod();

    private String abstractFieldEight = "Field Eight for Abstract Classes";

    public String getAbstractFieldEight() {
        System.out.println("✔ this is fieldEight (validation from AbstractClass) ");
        return abstractFieldEight;
    }

    public void setAbstractFieldEight(String abstractFieldEight) {
        this.abstractFieldEight = abstractFieldEight;
    }






}
