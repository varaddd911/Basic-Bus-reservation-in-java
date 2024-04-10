
import java.util.Scanner;
public class BusReservation {
	Scanner s = new Scanner(System.in);
	String sp, destination, dec;

	int date, year, rdate, ryear;
	int choice;
	long pn;
	int seat;
	String name[] = new String[10];
	int age[] = new int[10];
	int i;
	int flag;
	String month, rmonth;

	void ticket() {
		while (true) {

			System.out.println("\t\t\t**WELCOME TO HIMANI TRAVELS");
			System.out.println("Please select your choice from the Menu  :   ");
			System.out.println("1) 1 WAY TICKET ");
			System.out.println("2) BOOK WITH REUTRN TICKET WAY TICKET");
			System.out.println("3) Exit");
			choice = s.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Please enter the Starting point");
				sp = s.next();
				System.out.println("Please enter the destinaton");
				destination = s.next();
				System.out.println("Please enter the date in format of date/month(alphabatically)/year");
				date = s.nextInt();
				month = s.next();
				year = s.nextInt();
				System.out.println("Please enter the number of passenger");
				seat = s.nextInt();
				for (i = 0; i < seat; i++) {
					System.out.println("Passenger no : " + (i + 1));
					System.out.println("Please enter the name");
					name[i] = s.next();
					System.out.println("Please enter the age");
					age[i] = s.nextInt();
				}
				System.out.println("Please enter youe mobile number");
				pn = s.nextLong();
				System.out.println(
						"\nYOUR FAIR FOR THE TICKET WILL BE : Rs " + seat * (destination.length() * 100) + "/-");
				flag = 1;
				while (flag == 1) {
					System.out.println("\nWOULD YOU LIKE TO CONFIRM(yes/no)");
					dec = s.next();
					switch (dec) {
					case "yes":
						System.out.println("\n------------------------------------------------");
						System.out.println("YOUR TICKET IS CONFIRM");
						System.out.println("DATE FOR TRAVEL IS :- " + date + " " + month + " " + year);
						System.out.println("YOUR START POINT IS : " + sp);
						System.out.println("YOUR DESTINATION IS : " + destination);
						System.out.println("YOUR TOTAL FAIR IS : Rs " + (seat * (destination.length() * 100)) + "/-");
						for (i = 0; i < seat; i++) {
							System.out.println("Details for passenger : " + (i + 1));
							System.out.println("Name is : " + (name[i]));
							System.out.println("Age is : " + (age[i]));
						}
						System.out.println("FURTHER DETAILS WILL BE SHARED ON : - " + pn);
						System.out.println("THANK YOU FOR TRAVELLING WITH US !!");
						flag = 0;
						System.out.println("\n------------------------------------------------");
						break;
					case "YES":
						System.out.println("\n------------------------------------------------");
						System.out.println("YOUR TICKET IS CONFIRM");
						System.out.println("DATE FOR TRAVEL IS :- " + date + " " + month + " " + year);
						System.out.println("YOUR START POINT IS : " + sp);
						System.out.println("YOUR DESTINATION IS : " + destination);
						System.out.println("YOUR TOTAL FAIR IS : Rs " + (seat * (destination.length() * 100)) + "/-");
						for (i = 0; i < seat; i++) {
							System.out.println("Details for passenger : " + (i + 1));
							System.out.println("Name is : " + (name[i]));
							System.out.println("Age is : " + (age[i]));
						}
						System.out.println("FURTHER DETAILS WILL BE SHARED ON : - " + pn);
						System.out.println("THANK YOU FOR TRAVELLING WITH US !!");
						flag = 0;
						System.out.println("\n------------------------------------------------");
						break;
					case "no":
						System.out.println("\n------------------------------------------------\n");
						System.out.println("SORRY TO HEAR THAT NOT YOU ARE NOT TRAVELLING WITH US");
						System.out.println("WILL GET BACK TO YOU WITH MORE EXCITING DEALS AT :- " + pn);
						System.out.println("\n------------------------------------------------");
						flag = 0;
						break;
					case "NO":
						System.out.println("\n------------------------------------------------\n");
						System.out.println("SORRY TO HEAR THAT NOT YOU ARE NOT TRAVELLING WITH US");
						System.out.println("WILL GET BACK TO YOU WITH MORE EXCITING DEALS AT :- " + pn);
						System.out.println("\n------------------------------------------------");
						flag = 0;
						break;
					default:
						System.out.println("PLEASE ENTER A VALID CHOICE ");
						flag = 1;

					}
				}

				break;
			case 2:
				System.out.println("Please enter the Starting point");
				sp = s.next();
				System.out.println("Please enter the destinaton");
				destination = s.next();
				System.out.println("Please enter the journey date in format of dd/mm/y");
				date = s.nextInt();
				month = s.next();
				year = s.nextInt();
				System.out.println("Please enter the return journey date in format of dd/mm/y");
				rdate = s.nextInt();
				rmonth = s.next();
				ryear = s.nextInt();
				System.out.println("Please enter the number of passenger");
				seat = s.nextInt();
				for (i = 0; i < seat; i++) {
					System.out.println("Passenger no : " + (i + 1));
					System.out.println("Please enter the name");
					name[i] = s.next();
					System.out.println("Please enter the age");
					age[i] = s.nextInt();
				}
				System.out.println("Please enter youe mobile number");
				pn = s.nextLong();
				System.out.println(
						"\nYOUR FAIR FOR THE TICKET WILL BE Rs " + 2 * seat * (destination.length() * 100) + "/-");
				flag = 1;
				while (flag == 1) {
					System.out.println("\nWOULD YOU LIKE TO CONFIRM(yes/no)");
					dec = s.next();
					switch (dec) {
					case "yes":
						System.out.println("\n------------------------------------------------");
						System.out.println("YOUR TICKET INCLUDING RETURN TICKET IS CONFIRM");
						System.out.println("DATE FOR TRAVEL IS :- " + date + " " + month + " " + year);
						System.out.println("YOUR START POINT IS : " + sp);
						System.out.println("YOUR DESTINATION IS : " + destination);
						System.out.println("\n");
						System.out.println("DATE FOR RETURN JOURNEY IS :- " + rdate + " " + rmonth + " " + ryear);
						System.out.println("YOUR START POINT FOR RETURN JOURNEY IS : " + destination);
						System.out.println("YOUR DESTINATION FOR RETURN JOURNEY IS : " + sp);
						System.out.println("\n");
						System.out
								.println("YOUR TOTAL FAIR IS : Rs" + 2 * (seat * (destination.length() * 100)) + "/-");
						for (i = 0; i < seat; i++) {
							System.out.println("Details for passenger : " + (i + 1));
							System.out.println("Name is : " + (name[i]));
							System.out.println("Age is : " + (age[i]));
						}
						System.out.println("FURTHER DETAILS WILL BE SHARED ON : - " + pn);
						System.out.println("THANK YOU FOR TRAVELLING WITH US !!");
						System.out.println("\n------------------------------------------------");
						flag = 0;
						break;
					case "YES":
						System.out.println("\n------------------------------------------------");
						System.out.println("YOUR TICKET IS CONFIRM");
						System.out.println("DATE FOR TRAVEL IS :- " + date + " " + month + " " + year);
						System.out.println("YOUR START POINT IS : " + sp);
						System.out.println("YOUR DESTINATION IS : " + destination);
						System.out.println("YOUR TOTAL FAIR IS : Rs " + (seat * (destination.length() * 100)) + "/-");
						for (i = 0; i < seat; i++) {
							System.out.println("Details for passenger : " + (i + 1));
							System.out.println("Name is : " + (name[i]));
							System.out.println("Age is : " + (age[i]));
						}
						System.out.println("FURTHER DETAILS WILL BE SHARED ON : - " + pn);
						System.out.println("THANK YOU FOR TRAVELLING WITH US !!");
						flag = 0;
						System.out.println("\n------------------------------------------------");
						break;
					case "no":
						System.out.println("\n------------------------------------------------\n");
						System.out.println("SORRY TO HEAR THAT NOT YOU ARE NOT TRAVELLING WITH US");
						System.out.println("WILL GET BACK TO YOU WITH MORE EXCITING DEALS AT :- " + pn);
						System.out.println("\n------------------------------------------------");
						flag = 0;
						break;
					case "NO":
						System.out.println("\n------------------------------------------------\n");
						System.out.println("SORRY TO HEAR THAT NOT YOU ARE NOT TRAVELLING WITH US");
						System.out.println("WILL GET BACK TO YOU WITH MORE EXCITING DEALS AT :- " + pn);
						System.out.println("\n------------------------------------------------");
						flag = 0;
						break;
					default:
						System.out.println("PLEASE ENTER A VALID CHOICE ");
						flag = 1;

					}
				}

				break;
			case 3:
				System.out.println("THANK YOU --HIMANI TRAVELS");
				System.exit(0);

			default:
				System.out.println("INVALID CHOICE PLEASE SELECT CORRECT OPTION");
			}// switch()

		}
	}

	public static void main(String[] args) {
		BusReservation b = new BusReservation();
		b.ticket();

	}

}
