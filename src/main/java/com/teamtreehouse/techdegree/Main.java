package com.teamtreehouse.techdegree;

import com.example.accessory.Accessory;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.teamtreehouse.techdegree.hardware.Camera;
import com.teamtreehouse.techdegree.hardware.CameraAdapter;
import com.teamtreehouse.techdegree.hardware.FrightMachine;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FrightMachine machine = new FrightMachine();
        Arrays.asList(new Accessory[] {
                new Horn(),
                new Strobe(),
                new CameraAdapter(new Camera())
        }).forEach(machine::addAccessory);
        machine.simulateMotion();
    }
}
