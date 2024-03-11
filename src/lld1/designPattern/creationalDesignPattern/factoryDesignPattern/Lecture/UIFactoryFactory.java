package designPattern.creationalDesignPattern.factoryDesignPattern.Lecture;

public class UIFactoryFactory{
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform) {
        switch (supportedPlatform) {
            case ANDROID : return new AndroidFactory();
            case IOS: return new IosFactory();
            case MAC: return new MacFactory();
        }

        return null;
    }
}
