public abstract class AbstractCLass {

    public void  AbstractCLass(){ }

    public void call() {

        System.out.println("\n callingg........");
    }

    public abstract void move();

    public abstract void dance();

    public abstract void cook();

}

abstract class keval extends AbstractCLass {


    public void move() {
        System.out.println("......moving........");

    }
}

class dhaval extends keval {


    @Override
    public void dance() {
        System.out.println(".....Dancing.....");
    }

    @Override
    public void cook() {
        System.out.println("....Cooking....");
    }
}

class childclass implements INTERFACEexample{


    @Override
    public void show() {
        System.out.println(".....in interface....");

    }

    public void printbuddy(){

        System.out.println("......in ptint buddy.....");
    }
}
