/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlinerDirectory;
    
    public AirlinerDirectory() {
        airlinerDirectory = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getairlinerDirectory() {
        return airlinerDirectory;
    }

    public void setairlinerDirectory(ArrayList<Airliner> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
    
    public Airliner addAirliner() {
        Airliner a = new Airliner();
        airlinerDirectory.add(a);
        return a;
    }
    
    public void removeAirliner(Airliner a) {
        airlinerDirectory.remove(a);
    }
}
