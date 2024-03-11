package designPattern.factoryDesignPattern.Lecture;

import designPattern.factoryDesignPattern.Lecture.components.button.Button;
import designPattern.factoryDesignPattern.Lecture.components.dropDown.DropDown;
import designPattern.factoryDesignPattern.Lecture.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();
}
