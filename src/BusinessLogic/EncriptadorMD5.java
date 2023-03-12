package BusinessLogic;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncriptadorMD5 {

    public static String amEncryptMD5 (String password) {
        try {
            // Obtener instancia de MessageDigest para MD5
            MessageDigest amMd = MessageDigest.getInstance("MD5");
            // Convertir la contraseña a un arreglo de bytes
            byte[] contrasenaBytes = password.getBytes();
            // Generar el hash en MD5 de la contraseña
            byte[] hash = amMd.digest(contrasenaBytes);
            // Convertir el hash a una cadena hexadecimal
            StringBuilder amSb = new StringBuilder();
            for (byte b : hash) {
                amSb.append(String.format("%02x", b));
            }
            return amSb.toString();
        } catch (NoSuchAlgorithmException e) {
            // Manejo de excepción si no se encuentra el algoritmo MD5
            e.printStackTrace();
            return null;
        }
    }
}
