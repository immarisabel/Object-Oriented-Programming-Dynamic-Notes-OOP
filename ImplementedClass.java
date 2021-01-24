public class ImplementedClass implements InterfaceClass{

    /*We need to create empty methods*/
    /*Use the fields first*/

    private String iTwo;
    private int iThree;

    /*Alt insert = implement methods*/

    @Override
    public void methodDefinedOne() {
        System.out.println("This is the Interface method One");
    }

    @Override
    public void methodDefinedTwo(String iTwo) {
        iTwo = "implemented method two";
        System.out.println("This is the Interface method Two");

    }

    @Override
    public void methodDefinedThree(int iThree) {
        iThree = 3;
        System.out.println("This is the Interface method Three");

    }
}
