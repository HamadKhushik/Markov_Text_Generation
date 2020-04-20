import edu.duke.FileResource;

import java.util.ArrayList;

public class Tester {

    public void testGetFollows() {
        MarkovOne mo = new MarkovOne();
        String s = "this is a test yes this is a test.";
        mo.setTraining(s);
        ArrayList<String> followed = mo.getFollows("t.");
        System.out.println(followed + " " + followed.size());
    }

    public void testGetFollowsWithFile() {
        FileResource fr = new FileResource();
        String st = fr.asString();
        st = st.replace('\n', ' ');
        MarkovOne mo = new MarkovOne();
        mo.setTraining(st);
        ArrayList<String> followed = mo.getFollows("th");
        System.out.println(followed.size());
    }

    public static void main(String[] args) {
        Tester t = new Tester();
        t.testGetFollowsWithFile();
    }
}
