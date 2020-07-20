public class ClassstartingFromOne {
//comment on line
/*
    sdhgff
    sfyjfgh
            sahjgwhjf
    sdfggf
                    sdhejh

    mltpl line comment*/

    public static void main(String... args){
        int num1 = 10;
        int num2 = 2;
        float c = 2.3f;
        float b = 2.3f;
        char  d= 'a';
        char  e= 'A';
        char  f= '?';
        System.out.println(num1+num2);
        System.out.println(c+b);
        System.out.println((int) c+b);
        System.out.println((int) f);
        System.out.println((int) d + "\n"+ (int) e);
        System.out.println((char)124);
        System.out.println("hello world");


// ADD class ==== basics
        Add.math();
        Add.increment();
        Add.binary();
        Add.postpreyincrement();

//Controller class
        Contoller.ifelse();
        Contoller.ternaryoperator();
        Contoller.swichcase();
        Contoller.forloop();
        Contoller.breakstatement();
        Contoller.ascii();


//pattern

        Pattern.pattern();
        Pattern.pattern1();
        Pattern.fibonacci();
        Pattern.pelindrom();
        Pattern.perfectnumber();
        Pattern.armstrong();


//Arry demo

        Arry.arrydemo();
        Arry.randomdemo();
        Arry.exceptionhadlingdemo();
        Arry.twodimentionary();


//ClassmethodVariables


         ClassMethodVariables.varargesVariable(1,4,3,5,6,6,6,6,6,6,6,6,6,6,6,6);
         ClassMethodVariables bjc = new ClassMethodVariables();
         ClassMethodVariables bjc1 = new ClassMethodVariables(5);
         ClassMethodVariables bjc2 = new ClassMethodVariables(5,10);




//EncaplusionExample-----

        EncapsulationExample q = new EncapsulationExample();
        q.setName("keval");
        System.out.print("\n"+q.getName());

//Inheritence Example
     B obj = new B();
     obj.add(5,10);

     B obj1 = new B();
     B obj2 = new B(3);


//// Pholymorw example
      PolymorphismExample.add();
      PolymorphismExample.add(5);
      PolymorphismExample.add(5,10);

      Overriding.add();

/////// THis key word
        ThisSuperkeyWord kd = new ThisSuperkeyWord(4);
        ThisSuperkeyWord.finalexample();


    }
}
