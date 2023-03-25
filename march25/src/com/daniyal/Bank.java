package com.daniyal;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bank {
    private int bid;
    private String bName;
    private Map<Branch, Customer> details;

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setDetails(Map<Branch, Customer> details) {
        this.details = details;
    }

    public void disp() {
        System.out.println("Bank Id: " + bid);
        System.out.println("Bank Name: " + bName);
        Set<Entry<Branch, Customer>> s = details.entrySet();
        Iterator<Entry<Branch, Customer>> i = s.iterator();
        while (i.hasNext()) {
            Entry<Branch, Customer> e = i.next();
            Branch b = e.getKey();
            Customer c = e.getValue();
            System.out.println("\n\tBranch Details: ");
            System.out.println(b);
            System.out.println("\n\tBelongs to: ");
            System.out.println(c);
        }
    }
}