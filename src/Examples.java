/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Examples {
    public static void main(String[] args) {
        // P.rototyping & P.rint
        P.rototyping = true;
        P.rint("This will always print.");
        
        // P.ermitted
        P.rint("This won't print, unless we allow Examples.test to print", "Examples.test");
        P.ermitted.put("Examples.test", Boolean.TRUE);
        P.rint("This will print!", "Examples.test");
        P.rint("This wont print!", "Examples.test2");
        P.ermitted.put("Examples.test", Boolean.FALSE);
        P.rint("And this wont either", "Examples.test");

        P.rototyping = false;
        P.rint("Nothing down here will print.");
        P.rint("Whatup!", "Examples.test");
        P.rint("Nope!", "Examples.test2");
        
        // P.ermitAll & P.rohibitAll
        P.rototyping = true;
        P.ermitAll(new String[]{"Examples.test1",  "Examples.test2", 
                                "Examples.test3", "Examples.status"});
        
        P.rint("Starting...", "Examples.status");
        P.rint("One billion cookies.", "Examples.test1");
        P.rint("Two trillion cookies.", "Examples.test2");
        P.rint("Three quadrillion cookies.", "Examples.test3");
        P.rint("Heavenly chips!", "Examples.test4");
        
        P.rint("Testing ended. Here we go again!", "Examples.status");
        
        P.rohibitAll(new String[]{"Examples.test1",  "Examples.test2", 
                                "Examples.test3"});
        
        P.ermitted.put("Examples.test4", Boolean.TRUE);
        
        P.rint("Starting...", "Examples.status");
        P.rint("One billion cookies.", "Examples.test1");
        P.rint("Two trillion cookies.", "Examples.test2");
        P.rint("Three quadrillion cookies.", "Examples.test3");
        P.rint("Heavenly chips!", "Examples.test4");


    }
}
