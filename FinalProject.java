/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproject;

/**
 *
 * @author Akash
 */
public class FinalProject {

    public static void main(String[] args) {
        Observable observable = new Observable();
        MainController mainController= new MainController(observable);
        observable.addMainController(mainController);
        observable.add(new Submarine(mainController));
        observable.add(new helicopter(mainController));
        observable.add(new Tank(mainController));
    }
}
