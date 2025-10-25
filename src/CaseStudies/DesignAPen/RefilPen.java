package CaseStudies.DesignAPen;

public interface RefilPen {
    Refil getRefil();

    Boolean isRefillable();

    void changeRefil(Refil refil);

}
