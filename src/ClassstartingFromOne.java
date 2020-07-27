public class ClassstartingFromOne {
//comment on line


    public static void main(String... args) throws Exception {
     /*   int i = System.in.read();
        System.out.println((char) i);



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
        ThisSuperkeyWord.anomouse();



        ABCD jj1= new ABCD(5,10);


        dhaval mk = new dhaval();
        mk.move();
        mk.cook();
        mk.dance();
        mk.call();

        childclass zx = new childclass();
        zx.show();
        zx.printbuddy();

        INTERFACEexample zxx = new childclass();
        zxx.show();


        StringOperation.stringconcat();
        StringOperation.stringlength();
        StringOperation.stringUppercase();

        StringOperation so = new StringOperation(10,"keval");
        System.out.println(so.toString());
*/


     /*   BufferReaderForInputStream.BBBBfuurreader();
        BufferReaderForInputStream.Bexample();
        */
      /*  BufferReaderForInputStream.examleofscanner();
        BufferReaderForInputStream.wrappweclass();
        BufferReaderForInputStream.splitstringmethod();
        BufferReaderForInputStream.stringbufferrrrr();*/



 /*       XYZ.demotakeinput();

        Exceptiobclass.first();
        Exceptiobclass.customExeption();*/


        /*cloningobject obj10 = new cloningobject();
        obj10.i=10;
        obj10.j=15;
        System.out.println(obj10);

        cloningobject obj11 = obj10;

        cloningobject obj12 = new cloningobject();
        obj12.i = obj10.i;
        obj12.j = obj10.j;

        */


       /* FlieHandling.filefirst();
        FlieHandling.propertyclass();*/

        /*Objectserialized.firstserialized();
        Objectserialized.deserializable();*/


       /* ABCD ad = new XYZ(10,11);

       ThreadclassExample thrd = new ThreadclassExample();
       Hello hello = new Hello();



       thrd.start();
       hello.start();

       Haii haii = new Haii();
       Hoiii hoiii = new Hoiii();


       Thread t1 = new Thread(haii);
       Thread t2 = new Thread(hoiii);

       t1.start();
       Thread.sleep(100);
       t2.start();*/

      /*  MiyaniThread miyaniThread = new MiyaniThread(10);

        Thread t1 = new Thread(miyaniThread);
        t1.start();
*/


        Thread t3 =  new Thread(()-> {
            for (int i = 0; i <= 4; i++) {
                System.out.println("OUT PUT.......Null");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t4 = new Thread(()-> {
            for (int i = 0; i <= 4; i++) {
                System.out.println(".......Processing.....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t3.setName("hai i am first THREAD-T001");
        System.out.println(t3.getName());

        t3.start();
        t4.setName("hai i am first THREAD-T002");
        System.out.println(t4.getName());
        t4.start();

        t3.join();
        t4.join();



        System.out.println("bye");


    }


}

