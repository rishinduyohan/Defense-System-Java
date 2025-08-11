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
public class DefenceObserver implements Controller{
    private DefenceObserver[] defenceObserverArray = new DefenceObserver[100];
    private int nextIndex;
    private String message;
}
