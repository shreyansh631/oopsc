package Inheritance;

/*For an application, there are some features.
The standard free version has only two features, to draw and write text on a photo.
The Pro subscription has 2 more features - the ability to use effects and the ability to change resolution.*/
public class Main {
    public static void main(String[] args) {
        Standard standard1 = new Standard();
        Pro pro1 = new Pro();

        //standard version
        standard1.draw();
        standard1.write();

        //Pro version
        pro1.draw();
        pro1.write();
        pro1.useEffects();
        pro1.changeResolution();
    }
}
class Standard {
    public void draw() {
        System.out.println("Drawing");
    }

    public void write() {
        System.out.println("Writing");
    }
}
    class Pro extends Standard{

        public void useEffects() {
            System.out.println("Using Effects");
        }

        public void changeResolution() {
            System.out.println("Changing Resolution");
        }
    }




