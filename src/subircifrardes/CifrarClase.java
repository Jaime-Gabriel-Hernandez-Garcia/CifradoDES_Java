/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subircifrardes;

/**
 *
 * @author ACER01
 * 
 */


import java.awt.Desktop;
import javax.crypto.*;
import javax.crypto.spec.*;
//genera llaves 


import java.security.*;
//todos los tipos de algortmo cifrado


import java.io.*;
import java.util.Base64;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class CifrarClase {
    
    String clavef = "";
    
    public SecretKey llave()throws Exception {

          KeyGenerator generadorDES = KeyGenerator.getInstance("DES");

          generadorDES.init(56);

          SecretKey clave = generadorDES.generateKey();

         return clave;
        }
    
    
    
        String archivo= "";
       public String SubirArchivo(){

           JFileChooser file = new JFileChooser();
           FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
           file.setFileFilter (filter);
           file.showOpenDialog(file);
           File abre = file.getSelectedFile();

           if(abre!= null){
               archivo = abre.getPath();
           }
           System.out.println(archivo);
          return archivo;
        }
       
       

        boolean  Cifrado = true;
        
        boolean CifrarArch(SecretKey clavef, String path) throws Exception {
            
            try{

                Cipher cifrado = Cipher.getInstance("DES/ECB/PKCS5Padding");

                cifrado.init(Cipher.ENCRYPT_MODE, clavef);

                byte[] buffer = new byte[1000]; // leer cada mil
                   byte[] bufferCifrado;


                   // generar mis archivos

                   FileInputStream in = new FileInputStream(path);
                   FileOutputStream out = new FileOutputStream(path+".cifrado");

                   //lectura

                   int bytesleidos = in.read(buffer, 0, 1000);
                   // mientras no este al final del archivo

                   while(bytesleidos != -1){
                       //pasar el texto claro leido al cifrador

                       bufferCifrado = cifrado.update(buffer, 0, bytesleidos);
                       //generar la salida
                       out.write(bufferCifrado);
                       bytesleidos = in.read(buffer, 0, 1000);
            }
           
            // vamos a reunir todos los bloques del cifrado
           bufferCifrado = cifrado.doFinal();
           // ya puedo escribir el archivo cifrado

           out.write(bufferCifrado);

           in.close();
           out.close();

            }catch(InvalidKeyException e){
                System.out.println("Error");
                JOptionPane.showMessageDialog(null,"Error\n Recuerda que la clave tiene que ser de 8 bytes");
                System.out.println(e);
                Cifrado = false;

            }
            return Cifrado;


    }
        
      public String convertSecretKeyToString(SecretKey claveBits) throws NoSuchAlgorithmException {
      byte[] rawData = claveBits.getEncoded();
      String encodedKey = Base64.getEncoder().encodeToString(rawData);
      return encodedKey;
      
     }
      
      
      SecretKey originalKey;
      
      public  SecretKey convertStringToSecretKeyto(String claveTexto) {
      try{
          byte[] decodedKey = Base64.getDecoder().decode(claveTexto);

       originalKey= new SecretKeySpec(decodedKey, 0, decodedKey.length, "DES");

      }catch (Exception e){
        originalKey = null;  
      }
     return originalKey; 
    }
    
}
