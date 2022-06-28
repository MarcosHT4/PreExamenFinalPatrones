package ejercicio4;

public class Client {

    public static void main(String[] args) {

        User user1 = new User(34, "Dalas435", "holamuybuenasatodos");
        User user2 = new User(91, "Paco53", "samataopaco");
        User user3 = new User(32, "", "");
        User user4 = new User(41, "Shur", "hola");

        ServerProxy serverProxy = new ServerProxy();

        serverProxy.serveUser(user1);
        serverProxy.serveUser(user2);
        serverProxy.serveUser(user3);
        serverProxy.serveUser(user4);


    }

}
