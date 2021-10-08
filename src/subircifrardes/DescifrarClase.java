/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subircifrardes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.InvalidKeyException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER01
 */
public class DescifrarClase {
    
    boolean Descifrado = true;
    
    boolean Descifrararch(SecretKey clavef, String path) throws Exception {
        try{
          
       
            Cipher cifrado = Cipher.getInstance("DES/ECB/PKCS5Padding");

            cifrado.init(Cipher.DECRYPT_MODE, clavef);

            byte[] buffer = new byte[1000]; // leer cada mil
            byte[] bufferPlano;


             FileInputStream in = new FileInputStream(path);
             FileOutputStream out = new FileOutputStream(path+".descifrado");

             int bytesleidos = in.read(buffer, 0, 1000);
 

             while(bytesleidos != -1){


                 bufferPlano = cifrado.update(buffer, 0, bytesleidos);

                 
                 out.write(bufferPlano);
                 bytesleidos = in.read(buffer, 0, 1000);
             }
             
             
             bufferPlano = cifrado.doFinal();

             out.write(bufferPlano);

             in.close();
             out.close(); 
             
        }
        
        catch(InvalidKeyException e){
            System.out.println("Error");
            JOptionPane.showMessageDialog(null,"Error\n Recuerda que la clave tiene que ser de 8 bytes");
            System.out.println(e);
            Descifrado = false;
           
        }
        
      return Descifrado;
 
    }
    
    SecretKey originalKey;
    
    public  SecretKey convertStringToSecretKeyto(String claves) {
        try{
            
            byte[] decodedKey = Base64.getDecoder().decode(claves);
            originalKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "DES");

        }
        
        catch(Exception e){
            
            originalKey = null;
            
        }
        
        return originalKey;
    }
    
    String Archivo;
    
    public String SubiraArchivo(){
      
        JFileChooser file = new JFileChooser();
      
        file.showOpenDialog(file);
        File abre = file.getSelectedFile();
      
        if(abre!= null){
             Archivo = abre.getPath();
        }
        
        System.out.println(Archivo);
        return Archivo;
    }
    
}
