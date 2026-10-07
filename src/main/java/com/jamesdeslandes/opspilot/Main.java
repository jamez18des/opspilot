package com.jamesdeslandes.opspilot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String serviceName = "Payment API";
        String status = "HEALTHY";

        double cpuUsage = 34.7;
        double memoryUsage = 62.1;

        boolean running = true;

        int instanceCount = 3;

        System.out.println("Service: " + serviceName);
        System.out.println("Status: " + status);
        System.out.println("CPU Usage: " + cpuUsage);
        System.out.println("Memory: " + memoryUsage);
        System.out.println("Is it running: " + running);
        System.out.println("Instance count: " + instanceCount);

    }
}

