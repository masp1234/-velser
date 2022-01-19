import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Person implements Comparable, Doable {
    private String firstName;
    private String lastName;
    private int age;
    private static int numberOfPeople;

    public Person(String firstName, String lastName, int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int convertStringtoInteger(String string) {
        Integer integer = Integer.MIN_VALUE;
        try {
            integer = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return integer;
    }


    public String toString() {
        return firstName + " " + lastName + " " + age;
    }


    public int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    @Override
    public int compareTo(Object o) {
        Person otherPerson = (Person) o;
        return this.age - otherPerson.age;
        // return this.firstName.compareTo(o.firstName);
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        /*
        ArrayList<Person> lstP = new ArrayList<>();
        Person pp = new Person("Jens", "Hansen");
        lstP.add(new Person("Lars1", "Larsen"));
        lstP.add(pp);
        lstP.add(pp);
        lstP.add(new Person("Lars2", "Larsen"));
        lstP.add(new Person("Lars3", "Larsen"));
        lstP.add(new Person("Lars4", "Larsen"));
        lstP.add(new Person("Lars4", "Larsen"));
        lstP.add(new Person("Martin", "Larsen"));
        lstP.add(new Person("Henning", "Larsensen"));
        lstP.add(new Person("Dude", "Larsensensen"));
        System.out.println(lstP.size());
        System.out.println(lstP);
        Collections.sort(lstP, new PersonFirstNameComparator());
        System.out.println(lstP);

        for (int i = 0; i < lstP.size(); i++) {
            if (lstP.get(i).getFirstName().equalsIgnoreCase("Jens")) {
                lstP.remove(i);
                i--;
            }
        }
        System.out.println(lstP);
        for (int i = 0; i < lstP.size(); i++) {
            if (lstP.get(i).getLastName().equalsIgnoreCase("Larsen")) {
                lstP.remove(i);
                i--;
            }



        }

         */
        /*
        System.out.println(lstP);
        Integer n1 = new Integer(9);
        Integer n2 = new Integer(9);
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

        int big = 255;
        byte small = (byte) big;
        System.out.println("small=" + small);
        big = 256;
        small = (byte) big;
        System.out.println("small=" + small);
        big = 257;
        small = (byte) big;
        System.out.println("small=" + small);

        String str1 = "Hello";
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        str1 = "Hello world";

        System.out.println(str1);
        System.out.println(str2);



        String str3 = "value1";
        str3 = str3.concat("value2");
        System.out.println(str3);


        String s1 = "abcde";
        s1 = s1.replace('a', 'x');
        System.out.println(s1);

        File file = new File("C:\\Users\\Martin\\IdeaProjects\\EksamensØvelser\\Test1");
        Scanner reader = null;

        try {
            reader = new Scanner(file);
            while (reader.hasNext()) {
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Nu er den her");
            try {
                reader.close();
            } catch (NullPointerException e) {
                System.out.println("The scanner is null");
            }

        }
        Person[] strArray = new Person[5];
        System.out.println(strArray.length);
        String string = "Hello Sir";
        System.out.println(string.length());

        int num = 0;
        int number2 = 1;
        try {
            int result = number2 / num;
        }
      catch (ArithmeticException e) {
          System.out.println("Kan ikke dividere med 0. " + e);
      }



        ArrayList<String> lststr = new ArrayList<>();
        for (int i = 0; i < 200000000; i++) {
            lststr.add("Hello World");
        }
        System.out.println(lststr.size());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2000000; i++) {
            sb = sb.append("12345678901234567890123456789012345678901234567890" + i);
        }


       // System.out.println("size s11=" + sb.length());
        System.out.println(sb);


        ArrayList<Person> lstP = new ArrayList<>();
        Person pp = new Person("Jens", "Hansen", 10);
        lstP.add(new Person("Lars", "Larsen", 20));
        lstP.add(pp);
        lstP.add(pp);
        lstP.add(new Person("Lars", "dsfdsfdsf", 5));
        lstP.add(new Person("Lars", "adsdsdsa", 1));
        lstP.add(new Person("Lars", "tgdfgfdgg", 3));
        lstP.add(new Person("Lars", "uhfghgfh", 25));
        lstP.add(new Person("Lars", "fasdsadsda", 18));

        System.out.println(lstP);

        Collections.sort(lstP, new PersonAgeComparator());

        System.out.println(lstP);

        for (int i = 0; i < lstP.size(); i++) {
            if (lstP.get(i).getFirstName().equalsIgnoreCase("Jens")) {
                lstP.remove(i);
                i--;
            }


        }



        try {
            //Some logic
            String str = "123x";
            Integer i = Integer.parseInt(str);
            System.out.println("This will never print");
            return;
        } catch (Exception e) {
            System.out.println("Har fanget exception.");
            return;
        } finally {
            System.out.println("nu er den her");

        }


        ArrayList<String> lststr = new ArrayList<>();
        for (int i = 0; i < 200000000; i++) {
            lststr.add("Hello World" + i);
        }
        System.out.println(lststr.size());



        int[] values = {2, 1, 5, 3, 8, 10, 13, 5};
        int b = 0;
        while (b <= values[b]) {
            System.out.println(values[b]);
            b++;
        }


         */

        int[] values = {2, 5, 5, 6, 8, 10, 12, 1};
        int a = 0;
        while (values[a] <= values[a + 1]) {
            System.out.println(values[a]);
            a++;
        }
        ArrayList<Doable> doables = new ArrayList();
        doables.add(new Dude());
        doables.add(new Dude());
        doables.add(new Dude());
        doables.add(new Dude());
        doables.add(new Person("Martin", "Pedersen", 12));
        doables.add(new Dude());
        doables.add(new Person("dfdf", "sffsd", 20));
        for (Doable doable: doables) {
            if (doable instanceof Dude) {
                System.out.println(((Dude) doable).doSomethingElse());
            }
            else {
                System.out.println(doable.doSomething());
            }
        }


    }

    @Override
    public String doSomething() {
        return "Doing something as a person";
    }
}
