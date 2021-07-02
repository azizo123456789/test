import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.lang.reflect.Field;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tab  {

    public static void main(String[] args)  throws CloneNotSupportedException {
       /* int[] tab = new int[]{1,2,3};
        System.out.println(tab);

        int[] tab1 = tab.clone();
        System.out.println(tab1);
        for(int i:tab1){
            System.out.println(i);
        }
        String chaine = "@gmai.com";
        String a ="the best man on earth";
        Pattern p = Pattern.compile("[a-zA-Z0-9]?@[a-z]*.com");
        Matcher m = p.matcher(chaine);
        if(m.matches()){
            System.out.println("vrai");
        }else{
            System.out.println("faux");
        }


        int x=10;
        int y=10;
        System.out.println("ARRAYLIST");
        ArrayList<Integer> col = new ArrayList<Integer>();
        System.out.println(col);
        SayImplementation say = new SayImplementation();
        say.sayBonjour();
        say.sayHello();
        say.saySalem();
        say.sayOui();
        say.sayYes();
        say.sayNa3am();
        List<String> liste = new ArrayList<String>();
        liste.add("Opel");
        liste.add("Volvo");
        liste.add("Mercedes");
        liste.add("BMW");
        liste.add("Peugeot");
        for (String i : liste) {
            System.out.print(i + " ");
        }
        String[] tab = new String[liste.size()];
        for (int i = 0; i < liste.size(); i++) {
            tab[i] = liste.get(i);
        }
        for (String i : tab) {
            System.out.println(i);
        }
        List<String> secondlist = new ArrayList<String>();
        secondlist.add("A");
        secondlist.add("B");
        secondlist.add("C");
        secondlist.add("D");
        secondlist.add("E");

        Collections.copy(secondlist, liste);
        System.out.println(secondlist);
        String s1 = new String("bonjour");
        String s2 = new String("bonjour");
        System.out.println(s1.equals(s2));*/
        Ok k = new Ok("aaa");
        Ok b = (Ok)k.clone();

        System.out.println(k.equals(b));
        Sub s = new Sub();
        s.setAge("aaa");
        System.out.println(s.getAge());
        s.bro();
        s.ok();
        Sub p = new Sub();
        
    }

}
