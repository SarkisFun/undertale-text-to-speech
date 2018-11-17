/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.MVCFactory;
import view.UndertaleFrame;

/**
 *
 * @author Usuario
 */
public class UndertaleAppController {
    private UndertaleFrame appFrame;
    private MVCFactory appFactory;
    
    public MVCFactory getAppFactory() {
    	return appFactory;
    }
    
    public UndertaleAppController() {
    	appFactory = new MVCFactory();
    }
    
    public void start(){
        appFrame = new UndertaleFrame(this);
    }
}
