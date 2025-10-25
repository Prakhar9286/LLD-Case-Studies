package CaseStudies.DesignAPen;

import CaseStudies.DesignAPen.WritingStrategies.WriteBehaviour;

public abstract class Pen {
    private String name;
    private String company;
    private Type type;
    private WriteBehaviour writeBehaviour;

    Pen(Type type, WriteBehaviour writeBehaviour) {
        this.writeBehaviour = writeBehaviour;
    }

    public abstract Color getColor();

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String write() {
        return this.writeBehaviour.write();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
