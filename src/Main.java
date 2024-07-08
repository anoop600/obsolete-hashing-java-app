package src;

public class Main {

    static String TEST = "The cat sat on the mat";
    public static void main(String[] args) {

        System.out.println("Hello, this is going to print out an MD5 hash");

        var obsoleteHasher = new ObsoleteHasher();
        System.out.println("MD5 hash: " + obsoleteHasher.GetMd5Hash(TEST));

        System.out.println("Hello, this is going to print out an SHA-1 hash");

        var obsoleteHashersha1 = new ObsoleteHasher();
        System.out.println("SHA-1 hash: " + obsoleteHashersha1.GetSha1Hash(TEST));
    }
}