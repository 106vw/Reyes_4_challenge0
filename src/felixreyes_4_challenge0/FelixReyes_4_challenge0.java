package felixreyes_4_challenge0;

public class FelixReyes_4_challenge0 {

    public static void main(String[] args) {
        for (int i = 0; i < 501; i++) {
            if (isDivisiblebyfive(i) & isDivisiblebyeleven(i)) {
                System.out.println("animate this" + i);
            }else if (isDivisiblebytwo(i) & isDivisiblebyeleven(i)) {
                System.out.println("NINJA " + i);
            }else if (isDivisiblebythree(i) & isDivisiblebyeleven(i)) {
                System.out.println("herr direktor" + i);
            }else if (isDivisiblebytwo(i) & isDivisiblebythree(i) & isDivisiblebyfive(i)) {
                System.out.println("TeamBuilding" + i);
            }else if (isDivisiblebythree(i) & isDivisiblebyfive(i)) {
                System.out.println("oldschool" + i);
            }else if (isDivisiblebytwo(i) & isDivisiblebythree(i)) {
                System.out.println("Chisme" + i);
            }else if (isDivisiblebyfive(i)) {
                System.out.println("vidal" + i);
            }else if (isDivisiblebythree(i)) {
                System.out.println("claughton" + i);
            }  
            else if (isDivisiblebytwo(i)) {
                System.out.println("Davis" + i);
            } 
        }
        System.out.println(":D");
    }

    static boolean isDivisiblebytwo(int num) {
        return (num % 2 == 0);
    }

    static boolean isDivisiblebythree(int num) {
        return (num % 3 == 0);
    }

    static boolean isDivisiblebyfive(int num) {
        return (num % 5 == 0);
    }

    static boolean isDivisiblebyeleven(int num) {
        return (num % 11 == 0);

    }
}
