package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ServerTwo implements ICluster {

    private List<User> userList;

    public ServerTwo() {

        userList = new ArrayList<>();

    }

    public void showAllUsers() {

        for(User user : userList) {

            user.showInfo();

        }

    }


    @Override
    public void serveUser(User user) {

        System.out.println("Añadiendo al usuario: " + user.getUserName() + " al ServerTwo");
        userList.add(user);
        System.out.println("Usuarios totales: ");
        this.showAllUsers();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

    }
}
