/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicfile;

/**
 *
 * @author abdul
 */
public class TestBasicFile {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BasicFile basic = new BasicFile();
        basic.selectFile();
        //basic.copyFile();
        basic.appendFile();
    }
}
