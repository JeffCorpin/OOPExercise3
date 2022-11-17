/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Rocket {
    private String color;
    private RocketEngine engine;
    private Door door;
    
    public Rocket (String color){
        this.color = color;
        engine = new RocketEngine();
        door = new Door();
    }
    public void setColor(String color){
        this.color = color;
    }
    public String start() {
        return engine.startRocketEngine();
    }
    
}
