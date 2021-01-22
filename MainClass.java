package ObjectOrientedProgramming;

/* revision notes for OOP */

public class MainClass {

    public static void main(String[] args) {
        div();
        System.out.println("WELCOME TO MY OBJECT ORIENTED PROGRAMMING NOTES!\n this is the result of HOURS of learning via videos and excercises. After 20 hours, here I review the effects of OOP per field/variable and methods. As well as using Super and Sub classes, overloading and overwriting methods.\n I will keep adding to this program my notes as I learn more about OOP.\n NOTE: this is all after 2 months of studying and playing with Java's Syntax.");
        div();
        System.out.println("\n\uD83D\uDEE0️ CONSTRUCTOR CALL FOR OBJECT CREATION (from Main class)\n");
        SuperClass superClassObjectCreatedFromConstructor = new SuperClass(11,"a string");
        System.out.println("\uD83D\uDC40️ GETTERS/SETTERS VISIBILITY  (from Main class)\n");
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

    }


     public static void div(){
             System.out.println("\n ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥\n");
         }
}
