package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ServerOne implements ICluster {

    private List<User> userList;

    public ServerOne() {

        userList = new ArrayList<>();

    }

    public void showAllUsers() {

        for(User user : userList) {

            user.showInfo();

        }

    }


    @Override
    public void serveUser(User user) {

        System.out.println("Añadiendo al usuario: " + user.getUserName());
        userList.add(user);

    }
}
