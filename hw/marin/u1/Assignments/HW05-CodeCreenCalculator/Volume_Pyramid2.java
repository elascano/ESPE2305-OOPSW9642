public class Volume_Pyramid2 {

    public static void main(String[] args) {
        int height = 8;
        int base1 = 5;
        int base2 = 5;
        float volume;

        System.out.println("Hello Object Oriented Programming Classmates");
        System.out.println("----My name is Josue Marin----");
        System.out.println("Program to calculate the volume of a pyramid");

        volume = calculateVolume(height, base1, base2);
        System.out.println("Volume of the pyramid: " + volume);
    }

    static float calculateVolume(float height, float base1, float base2) {
        float areabase;
        float volume_Pyramid;
        areabase = base1 * base2;
        volume_Pyramid = (areabase * height) / 3;

        System.out.println("Height of the pyramid: " + height);
        System.out.println("Base1 of the pyramid: " + base1);
        System.out.println("Base2 of the pyramid: " + base2);
        System.out.println("Area of the base: " + areabase);

        return volume_Pyramid;
    }
}
