import proxy.BanqueServive;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {

    public static void main(String[] args) {
        // programmation orientée objet distribué
        // creation de middleware
        BanqueServive stub = new BanqueWS().getBanqueServivePort();
        System.out.println(stub.convert(7600));
        Compte cp = stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        // dateCreation est trascient

        /*
        *
        * List<Compte> comptes = stub.listComptes();
          comptes.forEach(compte  -> {
          System.out.println(compte.getCode());
          System.out.println(compte.getSolde());

        * */


    }
}
