/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns_execise4_strategy;

/**
 *
 * @author Despoina
 */
public class DesignPatterns_execise4_Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
 /*Just playing with Git!!!!*/
 
 
        CompressionTool ct1=new ZipCompression(); 
        Compressor compressor=new Compressor(ct1);
        compressor.fileComp(ct1);
        CompressionTool ct2=new RarCompression();
        Compressor compressor2=new Compressor(ct2);
        compressor2.fileComp(ct2);
    }
    
}
