/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package betonkey;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author tamara
 */
public class copiarCh {

    private final String os;
    private String url, urlBridge;
    //File win732 = new File("C:\\Program Files\\Computers and Structures\\SAP2000 17");
    File win764 = new File("C:\\Program Files\\Computers and Structures\\SAP2000 18");
    //File winxp = new File("C:\\Arquivos de programas\\Computers and Structures\\SAP2000 17");

    public copiarCh() {
        os = verificarOS();

        if (os.equals("win764")) {
            System.out.println("Rodando em Windows 7");
            url = "C:\\Program Files\\Computers and Structures\\SAP2000 18";
            urlBridge = "C:\\Program Files\\Computers and Structures\\CsiBridge 2016";
        }/* else if (os.equals("win764")) {
         System.out.println("Rodando em Windows 7 64");
         url = "C:\\Program Files (x86)\\Computers and Structures\\SAP2000 17";
         urlBridge = "C:\\Program Files (x86)\\Computers and Structures\\CsiBridge 2015";
         } else if (os.equals("winxp")) {
         System.out.println("Rodando em Windows XP");
         url = "C:\\Arquivos de programas\\Computers and Structures\\SAP2000 17";
         urlBridge = "C:\\Arquivos de programas\\Computers and Structures\\CsiBridge 2015";
         }*/

    }

    private String verificarOS() {

        /*if (win732.isDirectory()) {
         System.out.println("Encontrei Windows 7 32 Bits");
         return "win732";
         } else*/ if (win764.isDirectory()) {
            System.out.println("Encontrei em Windows 7 64 Bits");
            return "win764";
        } /*else if (winxp.isDirectory()) {
         System.out.println("Encontrei em Windows XP");
         return "winxp";
         } */ else {
            System.out.println("Sistema nao identificado");
            return "nenhum";
        }
    }

    public String copiarChave(String chave) {
        System.out.println("Metodo copiarChave");

        try {
            System.out.println("Trabalhando com: " + url + "\\lservrc");

            File filein = new File("lservrc" + chave);
            File fileout = new File(url + "\\lservrc");

            FileReader in = new FileReader(filein);
            FileWriter out = new FileWriter(fileout);
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
            System.out.println("Copia realizada com sucesso!");
            return "Chave " + chave + " copiada com sucesso!";
            // return true;
        } catch (IOException ex) {
            System.out.println("Erro ao copiar chave -- IO Exception -- : " + ex.getMessage());
            return "Erro ao copiar chave " + chave + " : " + ex.getMessage();
            //return false;
        }
    }

    public boolean bkpChave() {
        System.out.println("Metodo bkpChave");

        File fAnt = new File(url + "\\lservrc");
        File fBkp = new File(url + "\\lservrc_bkp");

        System.out.println("Trabalhando com : " + fAnt + " para " + fBkp);

        if (!fAnt.exists()) {
            System.out.println("Nao encontrei o arquivo para fazer backup!");
            return true;
        } else {
            try {
                System.out.println("Arquivo encontrado realizando backup!");
                FileReader Ant = new FileReader(fAnt);
                FileWriter Bkp = new FileWriter(fBkp);

                int c;

                while ((c = Ant.read()) != -1) {
                    Bkp.write(c);
                }

                System.out.println("Fechando arquivos ANT + BKP");
                Ant.close();
                Bkp.close();

                return true;
            } catch (IOException ex) {
                System.out.println("Erro realizando backup -- IOException -- : " + ex.getMessage());
                return false;
            }
        }
    }

    String copiarChaveBridge(String chave) {

        System.out.println("Metodo copiarChave");

        try {
            System.out.println("Trabalhando com: " + urlBridge + "\\lservrc");

            File filein = new File("lservrc" + chave);
            File fileout = new File(urlBridge + "\\lservrc");

            FileReader in = new FileReader(filein);
            FileWriter out = new FileWriter(fileout);
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
            System.out.println("Copia realizada com sucesso!");
            return "Chave Bridge copiada com sucesso!";
            //return true;
        } catch (IOException ex) {
            System.out.println("Erro ao copiar chave -- IO Exception -- : " + ex.getMessage());
            return "Erro ao copiar chave Bridge: " + ex.getMessage() ;
            //return false;
        }

    }

    boolean bkpChaveBridge() {
        System.out.println("Metodo bkpChave");

        File fAnt = new File(urlBridge + "\\lservrc");
        File fBkp = new File(urlBridge + "\\lservrc_bkp");

        System.out.println("Trabalhando com : " + fAnt + " para " + fBkp);
        if (!fAnt.exists()) {
            System.out.println("Nao encontrei o arquivo!");
            return false;
        } else {
            try {
                System.out.println("Arquivo encontrado realizando backup!");
                FileReader Ant = new FileReader(fAnt);
                FileWriter Bkp = new FileWriter(fBkp);

                int c;

                while ((c = Ant.read()) != -1) {
                    Bkp.write(c);
                }

                System.out.println("Fechando arquivos ANT + BKP");
                Ant.close();
                Bkp.close();

                return true;
            } catch (IOException ex) {
                System.out.println("Erro realizando backup -- IOException -- : " + ex.getMessage());
                return false;
            }
        }
    }
}
