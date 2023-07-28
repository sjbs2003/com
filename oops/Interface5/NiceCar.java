package com.oops.Interface5;

public class NiceCar {
    private Engine engine;
    private Media player = new Radio();

    public NiceCar(){
        engine = new SuperChargedEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void UpgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
