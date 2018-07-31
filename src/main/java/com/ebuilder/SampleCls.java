package com.ebuilder;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2014, eBuilder AB
 * All rights reserved
 *
 * This is UNPUBLISHED PROPRIETARY SOURCE CODE
 * of eBuilder AB;
 * the contents of this file may not be disclosed to third parties,
 * copied or duplicated in any form, in whole or in part,
 * without the prior written permission of eBuilder AB.
 * 
 *<p></p>
 * 
 * <b>Author:</b> Asanka Siriwardena <br/>
 * <b>Date:</b> Oct 17, 2014 <br/>
 * <b>Time:</b> 2:23:16 PM
 * 
 */

public class SampleCls {

	// GIT Testing Asanka

	public static void main(String[] args) {

		calculateNthPower(7, 1000);
	}


	private static void calculateNthPower(int base, int power) {
		getNthPowerDivideAndConquer(base, power);
		System.out.println("\n-----------------------------------------\n");
		getNthPowerBruteForce(base, power);
	}
	
   static void getNthPowerDivideAndConquer(int base, int power){
	   
	    long startUp = System.currentTimeMillis();
	    int initPower = power;
	    int height = logOfBase(2, power);	
		boolean[] hArr = new boolean[height];
		
		while (power > 1){		
			boolean remainder = (power % 2 == 1);
			hArr[--height] = remainder;
			power = power/2;
		}
		
		
		BigInteger result = BigInteger.valueOf(base);
		
		for(int i=0; i < hArr.length; i++){
			
			boolean remainder = hArr[i];		
			result =  remainder ? result.multiply(result).multiply(BigInteger.valueOf(base)) : result.multiply(result); 
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("Result from Divide and Conquer:  ")
			   .append(base).append("^").append(initPower)
			   .append(" = ").append(result);
		
		System.out.println(builder.toString());
		System.out.println("Elasped Time for Divide and Conquer: " + (System.currentTimeMillis() - startUp));
	}
   
    static void getNthPowerBruteForce(int base, int power){
    	
    	long startUp = System.currentTimeMillis();
    	BigInteger result = BigInteger.valueOf(1) ;
    	
    	for (int i=0; i < power; i++) {
			
    		result = result.multiply(BigInteger.valueOf(base));	
		}
    	
    	StringBuilder builder = new StringBuilder();
		builder.append("Result from Brute Force:  ")
			   .append(base).append("^").append(power)
			   .append(" = ").append(result);
		
		System.out.println(builder.toString());
		System.out.println("Elasped Time for Brute Force: " + (System.currentTimeMillis() - startUp));
    }
    
    static int logOfBase(int base, int power){
    	return (int)(Math.log10(power)/Math.log10(base));
    }
}
