
/* revision notes for OOP */

public class MainClass {

    public static void main(String[] args) {
        div();
        System.out.println("WELCOME TO MY OBJECT ORIENTED PROGRAMMING NOTES!\n this is the result of HOURS of learning via videos and excercises. After 20 hours, here I review the effects of OOP per field/variable and methods. As well as using Super and Sub classes, overloading and overwriting methods.\n I will keep adding to this program my notes as I learn more about OOP.\n NOTE: this is all after 2 months of studying and playing with Java's Syntax.");
        div();
        System.out.println("\n\uD83D\uDEE0️ CONSTRUCTOR CALL FOR OBJECT CREATION (from Main class)\n");
        SuperClass superClassObjectCreatedFromConstructor = new SuperClass(11,"a string");
        System.out.println("\uD83D\uDC40️ GETTERS/SETTERS VISIBILITY  (from Main class)\n");

        System.out.println(" ♥ ♥ ♥ ♥ ♥ SUPERCLASS ACCESS\n");
        superClassObjectCreatedFromConstructor.getFieldOnePublic();
        superClassObjectCreatedFromConstructor.getFieldTwoPrivate();
        System.out.println("❌ fieldThreeStatic is not accessible via the create object because it is static inside it's Class. Even if this MAIN method is static, it is still protected.");
        superClassObjectCreatedFromConstructor.getFieldFourFinal();
        System.out.println("❌ fieldFiveFS is not accessible via the create object because it is static inside it's Class. Even if this MAIN method is static, it is still protected.");

        System.out.println("\n⚠️ DIFFERENCE OF STATIC VS FINAL\n\n• STATIC fields are not visible to outside classes but yes inside and are able to be modified inside their own class.\n• FINAL fields are visible but not able to modify.");

        System.out.println("\n❓ USING FIELDS IN THE OBJECT'S PARAMETER\n");
        System.out.println("To use these fields, we use the getters via the Object constructed.\n" + "superClassObjectCreatedFromConstructor.getFieldOnePublic()");

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

        System.out.println("\n ♥ ♥ ♥ ♥ ♥ USING OVERLOADED METHOD\n");
        SubClass subClassOverloading = new SubClass(44, "overloading 1", "overloading 2", "overloading 3");
        System.out.println("\nOVERLOADED PARAMETERS: "+ subClassOverloading.getFieldOnePublic()+ ", "+subClassOverloading.getFieldTwoPrivate()+", "+subClassOverloading.getFieldFourFinal()+", "+subClassOverloading.getFieldSixPrivate()+", "+subClassOverloading.getFieldSevenPublic()+"\n");

        System.out.println("OVERLOADING CHECK if it overwrites previous object.");
        System.out.println("First Object, fieldOne: "+subClassObjectCreatedFromConstructor.getFieldOnePublic());
        System.out.println("Second Object, fieldOne: "+subClassOverloading.getFieldOnePublic());
        System.out.println("It does not ✔");


        System.out.println("\n ♥ ♥ ♥ ♥ ♥ OVERRIDING METHOD TEST\n");
        System.out.println("Create object:");
        SubClass subClassOverriding = new SubClass(66,"overriding 1","overriding 2","overriding 3");
        
    }


     public static void div(){
             System.out.println("\n ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥\n");
         }
}
