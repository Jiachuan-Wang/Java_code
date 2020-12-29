
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<String> title = new TreeSet<String>();
        TreeSet<String> id = new TreeSet<String>();
        TreeMap<Integer, String> all = new TreeMap<Integer, String>();
        int i = 0;
        String a = in.nextLine();
        while (!a.equals("END")) {
            String[] S1 = a.split(",");
            all.put(i, a);
            if (S1.length == 3) {
                title.add(S1[1]);
            }
            id.add(S1[0]);
            i++;
            a = in.nextLine();
        }
        int x = id.size();
        TreeMap<String, String>[] maps = new TreeMap[x];
        for (int y = 0; y < x; y++) {
            maps[y] = new TreeMap<String,String>();
            for (String f : title) {
                maps[y].put(f, " ,");
            }
        }
        for (int j = 0; j < i; j++) {
            String b = all.get(j);
            String[] S2 = b.split(",");
            int n = 0;
            Iterator<String> it = id.iterator();
            String c = it.next();
            while (!c.equals(S2[0])) {
                n++;
                c = it.next();
            }
            if (S2.length == 2) {
                maps[n].put("", S2[1] + ",");
            }
            if (S2.length == 3) {
                maps[n].put(S2[1], S2[2]);
            }
        }
        System.out.print("student id, name");
        for (String temp : title) {
            System.out.print("," + temp);
        }
        System.out.print(", average");
        List<String> list = new ArrayList<String>(id);
        for (int m = 0; m < x; m++) {
            System.out.print("\n" + list.get(m) + ",");
            int g = 0;
            double[] e = new double[title.size()];
            Arrays.fill(e, -1);
            for (String d : maps[m].values()) {
                String D = d.trim();
                if (D.matches("\\d+")) {
                    double D1 = Double.parseDouble(D);
                    e[g] = D1;
                    g++;
                    String R = String.format("%.1f", D1);
                    System.out.print(" " + R + ",");
                }
                if (D.matches("\\d+\\.\\d+")) {
                    double D1 = Double.parseDouble(D);
                    e[g] = D1;
                    g++;
                    String R = String.format("%.1f", D1);
                    System.out.print(" " + R + ",");
                }
                if (D.matches("\\D+")){
                    System.out.print(d);
                }
            }
            double sum = 0.0;
            double l = 0;
            for (int h = 0; h < title.size(); h++) {
                if (e[h]==-1){
                    break;
                }
                sum += e[h];
                l++;
            }
            double average = sum / l;
            String AVERAGE = String.format("%.1f", average);
            System.out.print(" " + AVERAGE);
        }
        in.close();
    }
}