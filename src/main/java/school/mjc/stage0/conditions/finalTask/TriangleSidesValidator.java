package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean bool1 = (firstSide + secondSide > thirdSide);
        boolean bool2 = (secondSide + thirdSide > firstSide);
        boolean bool3 = (thirdSide + firstSide > secondSide);

        if (bool1 && bool2 && bool3) {
            System.out.println("this is a valid triangle");
        }
        else {
            System.out.println("it's not a triangle");
        }

    }
}
