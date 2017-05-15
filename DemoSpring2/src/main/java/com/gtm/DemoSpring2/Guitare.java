package com.gtm.DemoSpring2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("maGuitare")
public class Guitare implements Instrument {

	public void jouer() {
		System.out.println("GUIT GUITARE...");
	}

}
