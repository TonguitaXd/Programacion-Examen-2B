package BusinessLogic;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncrypter {

    public static String amencrypt(String password) {
        try {
            // Obtener una instancia de MessageDigest con el algoritmo SHA-256
            MessageDigest amMd = MessageDigest.getInstance("SHA-256");
            
            // Convertir la contraseña en bytes y pasarla a MessageDigest para ser encriptada
            amMd.update(password.getBytes());
            
            // Obtener el hash resultante como un arreglo de bytes y convertirlo a hexadecimal
            byte[] digest = amMd.digest();
            StringBuilder amsb = new StringBuilder();
            for (byte b : digest) {
                amsb.append(String.format("%02x", b & 0xff));
            }
            return amsb.toString();
        } catch (NoSuchAlgorithmException e) {
            // Si el algoritmo SHA-256 no está disponible, lanzar una excepción
            throw new RuntimeException("encrypt", e);
        }
    }
}
