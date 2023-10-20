import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

boolean b = true;

while (b) {

int x = sc.nextInt();
int y = sc.nextInt();
int z = sc.nextInt();

if (x == 0 && y == 0 && z == 0) {
break;
}

if (x >= y + z || y >= x + z || z >= x + y) {
System.out.println("Invalid");
}else if (x == y && x == z && y == z) {
System.out.println("Equilateral");
} else if (x == y || x == z || y == z) {
System.out.println("Isosceles");
} else if (x != y && x != z && y != z) {
System.out.println("Scalene");
}

}
}
}