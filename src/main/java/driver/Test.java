package driver;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test
{

    public static void main(String[] args) {
        //create user in main method no need to take as input
        User user1 = new User("u1","najmus","najmus@gmail.com","6201499999");
        User user2 = new User("u2","nj","nj@gmail.com","6201488888");
        User user3 = new User("u3","seemab","seemab@gmail.com","6201477777");

        Scanner scanner = new Scanner(System.in);
        String userId = scanner.nextLine();
        double amount = scanner.nextDouble();
        int num = scanner.nextInt();
        List<String> listOfUserId = new ArrayList<>();

        for(int i = 0; i < num; i++)
        {
            String user = scanner.nextLine();
            listOfUserId.add(user);
            System.out.println("hello");
        }
    }
}
