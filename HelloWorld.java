package ge.ufc.main;
import com.sun.jdi.PathSearchingVirtualMachine;
import ge.ufc.main.Rectangle;

import javax.lang.model.SourceVersion;

import static ge.ufc.main.Comparearea.Comparea;
public class HelloWorld {
    public static void main(String[] args) {
/* part 1
            System.out.Println("Hello World");
*/

/* part 2
            Rectangle rec = new Rectangle();
            rec.SetLength(3);
            rec.SetWidth(5);
            System.out.println("perimeter is "+rec.Perimeter());
            System.out.println("area is " + rec.Area());
*/
/*part 3
            Rectangle rectangle;
            int perimeter= rectangle.Perimeter(); //error variable rectangle might not have been initialized;


        Rectangle rectangle1=null;
        int area= rectangle1.Area();//error NullPointerException

        Rectangle rectangle2 = new Rectangle();
        rectangle2.GetLength();//Getting 0 after execution.


        Rectangle rectangle3=new Rectangle();
        Rectangle rectangle4=new Rectangle();
        System.out.println(rectangle4==rectangle3);
        //returns false because it compares it's addreses which are different.
        rectangle3=rectangle4;
        System.out.println(rectangle3==rectangle4);//returns true because we already make them equal.
        Rectangle rectangle5= new Rectangle();
        Rectangle rectangle6= new Rectangle();
        rectangle6=rectangle5;
        rectangle6.SetWidth(12);
        System.out.println(rectangle5.GetWidth());//rectangle 6 had influence on rectangle 5
 */
       //  part 4
/*
Rectangle rectangle7=new Rectangle();
Rectangle rectangle8=new Rectangle();
rectangle8.SetWidth(12);
rectangle8.SetLength(1);
rectangle7.SetLength(4);
rectangle7.SetWidth(4);
System.out.println(Comparea(rectangle7,rectangle8));
part 5
 */
       int a;
        if (a+9<15) {
            System.out.println("Real is Champion");
 int b=9;
        }//error
        int b=67;//no error.

        }

    }

