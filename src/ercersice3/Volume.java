package ercersice3;

public class Volume {

    public static double Volumecalculate(float l, float b,float h) {
        return l * b * h;
    }
    public static double Volumecalculate(float r, float h) {
        return Math.PI * r * r * h;
    }
    public static double Volumecalculate(float side) {
        return side * side * side;
    }
    public static void main(String[] args)
    {
        double volumeofprism = Volumecalculate(3, 7, 5);
        System.out.printf("Volume of prism: %.2f\n", volumeofprism);
        double Volumeofcylinder = Volumecalculate(4, 7);
        System.out.printf("Volume of cylinder: %.2f\n", Volumeofcylinder);
        double Volumeofcube = Volumecalculate(5);
        System.out.printf("Volume of cube: %.2f\n", Volumeofcube);

    }
}

