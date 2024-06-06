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