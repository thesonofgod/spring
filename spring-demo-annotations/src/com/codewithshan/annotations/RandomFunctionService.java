package com.codewithshan.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFunctionService implements FortuneService {

	//create an array of strings
	private String[] data = {
			"beware of the world","journey is the reward","jasdaskduaysd","3","4","5"
	};
	
	// create a random number generator 
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
	//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
