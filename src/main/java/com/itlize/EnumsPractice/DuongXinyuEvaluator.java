package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    private String name;
    DuongXinyuEvaluator(String input) {
        this.name=input;
    }
    public boolean isDuong(){
        return this.name.equals("Duong");
        //return this.name.equals(DuongXinyuEnum.Duong.name());
    }
    public boolean isXinyu(){
        return this.name.equals(DuongXinyuEnum.Xinyu.name());
    }
}
