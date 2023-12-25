package uz.gita.tarixiyshaxarlar.model;

import android.os.Build;

import java.io.Serializable;

public class Model implements Serializable {
    private String app_bar;
    private int desc1,desc2;
    private int image1,image2,image3;

    private Model(){

    }


    public static class Builder {
        private Model model;

        public Builder(){
            model = new Model();
        }

        public Builder setApp_bar(String app_bar) {
            model.app_bar = app_bar;
            return this;
        }

        public Builder setDesc1(int desc1) {
            model.desc1 = desc1;
            return this;
        }

        public Builder setDesc2(int desc2) {
            model.desc2 = desc2;
            return this;
        }

        public Builder setImage1(int image1) {
            model.image1 = image1;
            return this;
        }

        public Builder setImage2(int image2) {
            model.image2 = image2;
            return this;
        }

        public Builder setImage3(int image3) {
            model.image3 = image3;
            return this;
        }

        public Model build(){
            return model;
        }

    }


    public String getApp_bar() {
        return app_bar;
    }

    public int getDesc1() {
        return desc1;
    }

    public int getDesc2() {
        return desc2;
    }

    public int getImage1() {
        return image1;
    }

    public int getImage2() {
        return image2;
    }

    public int getImage3() {
        return image3;
    }
}
