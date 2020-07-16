public class ClassMethodVariables {

    public static void varargesVariable(int... a){
        for (int i: a) {
            System.out.print(i);
        }

    }

    public ClassMethodVariables(){

        System.out.print("\nhelloooooooooooooooooooo");
    }  public ClassMethodVariables(int i){

        System.out.print("\nhelloooooooooooooooooooo   integer 1");
    }  public ClassMethodVariables(int i, int j){

        System.out.print("\nhelloooooooooooooooooooo   2 value");
    }

}
class b extends ClassMethodVariables{

    public b(){}

    public static void show(){

        System.out.print("helooooooo");
    }


}