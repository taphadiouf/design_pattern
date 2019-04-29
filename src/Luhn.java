public class Luhn {
    public Luhn() {
    }

    public boolean validateCreditCardNumber(String number) {

        int[] ints = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            ints[i] = Integer.parseInt(number.substring(i, i + 1));
        }
        for (int i = ints.length - 2; i >= 0; i = i - 2) {
            int j = ints[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        if (sum % 10 == 0) {
            return true;
            //System.out.println(number + " is a valid credit card number");
        } else {
            return false;
            //System.out.println(number + " is an invalid credit card number");
        }
    }
}
