package hydrate;

import java.io.FileWriter;
import java.io.IOException;

public class AccountLoader {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Accounts.txt")) {
            //todo fill me !!!
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
