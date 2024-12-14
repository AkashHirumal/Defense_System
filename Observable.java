/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

import java.util.ArrayList;

/**
 *
 * @author Akash
 */
class Observable {

    private ArrayList<Observer> observerList;
    private String message;
    private MainController mainController;

    Observable() {
        observerList = new ArrayList<>();
    }
    
    public void add(Observer ob) {
        observerList.add(ob);
    }
    
    
    public void addMainController(MainController mainController) {
        this.mainController=mainController;
    }
    
    public void sendMessage(String message){
        this.message=message;
        notifyObservers();
    }
    public void sendAreaClear(String respond){
        for(Observer ob : observerList){
            ob.AreaClear(respond);
        }
    }
    
    public void notifyObservers(){
        for(Observer ob : observerList){
            ob.Send(message);
        }
    }
    public void sendPosition(int value){
    for (Observer ob : observerList) {
            ob. Position(value);
        }
    }


}

