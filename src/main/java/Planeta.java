public class Planeta extends Ciało{
    public Planeta(String nazwa, double okresOrbitowania) {
        super(nazwa, okresOrbitowania, TypCiala.PLANETA);
    }

    @Override
    public boolean addKsiezyc(Ciało ksiezyc) {
        if (ksiezyc.getKey().getTypCiala()==TypCiala.KSIEZYC) {
            return super.addKsiezyc(ksiezyc);
        } else {
            return false;
        }
    }
}
