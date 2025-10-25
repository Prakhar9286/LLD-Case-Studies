package CaseStudies.DesignAPen;

public class PenFactory {

    public static GelPen.Builder createGelPen() {
        return new GelPen.Builder();
    }

    public static FountainPen.Builder createFountainPen() {
        return new FountainPen.Builder();
    }
}
