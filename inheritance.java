class Abcd
{ void disp1(){
System.out.println("Abcd");
}
}


class Xyz extends Abcd{

 void disp2()
{//disp1();
System.out.println("xyz");
}
}


class Pqr extends Xyz{

 
 void disp3(){
disp1();
disp2();
System.out.println("pqr");
}
}





class inheritance{
public static void main(String args[]){

Pqr a1=new Pqr();
a1.disp3();






}


}