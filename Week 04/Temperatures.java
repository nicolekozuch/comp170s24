public class Temperatures {
    public static void main(String[] args) {
        int sun1 = 74;
        int mon1 = 78;
        int tue1 = 80;
        int wed1 = 79;
        int thu1 = 83;
        int fri1 = 85;
        int sat1 = 81;
        int sun2 = 74;
        int mon2 = 78;
        int tue2 = 80;
        int wed2 = 79;
        int thu2 = 83;
        int fri2 = 85;
        int sat2 = 81;
        int total = sun1+mon1+tue1+wed1+thu1+fri1+sat1+sun2+mon2+tue2+wed2+thu2+fri2+sat2;
        int average = total/14;
        System.out.println("Average temp was " + average);
    }
}
