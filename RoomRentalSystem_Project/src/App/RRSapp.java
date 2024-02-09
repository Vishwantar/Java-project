package App;
//import Entity.customer;
import Service.RRSservice;
import ServiceImpln.RRSserviceimpln;
import java.util.Scanner;
//import Entity.Address;

public class RRSapp {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		RRSservice r=new RRSserviceimpln();
		System.out.println("========Welcome to RRS=========");
		while(true) {
			System.out.println("=========Menu========");
			System.out.println("=======AC Rooms=======");
			System.out.println("1.Room Info\n2.Room Availability");
			System.out.println("3.check-In\n4.Check out \n5.Exit");
			System.out.println("Enter your option");
			int op=ip.nextInt();
			switch(op) {
			case 1:r.roomInfo();break;
			case 2:r.checkAvailabilty();break;
			case 3:r.checkIn();break;
			case 4:r.checkOut();break;
			case 5: System.out.println("=======Thank You Visit again========");
			System.exit(0);break;
			default:System.out.println("=========Invalid Option");
			}
		}
	}
}
