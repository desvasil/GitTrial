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
public class Compressor {

    public Compressor(CompressionTool compressionTool) {
        this.compressionTool=compressionTool;
    }
    
    private  CompressionTool compressionTool;
    
    public void fileComp(Object file){
        compressionTool.compress(file);
    }

    public CompressionTool getCompressionTool() {
        return compressionTool;
    }
    
}
