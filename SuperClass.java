
public class SuperClass {

    /* this main Class will contain the base code
    the subclass will inherit the code with or without defined limitations*/

    public int fieldOnePublic = 1;
    /*any method in any class the access this field*/

    private String fieldTwoPrivate = "two";
    /* only methods inside this class has access to this field
    * this is why we use GET/SET to access it from outside the class*/

    static double fieldThreeStatic = 3.3;
    /*STATIC fields can only belong to their class.

    NONSTATIC belong the instance/methods of the class.

       public class Name {
            double fieldThree;
        }

    */

    final int fieldFourFinal = 4;
    /*a final variable needs to always be initialized, this initial value cannot change.
    A final field is often also declared static.
    A static and final field is also called a "constant" because it never changes.
    */

    final static String fieldFiveFS = "FIVE final and static!";

    public void OverridingClass (String text){
        System.out.println("This is the original text of the OverridingClass.");
    }

    public SuperClass(int fieldOnePublic, String fieldTwoPrivate) {
        /*this constructor could only access fieldOne and fieldTwo as they are not static nor final.
        * Constructors need to have same name as class.
        * Constructors cannot be use to RUN the program. It is ONLY to access the fields via the methods.*/
        this.fieldOnePublic = fieldOnePublic;
        this.fieldTwoPrivate = fieldTwoPrivate;
        System.out.println("this is the SuperClass constructor being called with ►fieldOne◄ and ►fieldTwo◄. (validation from SuperClass)\n"+
                "✔ " +this.fieldOnePublic +" ◄◄ this is FieldOne as called inside the --Objects' parameters-- not the --Constructor--. (validation from SuperClass)\n"+
                "✔ " +this.fieldTwoPrivate +" ◄◄ this is FieldTwo as called inside the --Objects' parameters-- not the --Constructor--. (validation from SuperClass)\n");
    }


    /*I was able to access all 4 fields via getters/setters*/
    public int getFieldOnePublic() {
        System.out.println("✔ this is fieldOne (validation from SuperClass)");
        return fieldOnePublic;
    }

    public void setFieldOnePublic(int fieldOnePublic) {
        this.fieldOnePublic = fieldOnePublic;
    }

    /*SETTERS need parameters*/
    public String getFieldTwoPrivate() {
        System.out.println("✔ this is fieldTwo (validation from SuperClass)");
        return fieldTwoPrivate;
    }
    /*GETTERS need return statements*/
    public void setFieldTwoPrivate(String fieldTwoPrivate) {
        this.fieldTwoPrivate = fieldTwoPrivate;
    }

    public static double getFieldThreeStatic() {
        System.out.println("✔ this is fieldThree (validation from SuperClass)");
        return fieldThreeStatic;
    }

    public static void setFieldThreeStatic(double fieldThreeStatic) {
        SuperClass.fieldThreeStatic = fieldThreeStatic;
    /*fieldThree can be a SETTER via use of SUPERCLASS function*/
        //TODO need to research this method, it is the first time I see it.
    }

    public int getFieldFourFinal() {
        System.out.println("✔ this is fieldFour (validation from SuperClass)");
        return fieldFourFinal;
        /*fieldFour can only be access but not modified, hence we only recived a GETTER and not a SETTER*/
    }

    public static String getFieldFiveFS() {
        return fieldFiveFS;
    }


}
