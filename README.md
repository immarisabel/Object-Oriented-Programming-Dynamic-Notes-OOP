 ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥

### WELCOME TO MY OBJECT ORIENTED PROGRAMMING NOTES

This is the result of HOURS of learning via videos and excercises. After 20 hours, here I review the effects of OOP per field/variable and methods. As well as using Super and Sub classes, overloading and overwriting methods.

I will keep adding to this program my notes as I learn more about OOP.

NOTE: this is all after 2 months of studying and playing with Java's Syntax.

_This is the result of the code._

_Feel free to play with the fields and methods to practice. I used InteliJ for the coding._


♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥

## MAIN CONCEPTS OF OOP IN JAVA
### 1. Encapsulation : private vs public fields. We use private and use getter/setter to access. 
   
a. GETTERS need return statements

####  
    public String getFieldTwoPrivate() {
        System.out.println("✔ this is fieldTwo (validation from SuperClass)");
        return fieldTwoPrivate;
    }
b. SETTERS need parameters
#### 
    public void setFieldTwoPrivate(String fieldTwoPrivate) {
        this.fieldTwoPrivate = fieldTwoPrivate;
    }

### 2. Inheritance (Subclass and Superclass)
  public class __SubClass__ _extends_ __SuperClass__

### 3. Polymorphism
- many classes are related to each other via use of inheritance.

- __AnimalClass__ has brains and hearts
  - __Dogs__ have 4 legs and fur, but also brain and heart
  - __Birds__ have 2 legs and wings, but also brain and heart
  - __Turtle__ have 4 legs and a shell, but also brain and heart

### 4. Abstraction
- Abstraction can be achieved with either abstract classes or interfaces (?)
- The abstract keyword is a non-access modifier:
  - __Abstract class:__ restricted & cannot create objects (only when inherited).
    - __Abstract method:__ only used in an abstract class, without body (it is inherited from subClass).

- Why And When To Use Abstract Classes and Methods?
    
  - To achieve security - hide certain details and only show the important details of an object.
   ### :woman_shrugging: I still do not get the point. 22/1/21
   ### :heavy_check_mark: I get it now! 23/1/21
 
♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥


:hammer_and_wrench: CONSTRUCTOR CALL FOR OBJECT CREATION (from Main class)


this is the SuperClass constructor being called with ►fieldOne◄ and ►fieldTwo◄. (validation from SuperClass)

:heavy_check_mark: 11 ◄◄ this is FieldOne as called inside the --Objects' parameters-- not the --Constructor--. (validation from SuperClass)

:heavy_check_mark: a string ◄◄ this is FieldTwo as called inside the --Objects' parameters-- not the --Constructor--. (validation from SuperClass)

### :eyes: GETTERS/SETTERS VISIBILITY  (from Main class)

- :heavy_check_mark: __this is fieldOne__ (validation from SuperClass)
- :heavy_check_mark: __this is fieldTwo__ (validation from SuperClass)
- :x: __fieldThreeStatic__ is not accessible via the create object because it is static inside it's Class. Even if this MAIN method is static, it is still protected.
- :heavy_check_mark: __this is fieldFour__ (validation from SuperClass)
- :x: __fieldFiveFS__ is not accessible via the create object because it is static inside it's Class. Even if this MAIN method is static, it is still protected.

#### Hierarchy from __least strict__ to __most strict__ is as follow:
    - public - full access without constructor
    - private - no access without constructor 
    - final - full view possible, no editing allowed
    - static - no access at all, only inside own class

### :warning: DIFFERENCE OF STATIC VS FINAL

- STATIC fields are not visible to outside classes but yes inside and are able to be modified inside their own class.
- FINAL fields are visible but not able to modify.

:question: USING FIELDS IN THE OBJECT'S PARAMETER

To use these fields, we use the getters via the Object constructed.
- _superClassObjectCreatedFromConstructor.getFieldOnePublic()_

### ✏️ TESTING OVERWRITING OF PARAMETERS

- SET only overwrite them but not display them. We need to use the GET to display.
:heavy_check_mark: this is fieldOne (validation from SuperClass)
- fieldOne is __now__ 22
:heavy_check_mark: this is fieldTwo (validation from SuperClass)
- fieldTwo is __now__ another string
:heavy_check_mark: this is fieldFour (validation from SuperClass)
- fieldFour is __always__ 4

### ♥ ♥ ♥ ♥ ♥ SUBCLASS ACCESS

- this is the SuperClass constructor being called with __►fieldOne◄__ and __►fieldTwo◄__. (validation from SuperClass)
- ✔ __33__ ◄◄ this is FieldOne as called inside the --Objects' parameters-- not the --Constructor--. (validation from SuperClass)
- ✔ __>String from SuperClass inside Parameter<__ ◄◄ this is FieldTwo as called inside the --Objects' parameters-- not the --Constructor--. (validation from SuperClass)

- ✔ this is fieldOne (validation from SuperClass)
  - Public Field One via subclass: 33
- ✔ this is fieldTwo (validation from SuperClass)
  - Private Field Two via subclass: >String from SuperClass inside Parameter<
- Verify Final field Four Overriding.
- ✔ this is fieldFour (validation from SuperClass)
  - Final Field Four via subclass: 4
- ✔ this is fieldSix (validation from SubClass)
  - Private Field Six from subclass: six 
- ✔ this is fieldSeven (validation from SubClass)
  - Public Field Seven from subclass: seven

### ♥ ♥ ♥ ♥ ♥ USING OVERRIDING METHOD

this is the SuperClass constructor being called with ►fieldOne◄ and ►fieldTwo◄. (validation from SuperClass)
- ✔ 44 ◄◄ this is FieldOne as called inside the --Objects' parameters-- not the --Constructor--. (validation from SuperClass)
- ✔ overriding 1 ◄◄ this is FieldTwo as called inside the --Objects' parameters-- not the --Constructor--. (validation from SuperClass)

- ✔ this is fieldOne (validation from SuperClass)
- ✔ this is fieldTwo (validation from SuperClass)
- Verify Final field Four Overriding.
- ✔ this is fieldFour (validation from SuperClass)
- ✔ this is fieldSix (validation from SubClass)
- ✔ this is fieldSeven (validation from SubClass)

#### OVERRIDEN PARAMETERS:
44, overriding 1, 4, overriding 2, overriding 3

#### OVERRIDING CHECK 
if it overwrites previous object.
- ✔ this is fieldOne (validation from SuperClass)
  - First Object, fieldOne: 33
- ✔ this is fieldOne (validation from SuperClass)
  - Second Object, fieldOne: 44
#### It does not ✔

### OVERRIDING CLASS
_Same name, same parameters, SubClass extended from SuperClass._
- This is the original text of the OverridingClass.
- This is the overriden text of the OverridingClass.

### ⚠️ DIFFERENCE OF OVERLOADING VS OVERRIDING
- OVERLOADING: using same name but different type or parameters for the class, inside the same class.
- OVERRIDING: what I did using the SubClass parameters to go on top of the SuperClass parameters.


### PROTECTED FIELD

- ✔ this is fieldNineProtected (validation from SuperClass)
  - NINE protected
- ✔ this is fieldNineProtected (validation from SuperClass)
  - New fieldNine
- ✔ this is fieldNineProtected (validation from SuperClass)
  - Inherited via SubClass: fieldNineProtected from parameter

### DEFAULT FIELD

- ✔ this is fieldTenDefault (validation from SuperClass)
  - TEN default
- ✔ this is fieldTenDefault (validation from SuperClass)
  - New fieldTen
- ✔ this is fieldTenDefault (validation from SuperClass)
  - Inherited via SubClass: fieldTenDefault from parameter



## ABSTRACT CLASS

We cannot create an Object. It will generate an error.
AbstractClass abstractClass = new AbstractClass();
ERROR: 'AbstractClass' is abstract; cannot be instantiated


  - Public AF1 validation from AbstractClass
    - Inherited AF1 : ✔ public P-AF1
  - Private AF2 validation from AbstractClass
    - Inherited AF2 : ✔ private P-AF2
  - Protected AF3 validation from AbstractClass
    - Inherited AF3 : ✔ protected P-AF3
  - Inherited AF4 : cannot be reached.
  - Final AF5 validation from AbstractClass
    - Inherited AF5 : [AF5 final]
  - Default AF6 validation from AbstractClass
    - Inherited AF6 : ✔ default P-AF6

This is the method template from the AbstractClass.Which does not make sense since it is empty. But we can use the fields.


## INTERFACE CLASS

- This is the Interface method One
- This is the Interface method Two
- This is the Interface method Three

Interfaces are like a contract on method's signatures, so we do not end up breaking code.

We define the methods without bodies.

We can create many classes that depend on these methods and parameters

## What is the difference?
Interface is an Abstract class, but Abstract class is not an interface.

Abstract class can have members variables that are inherited. Unlike, interfaces, it is really like a recipe, which you can use and adjust as needed. You can define methods, but the code is in the subclass.

When to use: if the classes are similar, need private or protected, and non static fields. You want to be able to modify fields.
It provides a common definition of a class for other classes to share.

Interfaces variables are all public, static and final (you can use private methods from Java 9). Constant values that never change. Because it is like a contract, it is MUCH more strict. Also methods are statics, and they cannot have constructors.

When to use: Unrelated classes want to use it. You want to specify the behaviour of a data type but don't care who uses it. JDBC API is an example. 

