interface Calculatable {
    public void calcArea(int length, int width);
    public void calcPerimeter(int length, int width);
}

class Rectangle implements Calculatable {
    private double area, perimeter;

    public void calcArea(int l, int w) {
        area = l*w;
    }

    public void calcPerimeter(int l, int w) {
        perimeter = (l+w)*2;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}