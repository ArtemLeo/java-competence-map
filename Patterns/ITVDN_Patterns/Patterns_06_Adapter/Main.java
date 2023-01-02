package Patterns.ITVDN_Patterns.Patterns_06_Adapter;

public class Main {
    public static void main(String[] args) {
        VectorAdapterFromRaster g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();
        System.out.println("----------------------------");
        VectorAdapterFromRaster2 g2 = new VectorAdapterFromRaster2();
        g2.drawLine();
        g2.drawSquare();
    }
}

interface VectorGraphicsInterface {
    void drawLine();

    void drawSquare();
}

class RasterGraphics {
    void drawRasterLine() {
        System.out.println("Draw line!");
    }

    void drawRasterSquare() {
        System.out.println("Draw square!");
    }
}

// Solution variant 1
class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}

// Solution variant 2
class VectorAdapterFromRaster2 implements VectorGraphicsInterface {
    RasterGraphics rasterGraphics = new RasterGraphics();

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}

