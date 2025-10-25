package CaseStudies.DesignAPen;

import CaseStudies.DesignAPen.WritingStrategies.WriteBehaviour;

public class MarkerPen extends Pen implements RefilPen {

    MarkerPen(Type type, WriteBehaviour writeBehaviour) {
        super(Type.MARKER, writeBehaviour);
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public Refil getRefil() {
        return null;
    }

    @Override
    public Boolean isRefillable() {
        return null;
    }

    @Override
    public void changeRefil(Refil refil) {

    }
}
