import java.util.*;

public class Main {
    private static Map<Ciało.Key, Ciało> systemSłoneczny = new HashMap<>();
    private static Set<Ciało> planety = new HashSet<>();

    public static void main(String[] args) {

/**
 * zamienić temp.getNazwa() na temp.getKey()
 * sprawdzić co robi temp.getKey()
 * zrobić dokumentację
 * spróbować zrozumieć kod
 */

        Ciało temp = new Planeta("Merkury", 88);
        systemSłoneczny.put(temp.getNazwa(), temp);
        planety.add(temp);

        temp = new Planeta("Ziema", 20);
        systemSłoneczny.put(temp.getNazwa(), temp);
        planety.add(temp);

        temp = new Planeta("Mars", 40);
        systemSłoneczny.put(temp.getNazwa(), temp);
        planety.add(temp);

        temp = new Planeta("Jowisz", 69);
        systemSłoneczny.put(temp.getNazwa(), temp);
        planety.add(temp);

        Ciało tempKsiezyc = new Ksiezyc("Europa", 320);
        systemSłoneczny.put(tempKsiezyc.getNazwa(), tempKsiezyc);
        temp.addKsiezyc(tempKsiezyc);

        temp = new Planeta("Neptun", 454);
        systemSłoneczny.put(temp.getNazwa(), temp);
        planety.add(temp);

        temp = new Planeta("Uran", 875);
        systemSłoneczny.put(temp.getNazwa(), temp);
        planety.add(temp);

        tempKsiezyc = new Ksiezyc("Oberon", 1000);
        systemSłoneczny.put(tempKsiezyc.getNazwa(),tempKsiezyc);
        temp.addKsiezyc(tempKsiezyc);

        tempKsiezyc = new Ksiezyc("Tytania", 420);
        systemSłoneczny.put(tempKsiezyc.getNazwa(), tempKsiezyc);
        temp.addKsiezyc(tempKsiezyc);

        temp = new Planeta("Saturn", 4342);
        systemSłoneczny.put(temp.getNazwa(), temp);
        planety.add(temp);

        tempKsiezyc = new Ksiezyc("Tytan", 1028);
        systemSłoneczny.put(tempKsiezyc.getNazwa(), tempKsiezyc);
        temp.addKsiezyc(tempKsiezyc);

        System.out.println("Planety");
        for (Ciało c : planety){
            System.out.println("\t" + c.getNazwa());
        }

        Ciało saturn = systemSłoneczny.get("Saturn");
        System.out.println("Księżyce " + saturn.getNazwa());
        for (Ciało c : saturn.getKsiężyce())
        System.out.println("\t" + c.getNazwa());

        Ciało uran = systemSłoneczny.get("Uran");
        System.out.println("Księżyce " + uran.getNazwa());
        for (Ciało c : uran.getKsiężyce()){
            System.out.println("\t" + c.getNazwa());
        }

//        Set<Ciało> księżyce = new HashSet<>();
//        for (Ciało c : planety){
//            księżyce.addAll(c.getKsiężyce());
//        }
//        System.out.println("Wszystkie księżyce:");
//        for (Ciało c : księżyce){
//            System.out.println("\t" + c.getNazwa());
//        }
//
        Ciało neptun = new Gwiazda("Neptun", 420);
        planety.add(neptun);
//
//        System.out.println();
        for (Ciało c : planety){
            System.out.println(c);
        }
        Ciało test = new Planeta("Testuje", 240);
        Ciało test1 = new Gwiazda("Testuje", 241);
        System.out.println(test.equals(test1));
        System.out.println(test1.equals(test));
    }
}
