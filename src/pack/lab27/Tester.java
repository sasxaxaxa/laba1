package pack.lab27;


public class Tester {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab();

        hashTab.hashtabAdd("positive", 1);
        hashTab.hashtabAdd("negative", -2);
        hashTab.hashtabAdd("positive", 100);
        hashTab.hashtabAdd("negative", -200);

        int find_elem = hashTab.hashtabLookup("positive");
        System.out.println(find_elem);

        hashTab.hashtabDelete("positive");
        find_elem = hashTab.hashtabLookup("positive");
        System.out.println(find_elem);

        hashTab.hashtabDelete("positive");
        find_elem = hashTab.hashtabLookup("positive");
        System.out.println(find_elem);

    }
}