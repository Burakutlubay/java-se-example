package com.workingwithclass;

import com.workingwithclass.CustomerManager;

public class WhatIsClass {
    public static void main(String[] args) {

         CustomerManager customerManager = new CustomerManager();
         CustomerManager customerManager2 = new CustomerManager();
         customerManager.Add();
         customerManager.Remove();
         customerManager.Update();
    }

}
