package CaseStudies.DesignAPen;

import CaseStudies.DesignAPen.WritingStrategies.LightWritingStrategy;
import CaseStudies.DesignAPen.WritingStrategies.WriteBehaviour;

public class FountainPen extends Pen implements RefilPen {
    private String calligraphyType;
    private Refil refil;
    private Boolean canRefill;
    private String name;
    private String company;

    public String getCalligraphyType() {
        return calligraphyType;
    }

    public void setCalligraphyType(String calligraphyType) {
        this.calligraphyType = calligraphyType;
    }

    public void setRefil(Refil refil) {
        this.refil = refil;
    }

    public Boolean getCanRefill() {
        return canRefill;
    }

    public void setCanRefill(Boolean canRefill) {
        this.canRefill = canRefill;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }

    FountainPen(WriteBehaviour writeBehaviour) {
        super(Type.FOUNTAIN, writeBehaviour);
    }

    public static class Builder {
        private Refil refil;
        private Boolean canRefill;
        private String name;
        private String company;
        private String calligraphyType;

        public Builder setRefil(Refil refil) {
            this.refil = refil;
            return this;
        }

        public Builder setCanRefill(Boolean canRefill) {
            this.canRefill = canRefill;
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

        public Builder setCalligraphyType(String calligraphyType) {
            this.calligraphyType = calligraphyType;
            return this;
        }

        public FountainPen build() {
            FountainPen fountainPen = new FountainPen(new LightWritingStrategy());
            fountainPen.calligraphyType = this.calligraphyType;
            fountainPen.canRefill = this.canRefill;
            fountainPen.refil = this.refil;
            fountainPen.name = this.name;
            fountainPen.company = this.company;

            return fountainPen;
        }
    }

    @Override
    public Color getColor() {
        return this.refil.getInk().getColor();
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
    public void changeRefil(Refil refil) {
        System.out.println("This pen can be Refilled");
    }
}
