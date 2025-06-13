import java.util.Scanner;

public class ATMCardValidator{

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter card details to be verified: ");
String atmCardNumber = scanner.nextLine();

String result = validateCard(atmCardNumber);
System.out.println(result);

}

public static String validateCard(String atmCardNumber){
	
String cardType = getCardType(atmCardNumber);

if (cardType.equals("Invalid")) {
	return "Invalid card type";
}
 boolean isValid = cardCheck(atmCardNumber);

if (isValid) {
	return "valid" + cardType + "card";
} else {
	return "Valid " + cardType + " card";
	}
}

public static String getCardType(String atmCardNumber) {
int cardLength = atmCardNumber.length();

if(cardLength == 16 && atmCardNumber.startsWith("4")) {
	return "Visa";
} else 
if(cardLength == 16 && atmCardNumber.startsWith("5")) {
	return "MasterCard";
}else 
if(cardLength == 16 && atmCardNumber.startsWith("6")) {
	return "Discover";
}else 
if(cardLength == 15 && atmCardNumber.startsWith("37")) {
	return "American Express";
}else{	
        return "Invalid";
	}
}

public static boolean cardCheck(String atmCardNumber) {
int total = 0;
boolean doubleDigit = false;

for (int index = atmCardNumber.length() - 1; index >= 0; index--) {
	char ch = atmCardNumber.charAt(index);

if (!Character.isDigit(ch)) {
	return false;
}

int digit = Character.getNumericValue(ch);
if (doubleDigit) {
digit *= 2;
if (digit > 9) {
digit -= 9;
	}
}
total += digit;
doubleDigit = !doubleDigit;
}

	return total % 10 == 0;
}
}