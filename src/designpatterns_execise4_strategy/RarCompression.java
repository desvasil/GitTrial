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
public class RarCompression implements CompressionTool {

    @Override
    public void compress(Object rar) {
            System.out.println("The file was compressed into rar");
    }
    
}
