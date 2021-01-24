class inheritedAbstractClass extends AbstractClass {


    @Override
    void Abstraction() {
        System.out.println("\nThis is the method template from the AbstractClass." +
                "Which does not make sense since it is empty. " +
                "But we can use the fields.\n");
    }

    public inheritedAbstractClass(String abstractFieldOne, String abstractFieldTwo, String abstractFieldThree, String abstractFieldSix) {
        super(abstractFieldOne, abstractFieldTwo, abstractFieldThree, abstractFieldSix);
    }




}



