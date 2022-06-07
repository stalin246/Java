import java.io.*;

public class Archivo {
public void creartxt(String nombre, String texto){
  File f;
    FileWriter escritorArchivo;
    try {

        f = new File(nombre);
        escritorArchivo = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(escritorArchivo);
        PrintWriter salida = new PrintWriter(bw);
        salida.write(texto + "\n");

        bw.close();

    }catch (IOException e) {
        System.out.println("Error:" + e.getMessage());
    }
}




}
