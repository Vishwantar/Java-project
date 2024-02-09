package ServiceImpln;

import java.util.LinkedHashMap;
import java.util.Scanner;

import Entity.Address;
import Entity.customer;
import Service.RRSservice;
//import App.RRSapp;


public class RRSserviceimpln implements RRSservice{
	Scanner ip=new Scanner(System.in);
	
	{
		for(int i=101;i<=108;i++) {
			ac.put(i,null);
		}
	}
	@Override
	public void roomInfo() {
		System.out.println("========Room Details======");
		System.out.println("=========AC Rooms=======");
		System.out.println("1.AC\n2.TV\n3.WIFI\n4.Fridge");
		System.out.println("Price:2500/day");
	}
	@Override
	public void checkAvailabilty() {
		System.out.println("=========AC Rooms=========");
		int c=0;
		for(int key:ac.keySet()) {//101 102 103.....108
			if(ac.get(key)==null) {
		
				System.out.println(key+"");
				c++;
			}
		}
		if(c==0) {
			System.out.println("All rooms are occupied");
		}
		System.out.println();
	}
	@Override
	public void checkIn() {
		System.out.println("=============Check-In============");
		System.out.println("=======Room Details===========");
		System.out.println("1.AC\n2.Non-AC\n3.WIFI\n4.Deluxe");
		System.out.println("Enter your option");
		int op=ip.nextInt();
		System.out.println("Please Enter Roomno.");
		int roomno=ip.nextInt();
		switch(op) {
			case 1:if(ac.containsKey(roomno)&& ac.get(roomno)==null) {
			allocate(ac,2500,"ac",roomno);
			}else {
			System.out.println("Invalid room no. or room is not available");
			}break;
			case 2:System.out.println("need to be implemented");break;
			case 3:System.out.println("need to be implemented");break;
			default:System.out.println("Invalid option");
		}
	}
	@Override
	public void allocate(LinkedHashMap<Integer,customer>m,double camt,String roomType,int roomno) {
	
	System.out.println("===========Customer Details==========");
	System.out.println("Please Enter Customer ID =>");
	int cid=ip.nextInt();
	System.out.println("Please Enter Customer name=>");
	String cname=ip.next();
	System.out.println("Please Enter Customer phno =>");
	long cphno=ip.nextLong();
	System.out.println("Please Enter Customer house no =>");
	String houseno=ip.next();
	System.out.println("Please Enter Customer Street =>");
	String streetname=ip.next();
	System.out.println("Please Enter Customer pincode =>");
	int pincode=ip.nextInt();
	Address a=new Address(houseno,streetname,pincode);
	customer c=new customer(cid,cname,cphno,a,camt,roomType);
	l1.add(c);
	m.put(roomno,c);
	System.out.println(c.getCname()+" had allocate for "+roomType+" room no: "+roomno);
	System.out.println("Amount need to be paid "+camt);
}
	@Override
	public void checkOut() {
		System.out.println("=============Check-out============");
		System.out.println("=======Room Details===========");
		System.out.println("1.AC\n2.Non-AC\n3.WIFI\n4.Deluxe");
		System.out.println("Enter your option");
		int op=ip.nextInt();
		System.out.println("Please Enter Roomno.");
		int roomno=ip.nextInt();
		System.out.println("Please enter customer id");
		int cid=ip.nextInt();
		switch(op) {
	case 1:if(ac.containsKey(roomno)&& ac.get(roomno)!=null && ac.get(roomno).getCid()==cid) {
	System.out.println(ac.get(roomno).getCname()+" Thanks for Visiting ");
	ac.put(roomno, null);
	}else {
	System.out.println("Invalid room no. or room is not available");
	}break;
	case 2:System.out.println("need to be implemented");break;
	case 3:System.out.println("need to be implemented");break;
	default:System.out.println("Invalid option");
}
}

	}
	
