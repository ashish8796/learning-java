package designPattern.creationalDesignPattern.factoryDesignPattern.Lecture;

import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.button.Button;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.button.IOSButton;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.dropDown.DropDown;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.dropDown.IosDropDown;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.menu.IOSMenu;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.menu.Menu;
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
