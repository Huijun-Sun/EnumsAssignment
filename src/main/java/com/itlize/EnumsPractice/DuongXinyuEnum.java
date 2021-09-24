package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
        Duong("Duong"), Xinyu("Xinyu");
        private String name;
        DuongXinyuEnum(String name)
        {
            this.name=name;
        }
        public boolean isDuong(){
            return this.name.equals(Duong.name);
        }
        public boolean isXinyu(){
            return this.name.equals(Xinyu.name);
        }
        public String getCatchPhrase(){
            return "Hey, my name is "+this.name+"!";
        }
}
