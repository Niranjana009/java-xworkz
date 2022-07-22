package com.xworkz.core_java.collections.vectors.runner;

import java.util.ArrayList;
import java.util.Vector;

import com.xworkz.core_java.collections.vectors.dao.FlightDao;
import com.xworkz.core_java.collections.vectors.dao.FlightDaoImpl;
import com.xworkz.core_java.collections.vectors.dto.FligthDto;
import com.xworkz.core_java.collections.vectors.service.FligthService;
import com.xworkz.core_java.collections.vectors.service.FligthServiceImpl;

public class RunnerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FligthDto indiaGo=new FligthDto();
		indiaGo.setName("IndiaGo");
		indiaGo.setSource("Hubli");
		indiaGo.setDestination("Banglore");
		indiaGo.setPrice(25000.00);
		indiaGo.setType("Domestic");
	  //  indiaGo.Offers("5% discount if you travel to domestics for trip");
	//	indiaGo.
		
		

		FligthDto spiceJet=new FligthDto();
		spiceJet.setName("SpiceJet");
		spiceJet.setSource("Banglore");
		spiceJet.setDestination("USA");
		spiceJet.setPrice(50000.00);
		spiceJet.setType("International");
		//spiceJet.setOffers("20% discount if you travel to internationl for studty");


		FlightDao flightDao = new FlightDaoImpl();
		FligthService service = new FligthServiceImpl();
		service.save(indiaGo);
		service.save(spiceJet);
		service.updateTypeByPrice("International", 25000.00);
		service.deleteTypeByPrice("SpiceJet",50000.00 );
		service.updateDestinationByPrice("China", 25000.00);
		FligthDto fligth=service.getFligth(50000.00);
		System.out.println(fligth);

	//	ArrayList<String> offers=new ArrayList<String>();
	//	offers.add("5% discount if you travel to domestics for trip");
	//	offers.add("20% discount if you travel to internationl for studty");
	//	System.out.println(offers);









	}

}
