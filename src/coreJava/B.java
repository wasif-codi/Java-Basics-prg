package coreJava;

public class B extends A{
    public int x=100, y=200;
    public void disp(){
        int x=1000, y=2000;
        System.out.println(this.x);
        System.out.println(y);
        System.out.println(x);
        System.out.println(super.x);
        System.out.println(x);
        System.out.println(y);
    }

}
