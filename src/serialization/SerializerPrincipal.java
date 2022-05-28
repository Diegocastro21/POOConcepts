package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializerPrincipal {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User usuario = new User();

        usuario.name = "UnOjo";
        usuario.password = "I<3Pussy";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(usuario);
        out.close();
        fileOut.close();

        System.out.println("Object info saved! :)");
    }

}
