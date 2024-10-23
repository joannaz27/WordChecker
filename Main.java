import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        //iswordChain test 1
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        WordChecker w = new WordChecker(words);
        System.out.println(w.isWordChain());
        //iswordChain test 2
        ArrayList<String> list = new ArrayList<String>();
        list.add("to");
        list.add("too");
        list.add("stool");
        list.add("tools");
        System.out.println(list);
        WordChecker t = new WordChecker(list);
        System.out.println(t.isWordChain());

//createList test
        ArrayList<String> cat = new ArrayList<String>();
        cat.add("catch");
        cat.add("bobcat");
        cat.add("catchacat");
        cat.add("cat");
        cat.add("at");
        WordChecker c = new WordChecker(cat);

        System.out.println(( c.createList("cat")));
        System.out.println(( c.createList("catch")));
        System.out.println(( c.createList("dog")));
    }
}