package User;
import com.example.busolympic.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Register {
    public String username , email , cardNumber , password;
    public Register(){
    }
    public Register(String username, String email, String cardNumber, String password) {
        this.username = username;
        this.email = email;
        this.cardNumber = cardNumber;
        this.password = password;
        try {
            Scanner input = new Scanner(new File("user.txt"));
            while (input.hasNext()){
                String a = input.nextLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
