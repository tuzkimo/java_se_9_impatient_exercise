package chapter_1_fundamental;

import com.sun.source.tree.AssertTree;

/*
 * Write a program that reads an integer angle (which may be positive or negative)
 * and normalizes it to a value between 0 and 359 degrees.
 * Try it first with the % operator, then with floorMod.
 */
public class exercise_2 {

    // handle with % operator
//    private static int getStandardAngle(int angle) {
//        int result = 0;
//
//        result = angle % 360;
//        result = result < 0 ? result + 360 : result;
//
//        return result;
//    }

    // handle with floorMod
    private static int getStandardAngle(int angle) {
        int result = 0;

        result = Math.floorMod(angle, 360);

        return result;
    }

    public static void main(String[] args) {
        int positiveAngleSmallerThan360 = 45;
        int positiveAngleBiggerThan360 = 405;
        int negativeAngleBiggerThanNegative360 = -315;
        int negativeAngleSmallerThanNegative360 = -675;

        System.out.println("convert " + positiveAngleSmallerThan360 + " degree to standard angle is " + getStandardAngle(positiveAngleSmallerThan360));
        System.out.println("convert " + positiveAngleBiggerThan360 + " degree to standard angle is " + getStandardAngle(positiveAngleBiggerThan360));
        System.out.println("convert " + negativeAngleBiggerThanNegative360 + " degree to standard angle is " + getStandardAngle(negativeAngleBiggerThanNegative360));
        System.out.println("convert " + negativeAngleSmallerThanNegative360 + " degree to standard angle is " + getStandardAngle(negativeAngleSmallerThanNegative360));
        System.out.println("convert 360 degree to standard angle is " + getStandardAngle(360));
        System.out.println("convert 720 degree to standard angle is " + getStandardAngle(720));
        System.out.println("convert -360 degree to standard angle is " + getStandardAngle(-360));
        System.out.println("convert -720 degree to standard angle is " + getStandardAngle(-720));
    }
}
