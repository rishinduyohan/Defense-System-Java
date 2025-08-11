/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds.observer;

import ds.controll.Controller;

/**
 *
 * @author acer
 */
public class DefenceObserver implements Controller {

    private Controller[] defenceObserverArray = new Controller[100];
    private int nextIndex;
    private String message;

    public void addDefenceObserver(Controller obj) {
        defenceObserverArray[nextIndex++] = obj;
    }

    public void setMessage(String message) {
        for (int i = 0; i < nextIndex; i++) {
            defenceObserverArray[i].message(message);
        }
    }

    @Override
    public void message(String message) {
         if (message != "") {
            this.message = message;
            message(message);
        }
    }

    @Override
    public void areaClear() {
        for (int i = 0; i < nextIndex; i++) {
            defenceObserverArray[i].areaClear();
        }
    }

    @Override
    public void areaNotClear() {
        for (int i = 0; i < nextIndex; i++) {
            defenceObserverArray[i].areaNotClear();
        }
    }

    @Override
    public void mainFormMessage(String message) {
        for (int i = 0; i < nextIndex; i++) {
            defenceObserverArray[i].mainFormMessage(message);
        }
    }

    @Override
    public void buttonMessage(String message) {
        for (int i = 0; i < nextIndex; i++) {
            defenceObserverArray[i].buttonMessage(message);
        }
    }

}
