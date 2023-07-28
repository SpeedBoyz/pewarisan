//package src;
//Class Abstract
//Inheritance
//Encapsule
//Overriding
//Overloading

abstract class Peminjaman{
    void denda(){}
    void pengembalian(){}
}

class PBO extends Peminjaman{
    @Override
    void denda(){

    }
}
 //overledding
class Parent{
    public int x;

    void print(String tipeAnggota, int Bayar){
        System.out.println("Print Parent");
    }

    void print(String tipeAnggota){
        System.out.println("Print Parent");
    }

    void print(){
        System.out.println("Print 2");
    }
}

//overriding
class A extends Parent{

    //@Override
    void print(){
        System.out.println(x:"Print A");

    }

    void test(){
        print();
        x = 5;
    }
}

class B extends A{
    void test2(){
        print();
    }
}

public class App extends Parent{
    
    public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        parent.print();
        parent.print("Mahasiswa");

        A a = new A();
        a.print();

        //Peminjaman peminjaman = new Peminjaman();
        //peminjaman.print();
    }
}
