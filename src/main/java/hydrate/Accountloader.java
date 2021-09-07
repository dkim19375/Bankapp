package hydrate;

import java.io.FileWriter;
import java.io.IOException;

public class Accountloader {
    public static void main(String[] args) {


        try ( FileWriter writer = new FileWriter("Accounts.txt")){
            writer.write("ur mum");
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
