package dev;

public class cardType {
	
	public String getCardType(String cardNumber){
//		String cardType = cardNumber.indexOf("4") == 0 ? "visa" : "unknown";
//return cardType;

if(cardNumber.indexOf("4") == 0) {
	return "visa";
} else if(cardNumber.length() == 15 &&  cardNumber.indexOf("3") == 0 && cardNumber.indexOf("4") == 1 | cardNumber.indexOf("7") == 1) {
	return "amex";
	
}else {
	return "unknown";
}

		}
	
	//  public boolean isValid(String braces) {
//		     switch(braces){
//		     case "(){}[]":
//		     return true;
//		     case "([{}])":
//		     return true;
//		     case "()":
//		     return true;
//		     default:
//		     return false;
//		     }
//		     }
//	    if(braces == braces.equalsIgnoreCase("(){}[]") {
//	        return true;
//	        }
//	        else{
//	        return false;
//	        }

//}
//}

    public static boolean isSquare(int n) {
        
   boolean perfectsquare = false;//we set the default variable to be false
   
//    if(n<0){
//     return perfectsquare = false;
//     }
    for(long newN = n; newN>=0; newN--){//we declared a variable inside the loop
    //and assigned the input number to it
    // then we subracted down from the given input number
    long total = newN * newN;//We multiplied the given number times itself
    //and stored the total in a variable every time the loop was true.
    
    if(total == n){//we then compared that total number to the given input
    return perfectsquare = true; // and if that total number and given input
    //was the same, then we would return true. 
    }
  }//then we just keep the loop going until it becomes false and breaks out
    return perfectsquare;//and in that case if no number matches 
    //this will be defaulted at false otherwise it will return true if it matches.
}
    
    public static int[] minMax(int[] arr) {
    	int min = arr[0];
    	int lowest = 0;
		int highest = 0;
		int [] arrNew = null;
    for(int i = 0; i<arr.length; i++){
     if(arr[i]<=min){
      lowest = arr[i];
     }else{
      highest = arr[i];
     } 
    }return arrNew;
}

}
