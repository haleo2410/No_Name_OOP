/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitaplon1;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Nguyen Ba Duc
 */
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        Dictionary d = new Dictionary();
        d.Init();
        DictionaryCommandline dc = new DictionaryCommandline();
        //dc.dictionaryAdvanced(d);
        //dc.dictionaryAdd(d);
        dc.delete(d);
    }
}
