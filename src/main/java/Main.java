import java.util.*;

public class Main {
    private static Map<Ciało.Key, Ciało> systemSłoneczny = new HashMap<>();
    private static Set<Ciało> planety = new HashSet<>();

    public static void main(String[] args) {

        createAPlanet("Testowanko", 69);

        Ciało temp = new Planeta("Merkury", 88);
        systemSłoneczny.put(temp.makeKey("Merkury", Ciało.TypCiala.PLANETA), temp);
        planety.add(temp);

        temp = new Planeta("Ziema", 20);
        systemSłoneczny.put(temp.getKey(), temp);
        planety.add(temp);

        temp = new Planeta("Mars", 40);
        systemSłoneczny.put(temp.getKey(), temp);
        planety.add(temp);

        temp = new Planeta("Jowisz", 69);
        systemSłoneczny.put(temp.getKey(), temp);
        planety.add(temp);

        Ciało tempKsiezyc = new Ksiezyc("Europa", 320);
        systemSłoneczny.put(tempKsiezyc.getKey(), tempKsiezyc);
        temp.addKsiezyc(tempKsiezyc);

        temp = new Planeta("Neptun", 454);
        systemSłoneczny.put(temp.getKey(), temp);
        planety.add(temp);

        temp = new Planeta("Uran", 875);
        systemSłoneczny.put(temp.getKey(), temp);
        planety.add(temp);

        tempKsiezyc = new Ksiezyc("Oberon", 1000);
        systemSłoneczny.put(tempKsiezyc.getKey(),tempKsiezyc);
        temp.addKsiezyc(tempKsiezyc);

        tempKsiezyc = new Ksiezyc("Tytania", 420);
        systemSłoneczny.put(tempKsiezyc.getKey(), tempKsiezyc);
        temp.addKsiezyc(tempKsiezyc);

        temp = new Planeta("Saturn", 4342);
        systemSłoneczny.put(temp.getKey(), temp);
        planety.add(temp);

        tempKsiezyc = new Ksiezyc("Tytan", 1028);
        systemSłoneczny.put(tempKsiezyc.getKey(), tempKsiezyc);
        temp.addKsiezyc(tempKsiezyc);

        System.out.println("Planety");
        for (Ciało c : planety){
            System.out.println("\t" + c.getKey());
        }

        Ciało saturn = systemSłoneczny.get(Ciało.makeKey("Saturn", Ciało.TypCiala.PLANETA));
        System.out.println("Księżyce " + saturn.getKey());
        for (Ciało c : saturn.getKsiężyce())
        System.out.println("\t" + c.getKey());

        Ciało uran = systemSłoneczny.get(Ciało.makeKey("Uran", Ciało.TypCiala.PLANETA));
        System.out.println("Księżyce " + uran.getKey());
        for (Ciało c : uran.getKsiężyce()){
            System.out.println("\t" + c.getKey());
        }

        Ciało neptun = new Planeta("Neptun", 420);
        planety.add(neptun);
        Ciało k = new Planeta("Neptun", 69);
        planety.add(k);

        System.out.println("=============================================================");
        printAllPlanets();

        System.out.println("=============================================================");
        printAllMoons();

        System.out.println("=============================================================");
        System.out.println("Solar system contains:");
        for (Ciało c : systemSłoneczny.values()){
            System.out.println("\t" + c);
        }
    }
    public static void printAllMoons(){
        Set<Ciało> moons = new HashSet<>();
        for (Ciało c: planety){
            moons.addAll(c.getKsiężyce());
        }
        System.out.println("All of the moons:");
        for (Ciało c: moons){
            System.out.println("\t"+c);
        }
    }
    public static void printAllPlanets(){
        System.out.println("All of the planets:");
        for (Ciało c : planety){
            System.out.println("\t"+c);
        }
    }
    public static void createAPlanet(String name, int period){
        Ciało planet = new Planeta(name, period);
        systemSłoneczny.put(planet.getKey(), planet);
        planety.add(planet);

    }
}
