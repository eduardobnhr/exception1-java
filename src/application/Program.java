package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modeule.entities.Reservation;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Room number: ");//aqui faz a leitura dos dados
			int number = sc.nextInt();
			System.out.print("CheckIn date (dd/MM/yyyy)");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("CheckOut date (dd/MM/yyyy)");
			Date checkOut = sdf.parse(sc.next());
	
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);//instancia a reserva
	
			System.out.println();//aqui le os dados, da atualização da reserva
			System.out.println("Enter data to update the reservation:");
			System.out.print("CheckIn date (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.print("CheckOut date (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());
	
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: "+ reservation);
		}	
		
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error in reservation: "+ e.getMessage());
		}
					sc.close();

	}

}
