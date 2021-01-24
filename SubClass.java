
/*When subclass is extended, the only fields allowed to be accessed are Public and Private
* The other 2 fields are static and/or final, so the subclass is not allowed to manipulate this*/


public class SubClass extends SuperClass{

    private String fieldSixPrivate = "sixPrivate";
    public String fieldSevenPublic = "sevenPublic";

    @Override
    public void OverridingClass (String text){
        System.out.println("This is the overriden text of the OverridingClass.");
    }

    @Override
    public int getFieldFourFinal() {
        System.out.println("Verify Final field Four Overriding.");
        return super.getFieldFourFinal();
    }

    public SubClass(String fieldNineProtected, String fieldTenDefault, String fieldSixPrivate, String fieldSevenPublic) {
        super(fieldNineProtected, fieldTenDefault);
        this.fieldSixPrivate = fieldSixPrivate;
        this.fieldSevenPublic = fieldSevenPublic;
    }

    public SubClass(int fieldOnePublic, String fieldTwoPrivate) {
        super(fieldOnePublic, fieldTwoPrivate);
    }


    /*This is method overloading. Both classes are named SubClass,
    but since both have different parameters,
    it is legal. It can also be different data type.*/

    public SubClass(int fieldOnePublic, String fieldTwoPrivate, String fieldSixPrivate, String fieldSevenPublic) {
        super(fieldOnePublic, fieldTwoPrivate);
        this.fieldSixPrivate = fieldSixPrivate;
        this.fieldSevenPublic = fieldSevenPublic;
    }

    /*Initializing inside Constructors will not allow you to set from Main Class.
    * public SubClass(String fieldTwoPrivate, String fieldSixPrivate, String fieldSevenPublic) {
        super(55, fieldTwoPrivate);
        this.fieldSixPrivate = fieldSixPrivate;
        this.fieldSevenPublic = fieldSevenPublic;
    }
    * int 55 from fieldOne will not be allowed to be set form Main Class. And will remain 55.
    * */


    /*Getter and Setter only available for the fields in SubClass since the other ones are already existent.*/
    public String getFieldSixPrivate() {
        System.out.println("✔ this is fieldSix (validation from SubClass)");
        return fieldSixPrivate;
    }

    public void setFieldSixPrivate(String fieldSixPrivate) {
        this.fieldSixPrivate = fieldSixPrivate;
    }

    public String getFieldSevenPublic() {
        System.out.println("✔ this is fieldSeven (validation from SubClass)");
        return fieldSevenPublic;
    }


    public void setFieldSevenPublic(String fieldSevenPublic) {
        this.fieldSevenPublic = fieldSevenPublic;
    }



}
