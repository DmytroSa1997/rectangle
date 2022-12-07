public class rectangle {
    public static void main(String[] args) {
        int height = 1;
        while (height <= 4) {
            int width = 1;
            while (width <= 5) {
                if (height == 1 || height == 4) {
                    System.out.print('*');
                } else if (width == 1 || width == 5) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}
