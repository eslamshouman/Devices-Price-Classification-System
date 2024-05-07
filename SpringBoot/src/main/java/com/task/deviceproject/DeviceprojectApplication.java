package com.task.deviceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeviceprojectApplication {

	public static void main(String[] args) {
        SpringApplication.run(DeviceprojectApplication.class, args);
    }


}



@RestController
class DeviceController {

    private final DeviceClassificationService deviceService;

    public DeviceController(DeviceClassificationService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping("/classify")
    public String classifyDevice(@RequestBody DeviceFeatures features) {
        return deviceService.classifyDevice(features);
    }
}

@Service
class DeviceClassificationService {

    private final MachineLearningModel model;

    public DeviceClassificationService(MachineLearningModel model) {
        this.model = model;
    }

    public String classifyDevice(DeviceFeatures features) {
        String prediction = model.predict(features);
        return "Predicted category: " + prediction;
    }
}

@Component
class MachineLearningModel {

    // You can load your trained model here and define a method to make predictions
    public String predict(DeviceFeatures features) {
        // Make prediction using the loaded model
        // Replace this with your actual prediction logic
        return "High Price"; // Example prediction
    }
}

// Define model class to represent mobile device features
class DeviceFeatures {
    private int batteryPower;
    private boolean bluetooth;
    private boolean dualSim;
    private double fc;
    private boolean fourG;
    private int intMemory;
    private double mDep;
    private int mobileWt;
    private int nCores;
    private double pc;
    private int pxHeight;
    private int pxWidth;
    private int ram;
    private int scH;
    private int scW;
    private int talkTime;
    private boolean threeG;
    private boolean touchScreen;
    private boolean wifi;

    // Getters and setters
    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

   

    public boolean isDualSim() {
        return dualSim;
    }

    public void setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
    }

    public double getFc() {
        return fc;
    }

    public void setFc(double fc) {
        this.fc = fc;
    }

    public boolean isFourG() {
        return fourG;
    }

    public void setFourG(boolean fourG) {
        this.fourG = fourG;
    }

    public int getIntMemory() {
        return intMemory;
    }

    public void setIntMemory(int intMemory) {
        this.intMemory = intMemory;
    }

    public double getmDep() {
        return mDep;
    }

    public void setmDep(double mDep) {
        this.mDep = mDep;
    }

    public int getMobileWt() {
        return mobileWt;
    }

    public void setMobileWt(int mobileWt) {
        this.mobileWt = mobileWt;
    }

    public int getnCores() {
        return nCores;
    }

    public void setnCores(int nCores) {
        this.nCores = nCores;
    }

    public double getPc() {
        return pc;
    }

    public void setPc(double pc) {
        this.pc = pc;
    }

    public int getPxHeight() {
        return pxHeight;
    }

    public void setPxHeight(int pxHeight) {
        this.pxHeight = pxHeight;
    }

    public int getPxWidth() {
        return pxWidth;
    }

    public void setPxWidth(int pxWidth) {
        this.pxWidth = pxWidth;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getScH() {
        return scH;
    }

    public void setScH(int scH) {
        this.scH = scH;
    }

    public int getScW() {
        return scW;
    }

    public void setScW(int scW) {
        this.scW = scW;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public boolean isThreeG() {
        return threeG;
    }

    public void setThreeG(boolean threeG) {
        this.threeG = threeG;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
