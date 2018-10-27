public class Main {
    public static double a, a1, a2, c, d, lat1, lat2, lon1, lon2, changeLat, changeLon, rLat1, rLat2, rLon1, rLon2, distance;

    public static void main(String[] args) {
        lat1 = 25.0;
        lon1 = -15.0;
        lat2 = 23.0;
        lon2 = -20.0;
        operate();
        lat1 = 23.0;
        lon1 = -20.0;
        lat2 = 21.0;
        lon2 = -24.0;
        operate();
        lat1 = 21.0;
        lon1 = -24.0;
        lat2 = 20.0;
        lon2 = -27.0;
        operate();
        lat1 = 20.0;
        lon1 = -27.0;
        lat2 = 19.0;
        lon2 = -35.0;
        operate();
        lat1 = 19.0;
        lon1 = -35.0;
        lat2 = 21.0;
        lon2 = -46.0;
        operate();
        lat1 = 21.0;
        lon1 = -46.0;
        lat2 = 23.0;
        lon2 = -56.0;
        operate();
        lat1 = 23.0;
        lon1 = -56.0;
        lat2 = 25.0;
        lon2 = -65.0;
        operate();
        lat1 = 25.0;
        lon1 = -65.0;
        lat2 = 28.0;
        lon2 = -70.0;
        operate();
        lat1 = 28.0;
        lon1 = -70.0;
        lat2 = 32.0;
        lon2 = -73.0;
        operate();
        lat1 = 32.0;
        lon1 = -73.0;
        lat2 = 34.0;
        lon2 = -74.0;
        operate();
        lat1 = 34.0;
        lon1 = -74.0;
        lat2 = 36.0;
        lon2 = -74.0;
        operate();
        lat1 = 36.0;
        lon1 = -74.0;
        lat2 = 39.0;
        lon2 = -74.0;
        System.out.printf("The total distance travelled by Hurricane Gloria was %.2f kilometers.", distance);
    }

    public static void operate() {
        rLat1 = Math.toRadians(lat1);
        rLat2 = Math.toRadians(lat2);
        rLon1 = Math.toRadians(lon1);
        rLon2 = Math.toRadians(lon2);

        equation1();
        equation2();
        equation3();
        addDistance();
    }

        public static double equation1(){
        changeLat = (rLat1 - rLat2)/2;
        changeLon = (rLon1 - rLon2)/2;
            a1 = Math.sin(changeLat) * Math.sin(changeLat);
            a2 = (Math.sin((changeLon))) * (Math.sin((changeLon)));
            a = a1 + Math.cos(rLat1) * Math.cos(rLat2) * a2;
            return a;
        }
        public static double equation2() {
            c = 2 * Math.atan2(Math.sqrt(equation1()), Math.sqrt(1 - equation1()));
            return c;
        }
        public static double equation3() {
            d = 6371 * equation2();
            return d;
        }
        public static double addDistance(){
        distance = distance + d;
        return distance;
        }
    }

