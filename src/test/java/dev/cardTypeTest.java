package dev;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class cardTypeTest {

	//private cardType CardType;
	
	@Test
	public void test() {
	}
//	public void Setup(){
//		cardType CardType = new cardType();
//
//		}
	@Test
	public void getCardType(){
		cardType CardType = new cardType();
		
	Assert.assertEquals("visa", CardType.getCardType("411111111"));
	Assert.assertEquals("unknown", CardType.getCardType("11111111"));
	Assert.assertNotSame("visa", CardType.getCardType("144444444"));

	}
}
