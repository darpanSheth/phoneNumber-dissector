import java.util.Scanner;

public class phoneNumberDissector {
    public static void main(String[] args){
        String phoneNumber;
        Scanner stdIn = new Scanner(System.in);
        String countryCode, areaCode, localPhoneNumber;


        System.out.print("Enter a phone number in the form cc-area-local, " +
                "where cc = country code digits, area = area code digits,and local = local phone digits. " +
                "\nOr enter q to quit: ");
        phoneNumber = stdIn.nextLine();

        while(!phoneNumber.equalsIgnoreCase("q")) {
            if(dashesCount(phoneNumber) != 2){
                System.out.println("Please enter the number in a valid format");
            }
            else{
                countryCode = phoneNumber.substring(0, phoneNumber.indexOf("-"));
                areaCode = phoneNumber.substring(phoneNumber.indexOf("-") + 1, phoneNumber.lastIndexOf("-"));
                localPhoneNumber = phoneNumber.substring(phoneNumber.lastIndexOf("-")+1);

                System.out.println("Country code = " + countryCode + "\nArea code = " + areaCode +
                        "\nLocal phone number = " + localPhoneNumber);
            }


            System.out.println();
            System.out.print("Enter a phone number in the form cc-area-local, " +
                    "where cc = country code digits, area = area code digits,and local = local phone digits. " +
                    "\nOr enter q to quit: ");
            phoneNumber = stdIn.nextLine();
        }
    }
    public static int dashesCount(String num){
        int numberOfDashes = 0;
        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == '-'){
                numberOfDashes += 1;
            }
        }
        return numberOfDashes;
    }
}

