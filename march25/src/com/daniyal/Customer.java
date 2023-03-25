package com.daniyal;

public class Customer {
    private int cid;
    private String cName;
    private String eMail;

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {

        // TODO Auto-generated method stub

        return "Customer Id: " + cid + " Customer Name: " + cName + "\nemail ID:" + eMail;

    }
}