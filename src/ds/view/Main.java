/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ds.view;

import ds.observer.DefenceObserver;

/**
 *
 * @author acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        DefenceObserver dfo = new DefenceObserver();
        dfo.addDefenceObserver(new MainForm(dfo));
        dfo.addDefenceObserver(new HelicopterForm(dfo));
        dfo.addDefenceObserver(new SubmarineForm(dfo));
        dfo.addDefenceObserver(new TankForm(dfo));
    }
}
