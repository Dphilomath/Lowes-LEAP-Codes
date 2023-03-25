package com.daniyal;

public class Customer {
    private int cid;
    private String cName;
    private String eMail;

    public Customer() {
        // TODO Auto-generated constructor stub
    }


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

        return "Cust Id: " + cid + " cName: " + cName + " eMAIL.." + eMail;

    }
}