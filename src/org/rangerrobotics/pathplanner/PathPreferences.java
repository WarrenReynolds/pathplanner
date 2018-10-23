package org.rangerrobotics.pathplanner;

public class PathPreferences {
    public double maxVel = 8;
    public double maxAcc = 5;
    public double maxDcc = 5;
    public double wheelbaseWidth = 2;
    public double robotLength = 3;
    public double timeStep = 0.01;
    public String outputValue1 = "Position";
    public String outputValue2 = "Velocity";
    public String outputValue3 = "Acceleration";
    public String outputFormat = "CSV File";
    public String lastGenerateDir = "none";
    public String lastPathDir = "none";
    public String currentPathName = "path";
}