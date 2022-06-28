package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ServerProxy implements ICluster {

    private ServerOne serverOne;
    private ServerTwo serverTwo;

    public ServerProxy() {
        this.serverOne = new ServerOne();
        this.serverTwo = new ServerTwo();
    }

    @Override
    public void serveUser(User user) {

        System.out.println("Empezando autenticación de usuario...");

        if(!user.getUserName().isEmpty()) {

            if(user.getPwd().length() > 8 && !user.getPwd().isEmpty()) {

                if(user.getId() % 2 != 0) {

                    serverOne.serveUser(user);

                } else {

                    serverTwo.serveUser(user);

                }

            } else {

                System.out.println("ERROR! La contraseña es demasiado debil!");

            }



        } else {

            System.out.println("ERROR! El nombre de usuario no es valido");

        }

    }
}
