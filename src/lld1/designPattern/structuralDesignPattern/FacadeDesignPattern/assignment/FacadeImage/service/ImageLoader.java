package designPattern.structuralDesignPattern.FacadeDesignPattern.assignment.FacadeImage.service;

import designPattern.structuralDesignPattern.FacadeDesignPattern.assignment.FacadeImage.model.Image;

public class ImageLoader {
    public Image loadImage(String imagePath) {
        return new Image();
    }
}
