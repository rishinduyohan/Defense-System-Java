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
            defenceObserverArray[i].Message(message);
        }
    }

    @Override
    public void Message(String message) {
         if (message != "") {
            this.message = message;
            Message(message);
        }
    }

    @Override
    public void AreaClear() {
        for (int i = 0; i < nextIndex; i++) {
            defenceObserverArray[i].AreaClear();
        }
    }

    @Override
    public void AreaNotClear() {
        for (int i = 0; i < nextIndex; i++) {
            defenceObserverArray[i].AreaNotClear();
        }
    }

}
