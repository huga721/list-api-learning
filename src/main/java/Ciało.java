import java.util.HashSet;
import java.util.Set;

public class Ciało {
    private final Key key;
    private final double okresOrbitowania;
    private final Set<Ciało> ksiezyce;
    public enum TypCiala{
        GWIAZDA,
        PLANETA,
        KSIEZYC,
        ASTEROIDA,
        KOMETA
    }

    public Ciało(String nazwa, double okresOrbitowania, TypCiala typ) {
        this.key = new Key(nazwa,typ);
        this.okresOrbitowania = okresOrbitowania;
        this.ksiezyce = new HashSet<>();
    }

    public double getOkresOrbitowania() {
        return okresOrbitowania;
    }

    public boolean addKsiezyc(Ciało ksiezyc){
        if (ksiezyc.getKey().getTypCiala() == TypCiala.KSIEZYC) {
            return this.ksiezyce.add(ksiezyc);
        } else {
            return false;
        }
    }

    // getter dla setu księżyców
    public Set<Ciało> getKsiężyce() {
        return new HashSet<>(this.ksiezyce);
    }
    public static Key makeKey(String nazwa, TypCiala typCiala){
        return new Key(nazwa, typCiala);
    }

    public Key getKey() {
        return key;
    }

    @Override
    public final int hashCode() { // jeśli equals jest final, wtedy hashCode też musi być final
        return this.key.hashCode();
    }

    @Override
    public final boolean equals(Object obiekt){
        if (this == obiekt){
            return true;
        }

        if (obiekt instanceof Ciało){
            Ciało c = (Ciało) obiekt;
            return this.key.equals(c.getKey());
            }
        return false;
        }


    @Override
    public String toString() {
        return this.key.getNazwa() + " " + this.key.getTypCiala() + " " + this.okresOrbitowania;
    }

    public static final class Key{
        private String nazwa;
        private TypCiala typCiala;

        public Key(String nazwa, TypCiala typCiala) {
            this.nazwa = nazwa;
            this.typCiala = typCiala;
        }

        public String getNazwa() {
            return nazwa;
        }

        public TypCiala getTypCiala() {
            return typCiala;
        }

        @Override
        public String toString() {
            return this.nazwa + ": " + this.typCiala;
        }

        @Override
        public int hashCode() {
            return this.nazwa.hashCode() + this.typCiala.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj){
                return true;
            }
            if (obj instanceof Key){
                Key key = (Key) obj;
                if (this.getNazwa().equals(key.getNazwa())){
                    return this.getTypCiala() == key.getTypCiala();
                }
            }
            return false;
        }
    }
}
