import java.io.*;

public class ListerRepertoire {

    public static void main(String[] args) {
        File repertoire = new File[args[0]];
        String[] liste = repertoire.list();

        if (liste!= null) {
            for (int i = 0; i < liste.length; i++) {
                System.out.println(liste[i]);
            }
        } else {
            System.err.println("Nom de répertoire invalide"");
        }
    }
}   