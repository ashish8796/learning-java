package designPattern.factoryDesignPattern.Lecture;

import designPattern.factoryDesignPattern.Lecture.components.button.Button;
import designPattern.factoryDesignPattern.Lecture.components.button.IOSButton;
import designPattern.factoryDesignPattern.Lecture.components.dropDown.DropDown;
import designPattern.factoryDesignPattern.Lecture.components.dropDown.IosDropDown;
import designPattern.factoryDesignPattern.Lecture.components.menu.IOSMenu;
import designPattern.factoryDesignPattern.Lecture.components.menu.Menu;
public class IosFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton () {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
