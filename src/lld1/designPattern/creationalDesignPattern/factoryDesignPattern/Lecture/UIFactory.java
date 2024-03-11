package designPattern.creationalDesignPattern.factoryDesignPattern.Lecture;

import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.button.Button;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.dropDown.DropDown;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();
}
