public class HelloWorld {
    public static void main(String[] args){
        // cetak nama
//        System.out.println(shouldWakeUp(true, 4));
//        printConversion(8982.98);
        System.out.println(isLeapYear(2021));
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long kmToMiles = Math.round(kilometersPerHour * 0.621371);
        return kmToMiles;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("invalid value");
        } else {
            long result = toMilesPerHour(kilometersPerHour);
            System.out.printf("%.2f km/h = %d mil/h", kilometersPerHour, result);
        }
    }

    public static boolean shouldWakeUp(boolean menggonggong, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23) return false;
        if(menggonggong == true && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int named_year){
        if(named_year >= 1 && named_year <= 9999){
            if (named_year % 4 == 0){
                if(named_year % 100 == 0){
                    if (named_year % 400 == 0){
                        return true;
                    } else {
                        return false;
                    }
                } else{
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
