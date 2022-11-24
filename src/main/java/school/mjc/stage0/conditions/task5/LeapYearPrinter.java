package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
//        System.out.println((year % 100 != 0 && year % 4 == 0 || year % 400 == 0) ? "leap" : "not leap");
        switch (year % 100) {
            case 0:
                switch (year % 400) {
                    case 0:
                        System.out.println("leap");
                        break;
                    default:
                        System.out.println("not leap");
                        break;
                }
                break;
            default:
                switch (year % 4) {
                    case 0:
                        System.out.println("leap");
                        break;
                    default:
                        System.out.println("not leap");
                        break;
                }
                break;
        }
    }
}