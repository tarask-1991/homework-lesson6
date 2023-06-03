package charExamples;

public class homeWork6 {


    public int width;
    public int height;
    public int length;

    public homeWork6(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;

    }

    public void print() {

        Integer result = width * height * length;
        System.out.println(result);
    }
}
