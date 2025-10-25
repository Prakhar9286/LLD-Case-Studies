package CaseStudies.DesignAPen;

import CaseStudies.DesignAPen.WritingStrategies.SmoothWritingStrategy;
import CaseStudies.DesignAPen.WritingStrategies.WriteBehaviour;

public class GelPen extends Pen implements RefilPen {
    private Refil refil;
    private Boolean canChangeRefil;
    private String name;
    private String company;

    GelPen(WriteBehaviour writeBehaviour) {
        super(Type.GEL, writeBehaviour);
    }

    public static class Builder {
        private Refil refil;
        private Boolean canChangeRefil;
        private String name;
        private String company;

        public Builder setRefil(Refil refil) {
            this.refil = refil;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setCanChangeRefil(Boolean canChangeRefil) {
            this.canChangeRefil = canChangeRefil;
            return this;
        }

        public GelPen build() {
            GelPen gelPen = new GelPen(new SmoothWritingStrategy());
            gelPen.refil = this.refil;
            gelPen.canChangeRefil = this.canChangeRefil;
            gelPen.name = this.name;
            gelPen.company = this.company;

            return gelPen;
        }
    }

    @Override
    public Color getColor() {
        return refil.getInk().getColor();
    }

    @Override
    public Refil getRefil() {
        return this.refil;
    }

    @Override
    public Boolean isRefillable() {
        return this.isRefillable();
    }

    @Override
    public void changeRefil(Refil refil) {}
}
