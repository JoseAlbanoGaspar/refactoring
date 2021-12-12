package pt.up.fe.ldts.example4;

public class Client extends Worker {

    public Client(String name, String phone) {
        super(name, phone, null, null);
    }
    @Override
    public boolean hasLogin(){return false;}
}
    /* NOTA:
        Code Smell - Client não é um tipo de trabalhador pelo que não precisa de ter um login, apenas nome e phone.
        Introducing null Object
     */

