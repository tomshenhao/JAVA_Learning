package Collection;

import java.util.*;

public class Theatre {
	
	private final String threatreName;
	public List<Seat> seats = new ArrayList<>();
	
	public Theatre(String threatreName, int numRows, int seatsPerRow) {
		this.threatreName=threatreName;
		
		int lastRow='A'+(numRows-1);
		for(char row='A'; row <=lastRow; row++) {
			for(int seatNum=1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row+String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}
	
	public String getThreatreName() {
		return threatreName;
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber);
		int fountSeat = Collections.binarySearch(seats, requestedSeat, null);
		
		if(fountSeat>=0) {
			return seats.get(fountSeat).reserve();
		} else {
			return false;
		}
		
	}
	
	public void getSeats() {
		for(Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}


	public class Seat implements Comparable<Seat>{
		private final String seatNumber;
		private boolean reserved = false;
		
		public Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}
		
		@Override
		public int compareTo(Seat seat) {
			return this.seatNumber.compareTo(seat.getSeatNumber());
		}
		
		public boolean reserve() {
			if(!this.reserved) {
				this.reserved=true;
				System.out.println("Seat "+seatNumber+" reserved");
				return true;
			} else {
				return false;
			}
		}
		
		public boolean cancel() {
			if(this.reserved) {
				this.reserved=false;
				System.out.println("Rservation of seat"+seatNumber+" cancelled");
				return true;
			} else {
				return false;
			}
		}

		public String getSeatNumber() {
			return seatNumber;
		}



	}

}
