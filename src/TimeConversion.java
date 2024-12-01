public class TimeConversion {

    public static String timeConversion(String s) {

        String s2 = s.substring(0, s.length() - 2);
        String[] time = s2.split(":");

        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2];

        if (s.contains("AM")) {
            return (hours.equals("12") ? "00" : hours) + ":" + minutes + ":" + seconds;
        } else {
            return ((hours.equals("12") ? hours : (Integer.parseInt(hours) + 12))
                    + ":" + minutes + ":" + seconds);
        }
    }
}
