
/* revision notes for OOP */

import jdk.swing.interop.SwingInterOpUtils;

public class MainClass {

    public static void main(String[] args) {
        div();

        System.out.println("WELCOME TO MY OBJECT ORIENTED PROGRAMMING NOTES!\n this is the result of HOURS of learning via videos and excercises. After 20 hours, here I review the effects of OOP per field/variable and methods. As well as using Super and Sub classes, overloading and overwriting methods.\n I will keep adding to this program my notes as I learn more about OOP.\n NOTE: this is all after 2 months of studying and playing with Java's Syntax.");
        div();

        /*FIRST CONSTRUCTOR*/
        System.out.println("\n\uD83D\uDEE0️ CONSTRUCTOR CALL FOR OBJECT CREATION (from Main class)\n");
        SuperClass superClassObjectCreatedFromConstructor = new SuperClass(11,"a string");

        /*VISIBILITY TEST*/

        System.out.println("\uD83D\uDC40️ GETTERS/SETTERS VISIBILITY  (from Main class)\n");

        System.out.println(" ♥ ♥ ♥ ♥ ♥ SUPERCLASS ACCESS\n");
        superClassObjectCreatedFromConstructor.getFieldOnePublic();
        superClassObjectCreatedFromConstructor.getFieldTwoPrivate();
        System.out.println("❌ fieldThreeStatic is not accessible via the create object because it is static inside it's Class. Even if this MAIN method is static, it is still protected.");
        superClassObjectCreatedFromConstructor.getFieldFourFinal();
        System.out.println("❌ fieldFiveFS is not accessible via the create object because it is static inside it's Class. Even if this MAIN method is static, it is still protected.");

        System.out.println("""

                ⚠️ DIFFERENCE OF STATIC VS FINAL

                • STATIC fields are not visible to outside classes but yes inside and are able to be modified inside their own class.
                • FINAL fields are visible but not able to modify.""");

        System.out.println("\n❓ USING FIELDS IN THE OBJECT'S PARAMETER\n");
        System.out.println("To use these fields, we use the getters via the Object constructed.\n" + "superClassObjectCreatedFromConstructor.getFieldOnePublic()");
        /*OVERWRITING TEST (not overriding!)*/
        System.out.println("\n✏️ TESTING OVERWRITING OF PARAMETERS\n");
        superClassObjectCreatedFromConstructor.setFieldOnePublic(22);
        superClassObjectCreatedFromConstructor.setFieldTwoPrivate("another string");
        System.out.println("SET only overwrite them but not display them. We need to use the GET to display.");
        System.out.println("fieldOne is now "+superClassObjectCreatedFromConstructor.getFieldOnePublic());
        System.out.println("fieldTwo is now "+superClassObjectCreatedFromConstructor.getFieldTwoPrivate());
        System.out.println("fieldFour is always "+superClassObjectCreatedFromConstructor.getFieldFourFinal());

        System.out.println("\n ♥ ♥ ♥ ♥ ♥ SUBCLASS ACCESS\n");
        SubClass subClassObjectCreatedFromConstructor = new SubClass(33, ">String from SuperClass inside Parameter<");
        System.out.println("• Public Field One via subclass: " + subClassObjectCreatedFromConstructor.getFieldOnePublic());
        System.out.println("• Private Field Two via subclass: " + subClassObjectCreatedFromConstructor.getFieldTwoPrivate());
        System.out.println("• Final Field Four via subclass: " + subClassObjectCreatedFromConstructor.getFieldFourFinal());

        System.out.println("• Private Field Six from subclass: " + subClassObjectCreatedFromConstructor.getFieldSixPrivate());
        System.out.println("• Public Field Seven from subclass: " + subClassObjectCreatedFromConstructor.getFieldSevenPublic());
        /*OVERRIDING TEST*/
        System.out.println("\n ♥ ♥ ♥ ♥ ♥ USING OVERRIDING METHOD\n");
        SubClass subClassOverriding = new SubClass(44, "overriding 1", "overriding 2", "overriding 3");
        System.out.println("\nOVERRIDEN PARAMETERS: "+ subClassOverriding.getFieldOnePublic()+ ", "+subClassOverriding.getFieldTwoPrivate()+", "+subClassOverriding.getFieldFourFinal()+", "+subClassOverriding.getFieldSixPrivate()+", "+subClassOverriding.getFieldSevenPublic()+"\n");

        System.out.println("OVERRIDING CHECK if it overwrites previous object.");
        System.out.println("First Object, fieldOne: "+subClassObjectCreatedFromConstructor.getFieldOnePublic());
        System.out.println("Second Object, fieldOne: "+subClassOverriding.getFieldOnePublic());
        System.out.println("It does not ✔");

        System.out.println("\n");

        superClassObjectCreatedFromConstructor.OverridingClass("original text");
        subClassOverriding.OverridingClass("overriden text");



        System.out.println("""
                        ⚠️ DIFFERENCE OF OVERLOADING VS OVERRIDING
                        OVERLOADING: using same name but different type or parameters for the class, inside the same class.
                        OVERRIDING: what I did using the SubClass parameters to go on top of the SuperClass parameters."""
                );

        div();

        /*PROTECTED FIELD TEST*/
        SubClass subClassDefaultNProtected = new SubClass("fieldNineProtected from parameter", "fieldTenDefault from parameter","fieldSixPrivate","fieldSevenPublic");
        System.out.println("\nPROTECTED FIELD\n");
        System.out.println(superClassObjectCreatedFromConstructor.getFieldNineProtected());
        superClassObjectCreatedFromConstructor.setFieldNineProtected("New fieldNine");
        System.out.println(superClassObjectCreatedFromConstructor.getFieldNineProtected());
        System.out.println("Inherited via SubClass: "+subClassDefaultNProtected.getFieldNineProtected());

        /*DEFAULT FIELD TEST*/
        System.out.println("\nDEFAULT FIELD\n");
        System.out.println(superClassObjectCreatedFromConstructor.getFieldTenDefault());
        superClassObjectCreatedFromConstructor.setFieldTenDefault("New fieldTen");
        System.out.println(superClassObjectCreatedFromConstructor.getFieldTenDefault());
        System.out.println("Inherited via SubClass: "+subClassDefaultNProtected.getFieldTenDefault());

        div();

        /*ABSTRACT CLASSES*/
        System.out.println("\n  ABSTRACT CLASS\n");
        System.out.println("We cannot create an Object. It will generate an error.");

        System.out.println(" AbstractClass abstractClass = new AbstractClass();");
        System.out.println("ERROR: 'AbstractClass' is abstract; cannot be instantiated");
        System.out.println("\n");

        inheritedAbstractClass IAC = new inheritedAbstractClass("✔ public P-AF1", "✔ private P-AF2","✔ protected P-AF3", "✔ default P-AF6");

        /*Only public, private, protected and default can be overriden via inheritance.
         * static cannot be accessed by external constructor.*/

        System.out.println("Inherited AF1 : " + IAC.getAbstractFieldOne());
        System.out.println("Inherited AF2 : " + IAC.getAbstractFieldTwo());
        System.out.println("Inherited AF3 : " + IAC.getAbstractFieldThree());
        System.out.println("Inherited AF4 : cannot be reached.");
        System.out.println("Inherited AF5 : " + IAC.getAbstractFieldFive());
        System.out.println("Inherited AF6 : " + IAC.getAbstractFieldSix());

        IAC.Abstraction();

        div();


    }


     public static void div(){
             System.out.println("\n ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥\n");
         }
}
