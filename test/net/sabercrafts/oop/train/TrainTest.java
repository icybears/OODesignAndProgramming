package net.sabercrafts.oop.train;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/***************************

The aim of this exercise is to design and write a code to pass all tests.

A train is made of different types of wagons: head, passenger, restaurant, and cargo.
Each type has its specific representation:
- Head :      <HHHH if its the last wagon
              HHHH> if it is the first wagon
- Passenger  : |OOOO|
- Restaurant : |hThT|
- A cargo wagon can be either empty or loaded
        - If empty : its represented as |____| 
        - If loaded: its represented as |^^^^| 

The wagons are connected by "::"

****************************/

class TrainTest {
	 @Test
	    public void passengerTrain() {
	        Train train = new Train("HPP");
	        assertEquals("<HHHH::|OOOO|::|OOOO|", train.print());
	    }

	    @Test
	    public void restaurantTrain() {
	        Train train = new Train("HPRP");
	        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|", train.print());
	    }

	    @Test
	    public void doubleHeadedTrain() {
	        Train train = new Train("HPRPH");
	        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|::HHHH>", train.print());
	        
	    }

	    @Test
	    public void modifyTrain() {
	        Train train = new Train("HPRPH");
	        train.detachEnd();
	        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|", train.print());
	        train.detachHead();
	        assertEquals("|OOOO|::|hThT|::|OOOO|", train.print());
	    }

	    @Test
	    public void cargoTrain() {
	        Train train = new Train("HCCC");
	        assertEquals("<HHHH::|____|::|____|::|____|", train.print());
	        train.fill();
	        assertEquals("<HHHH::|^^^^|::|____|::|____|", train.print());
	         train.fill();
	         assertEquals("<HHHH::|^^^^|::|^^^^|::|____|", train.print());
	        train.fill();
	        assertEquals("<HHHH::|^^^^|::|^^^^|::|^^^^|", train.print());
	        assertFalse(train.fill());
	    }

	    
	    @Test
	    public void mixedTrain() {
	        Train train = new Train("HPCPC");
	        assertEquals("<HHHH::|OOOO|::|____|::|OOOO|::|____|", train.print());
	        train.fill();
	        assertEquals("<HHHH::|OOOO|::|^^^^|::|OOOO|::|____|", train.print());
	        train.fill();
	        assertEquals("<HHHH::|OOOO|::|^^^^|::|OOOO|::|^^^^|", train.print());
	        assertFalse(train.fill());
	    }

}
