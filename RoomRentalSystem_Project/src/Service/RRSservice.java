package Service;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import Entity.customer;

public interface RRSservice {
	LinkedHashMap<Integer,customer> ac=new LinkedHashMap<Integer,customer>();
	LinkedHashMap<Integer,customer> NonAc = new LinkedHashMap<Integer,customer>();
	LinkedHashMap<Integer,customer> Deluxe = new LinkedHashMap<Integer,customer>();
    ArrayList<customer> l1=new ArrayList<customer>();
	
	void roomInfo();
	void checkAvailabilty();
	void checkIn();
	public void allocate(LinkedHashMap<Integer,customer>m,double camt,String roomType,int roomno);

	void checkOut();
	
}
