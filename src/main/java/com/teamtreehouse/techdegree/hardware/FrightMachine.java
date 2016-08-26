package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.example.motion.MotionDetector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrightMachine extends MotionDetector {

    private final List<Accessory> accessories = new ArrayList<>();

    public FrightMachine() {
        Arrays.asList(new Accessory[] {
                new Horn(),
                new Strobe(),
                new CameraAdapter(new Camera())})
            .forEach(a -> addAccessory(a));
    }

    public boolean addAccessory(Accessory accessory) {
        return accessories.add(accessory);
    }

    public boolean removeAccessory(Accessory accessory) {
        return accessories.remove(accessory);
    }

    @Override
    public void onMotionDetected() {
        // TODO: This is hardcoded, we should make it more extensible!  :(
        accessories.forEach( a -> a.activate());
    }
}
