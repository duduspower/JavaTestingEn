public class Basic31 {
    public static void main(String[]args)
    {
        System.out.println("Program do sprawdzania zainstalowanej javy : ");
        System.out.println("\n	Java version " + System.getProperty("java.version"));
        System.out.println("	Java runtime version " + System.getProperty("java.runtime.version"));
        System.out.println("	Java home " + System.getProperty("java.home"));
        System.out.println("	Java vendor " + System.getProperty("java.vendor"));
        System.out.println("	Java vendor url " + System.getProperty("java.vendor.url"));
        System.out.println("	Java class path " + System.getProperty("java.class.path"));
    }
}
