package com.mclearning.learningMod.utils;

public class PositionCaculator {
    private Double posX;
    private Double posY;
    private Double posZ;
    private Double length;
    private Double rawX;
    private Double rawY;
    private Double rawZ;
    private Double yaw;
    private Double pitch;

    public PositionCaculator(Double length, Double rawX, Double rawY, Double rawZ, Float yaw, Float pitch) {
        this.length = length;
        this.pitch = pitch / 360 * 2 * Math.PI;
        this.yaw = yaw / 360 * 2 * Math.PI;
        this.rawX = rawX;
        this.rawY = rawY;
        this.rawZ = rawZ;
        this.posX = rawX - length * Math.cos(this.pitch) * Math.sin(this.yaw);
        this.posY = rawY - length * Math.sin(this.pitch);
        this.posZ = rawZ + length * Math.cos(this.pitch) * Math.cos(this.yaw);
    }

    public void setLength(Double length) {
        this.length = length;
        this.posX = rawX - length * Math.cos(pitch) * Math.sin(yaw);
        this.posY = rawY - length * Math.sin(pitch);
        this.posZ = rawZ + length * Math.cos(pitch) * Math.cos(yaw);
    }

    public void setRawX(Double rawX) {
        this.rawX = rawX;
        this.posX = rawX - length * Math.cos(pitch) * Math.sin(yaw);

    }

    public void setRawY(Double rawY) {
        this.rawY = rawY;
        this.posY = rawY - length * Math.sin(pitch);
    }

    public void setRawZ(Double rawZ) {
        this.rawZ = rawZ;
        this.posZ = rawZ + length * Math.cos(pitch) * Math.cos(yaw);
    }

    public void setYaw(Float yaw) {
        this.yaw = yaw / 360 * 2 * Math.PI;
        this.posX = rawX - length * Math.cos(pitch) * Math.sin(this.yaw);
        this.posZ = rawZ + length * Math.cos(pitch) * Math.cos(this.yaw);
    }

    public void setPitch(Float pitch) {
        this.pitch = pitch / 360 * 2 * Math.PI;
        this.posX = rawX - length * Math.cos(this.pitch) * Math.sin(yaw);
        this.posY = rawY - length * Math.sin(this.pitch);
        this.posZ = rawZ + length * Math.cos(this.pitch) * Math.cos(yaw);
    }

    public Double getPosX() {
        return posX;
    }

    public Double getPosY() {
        return posY;
    }

    public Double getPosZ() {
        return posZ;
    }
}
