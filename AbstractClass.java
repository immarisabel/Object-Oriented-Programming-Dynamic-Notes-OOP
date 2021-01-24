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

abstract class AbstractClass {

    /*Abstract Methods are a template for classes. Classes are a template for objects.
    That is why you cannot create objects form abstract classes. Only from Inherited class.*/

    public String abstractFieldOne = "[AF1 public]";
    private String abstractFieldTwo = "[AF2 private]";
    protected String abstractFieldThree = "[AF3 protected]";
    static String abstractFieldFour = "[AF4 static]";
    final String abstractFieldFive = "[AF5 final]";
    String abstractFieldSix = "[AF6 default]";

    /*Only the FINAL field does not have a setter.
    * Field 4 allows here both but you cannot use it outside of class.*/
    abstract void Abstraction();

    public AbstractClass(String abstractFieldOne, String abstractFieldTwo, String abstractFieldThree, String abstractFieldSix) {
        this.abstractFieldOne = abstractFieldOne;
        this.abstractFieldTwo = abstractFieldTwo;
        this.abstractFieldThree = abstractFieldThree;
        this.abstractFieldSix = abstractFieldSix;
    }

    public String getAbstractFieldOne() {
        System.out.println("Public AF1 validation from AbstractClass");
        return abstractFieldOne;
    }

    public void setAbstractFieldOne(String abstractFieldOne) {
        this.abstractFieldOne = abstractFieldOne;
    }

    public String getAbstractFieldTwo() {
        System.out.println("Private AF2 validation from AbstractClass");
        return abstractFieldTwo;
    }

    public void setAbstractFieldTwo(String abstractFieldTwo) {
        this.abstractFieldTwo = abstractFieldTwo;
    }

    public String getAbstractFieldThree() {
        System.out.println("Protected AF3 validation from AbstractClass");
        return abstractFieldThree;
    }

    public void setAbstractFieldThree(String abstractFieldThree) {
        this.abstractFieldThree = abstractFieldThree;
    }

    public static String getAbstractFieldFour() {
        System.out.println("Static AF4 validation from AbstractClass");
        return abstractFieldFour;
    }

    public static void setAbstractFieldFour(String abstractFieldFour) {
        AbstractClass.abstractFieldFour = abstractFieldFour;
    }

    public String getAbstractFieldFive() {
        System.out.println("Final AF5 validation from AbstractClass");
        return abstractFieldFive;
    }

    public String getAbstractFieldSix() {
        System.out.println("Default AF6 validation from AbstractClass");
        return abstractFieldSix;
    }

    public void setAbstractFieldSix(String abstractFieldSix) {
        this.abstractFieldSix = abstractFieldSix;
    }
}
