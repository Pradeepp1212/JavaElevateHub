public class Datatypes 
{
public static void main (String args[])
{
byte totalbus = 127; //initialize

short passengers_per_month = 32000;

int ticketPrice = 900; // initialization
  
// int tickectPrice; // variable declaration
ticketPrice =1000;

long amtcollected = 200000000l;

float milage_per_litre = 5.00f;

double top_speed = 199.9909;

boolean govt_approval = true;

char overall_grade = 'A';

System.out.println("Total number of buses available "+totalbus);
System.out.println("Total passengers travelling per month "+passengers_per_month);
System.out.println("Average ticket price "+ ticketPrice);
System.out.println("Total amt collected "+amtcollected);
System.out.println("Average buses milage "+milage_per_litre);
System.out.println("Avg Topspeed "+top_speed);
System.out.println("Is G>O>V>T approved ? "+govt_approval);
System.out.print("Travels Overall rating "+ overall_grade);
}
}

/*In Java, data types define the type of data that a variable can hold. Java's data types can be broadly categorized into two groups: primitive data types and reference data types.

1. **Primitive Data Types**: These are basic data types provided by Java. They are predefined by the language and are not objects. There are eight primitive data types in Java:

   - **byte**: 8-bit integer data type.
   - **short**: 16-bit integer data type.
   - **int**: 32-bit integer data type.
   - **long**: 64-bit integer data type.
   - **float**: 32-bit floating-point data type.
   - **double**: 64-bit floating-point data type.
   - **char**: 16-bit Unicode character data type.
   - **boolean**: Represents true or false values.

2. **Reference Data Types**: These data types are not predefined by the language and are created by the programmer using classes or interfaces. Reference data types store references or memory addresses of objects. Examples of reference data types include:

   - **Classes**: Custom-defined data types.
   - **Interfaces**: A reference data type in Java representing a contract or set of method definitions.
   - **Arrays**: Ordered collections of elements, either primitive or reference types.

Java also supports autoboxing and unboxing, which allows automatic conversion between primitive data types and their corresponding wrapper classes (e.g., `int` to `Integer`, `double` to `Double`).

Additionally, Java provides type casting, allowing you to convert a variable from one data type to another, provided there's compatibility and no loss of data.

Understanding and utilizing these data types effectively is essential for writing efficient and correct Java programs.*/
