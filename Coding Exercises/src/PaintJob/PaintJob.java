package PaintJob;

public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        return (int) Math.ceil( (height * width) / areaPerBucket) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        int numberOfBuckets = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double wallArea = width * height;
            numberOfBuckets = (int) Math.ceil(wallArea / areaPerBucket);
        }
        return numberOfBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        return getBucketCount(area, 1, areaPerBucket); // area=width*height, we can use call second method with area="width" if height is 1
    }
}

/** ΠΙΘΑΝΗ ΛΥΣΗ ΓΙΑ ΤΗΝ 2Η ΜΕΘΟΔΟ*/
//    public static int getBucketCount(double width, double height, double areaPerBucket){
//        return getBucketCount(width, height, areaPerBucket, 0);
//    }