import java.util.ArrayList;

/**
 * Search algorithms
 * 
 * @author Filip Kin
 * @version 2020-04-23
 */
public class SearchContacts {
    public static int check(ArrayList<Contact> m, int i, String toFind, int type) {
        switch (type) {
            case 1:
                return m.get(i).getName().compareTo(toFind);
            case 2:
                return m.get(i).getRelation().compareTo(toFind);
            case 3:
                return m.get(i).getBirthday().compareTo(toFind);
            case 4:
                return m.get(i).getPhoneNumber().compareTo(toFind);
            case 5:
                return m.get(i).getEmail().compareTo(toFind);
            case 6:
                return m.get(i).getBirthday().split("-")[0].compareTo(toFind);
            case 7:
                return m.get(i).getBirthday().split("-")[1].compareTo(toFind);
            case 8:
                return m.get(i).getBirthday().split("-")[2].compareTo(toFind);
            case 9:
                return m.get(i).getName().split(" ")[0].compareTo(toFind);
            case 10:
                return m.get(i).getName().split(" ")[1].compareTo(toFind);
        }
        return 0;
    }

    public static int check(Contact[] m, int i, String toFind, int type) {
        switch (type) {
            case 1:
                return m[i].getName().compareTo(toFind);
            case 2:
                return m[i].getRelation().compareTo(toFind);
            case 3:
                return m[i].getBirthday().compareTo(toFind);
            case 4:
                return m[i].getPhoneNumber().compareTo(toFind);
            case 5:
                return m[i].getEmail().compareTo(toFind);
        }
        return 0;
    }

    public static void linear(ArrayList<Contact> m, int toFind, int type) {
        linear(m, Integer.toString(toFind), type);
    }

    public static void linear(Contact[] m, int toFind, int type) {
        linear(m, Integer.toString(toFind), type);
    }

    public static void binary(ArrayList<Contact> m, int toFind, int type) {
        binary(m, Integer.toString(toFind), type);
    }

    public static void binary(Contact[] m, int toFind, int type) {
        binary(m, Integer.toString(toFind), type);
    }

    public static void linear(Contact[] m, String toFind, int type) {
        int found = 0;
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < m.length; i++) {
            if (check(m, i, toFind, type) == 0) {
                found++;
                out.append(m[i]);
            }
        }
        System.out.println((found > 0)?found + " Results: \n"+out.toString():"No results found");
    }

    public static void linear(ArrayList<Contact> m, String toFind, int type) {
        int found = 0;
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < m.size(); i++) {
            if (check(m, i, toFind, type) == 0) {
                found++;
                out.append(m.get(i));
            }
        }
        System.out.println((found > 0)?found + " Results: \n"+out.toString():"No results found");
    }
    
    public static void binary(Contact[] m, String toFind, int type) {
        int high = m.length;
        int low = -1;
        int probe;
    
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (check(m, probe, toFind, type) > 0) {
                high = probe;
            } else {
                low = probe;
            }
        }
    
        if (check(m, low, toFind, type) != 0) {
            System.out.println("No results found");
        } else {
            StringBuilder out = new StringBuilder();
            while (check(m, low, toFind, type) == 0) {
                out.append(m[low].toString());
                low--;
                if (low < 0) break;
            }
            int found = high-low-1;
            System.out.println(found + " Result"+((found!=1)?"s":"")+": \n"+out.toString());
        }
    }
    
    public static void binary(ArrayList<Contact> m, String toFind, int type) {
        int high = m.size();
        int low = -1;
        int probe;
    
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (check(m, probe, toFind, type) > 0) {
                high = probe;
            } else {
                low = probe;
            }
        }
    
        if (check(m, low, toFind, type) != 0) {
            System.out.println("No results found");
        } else {
            StringBuilder out = new StringBuilder();
            while (check(m, low, toFind, type) == 0) {
                out.append(m.get(low).toString());
                low--;
                if (low < 0) break;
            }
            int found = high-low-1;
            System.out.println(found + " Result"+((found!=1)?"s":"")+": \n"+out.toString());
        }
    }
}
