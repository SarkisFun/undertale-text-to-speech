package view;

import controller.UndertaleAppController;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class UndertaleFrame extends JFrame{
    private UndertalePanel basePanel;
    
    /**
     * Create a UndertaleFrame object passing a reference to the AppController
     * for use by the SampleFrame object
     * @param baseController 
     */
    public UndertaleFrame(UndertaleAppController baseController){
        basePanel = new UndertalePanel(baseController);
        setupFrame();
    }
    /**
     * Sets the content panel, size and makes the frame visible
     */
    private void setupFrame(){
        this.setContentPane(basePanel);
        this.setSize(500, 500);
        this.setVisible(true);
    }
}
