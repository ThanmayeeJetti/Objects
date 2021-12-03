package com.tw;
public class Compare {
    private  int value;
    public Compare(int value){
        this.value = value;
    }

    public boolean compareValues(Compare firstObj,Compare secondObj){
        return firstObj.value== secondObj.value;
    }

}
