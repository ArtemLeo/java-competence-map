package Patterns.ITVDN_Patterns.Patterns_10_Proxy;

public class Main {
    public static void main(String[] args) {
        Image imageReal = new RealImage("my image.jpg");
        imageReal.display();
        System.out.println("---------------");

        Image imageProxy = new ProxyImage("my image.jpg");
        imageProxy.display();
    }
}

interface Image {
    void display();
}

class RealImage implements Image {
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Load " + file);
    }

    public void display() {
        System.out.println("Display " + file);
    }
}

class ProxyImage implements Image {
    String file;
    RealImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(file);
        }
        image.display();
    }
}
