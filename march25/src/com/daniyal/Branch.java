package com.daniyal;

public class Branch {
    protected int brId;
    protected String loc;

    public Branch(){
        // TODO Auto-generated constructor stub
    }

    public Branch(String loc){
        this.loc = loc;
    }
    public void setBrId(int brId) {
        this.brId = brId;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Branch Id: " + brId + " Location: " + loc;
    }

}
