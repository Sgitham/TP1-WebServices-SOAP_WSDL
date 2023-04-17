import jakarta.xml.ws.Endpoint;
import ws.BanqueServive;

public class ServeurJWS {

    public static void main(String[] args) {

        Endpoint.publish("http://0.0.0.0:9999/", new BanqueServive());
        System.out.println("Web Service Déployé sur http://0.0.0.0:9999/");
    }
} 
 