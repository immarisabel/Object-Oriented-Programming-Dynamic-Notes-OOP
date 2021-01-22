
/*When subclass is extended, the only fields allowed to be accessed are Public and Private
* The other 2 fields are static and/or final, so the subclass is not allowed to manipulate this*/


public class SubClass extends SuperClass{

    private String fieldSixPrivate = "six";
    public String fieldSevenPublic = "seven";

    public SubClass(int fieldOnePublic, String fieldTwoPrivate) {
        super(fieldOnePublic, fieldTwoPrivate);
    }

    /*This is method overloading. Both classes are named SubClass, but since both have different parameters, it is legal.*/
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

    @Override
    public int getFieldOnePublic() {
        System.out.println("Overriding Field One");
        return super.getFieldOnePublic();

    }

    @Override
    public String getFieldTwoPrivate() {
        System.out.println("Overriding Field Two");
        return super.getFieldTwoPrivate();
    }

    @Override
    public int getFieldFourFinal() {
        System.out.println("Overriding Field Four");
        return super.getFieldFourFinal();
    }


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



    //TODO method overriding
}
