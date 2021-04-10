package com.example.recyclerviewviewtype;

public class ModelClass {

    public static final int TYPE_NAME = 1;
    public static final int TYPE_IMAGE = 2;

    private int type;
    private String name;
    private int image;

    public ModelClass(int type, String name, int image) {
        this.type = type;
        this.name = name;
        this.image = image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ModelClass{" +
                "name='" + name + '\'' +
                ", image=" + image +
                '}';
    }
}
