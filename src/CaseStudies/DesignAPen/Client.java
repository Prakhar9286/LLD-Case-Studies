package CaseStudies.DesignAPen;

public class Client {
    public static void main(String[] args) {
//        Refil refil = new Refil();
//        Ink ink = new Ink();
//        ink.setType(Type.GEL);
//        ink.setColor(Color.BLUE);
//
//        refil.setInk(ink);
//        GelPen reynoldsGelPen = PenFactory.createGelPen().setRefil(refil).setCanChangeRefil(true).build();
//        System.out.println(reynoldsGelPen.getColor());
//
//        ink.setColor(Color.BLACK);
//        refil.setInk(ink);
//        GelPen trimaxGelPen = PenFactory.createGelPen().setRefil(refil).setCanChangeRefil(true).build();
//        System.out.println(reynoldsGelPen.getCompany());

        Ink fountainPenInk = new Ink();
        fountainPenInk.setColor(Color.BLACK);
        fountainPenInk.setType(Type.FOUNTAIN);

        Nip fountainPenNip = new Nip();
        fountainPenNip.setNipType(TypeOfNip.FOUNTAIN_NIP);
        fountainPenNip.setRadius(10);

        Refil fountainPenRefil = new Refil();
        fountainPenRefil.setInk(fountainPenInk);
        fountainPenRefil.setNip(fountainPenNip);

        FountainPen fountainPen = PenFactory.createFountainPen()
                                            .setRefil(fountainPenRefil)
                                            .setCanRefill(true)
                                            .setCalligraphyType("Smooth Calligraphy")
                                            .setName("Pilot")
                                            .setCompany("Reynolds")
                                            .build();

        System.out.println("This is a " + fountainPen.getRefil().getInk().getType() +
                " pen. The Name of the Brand is " + fountainPen.getName() + " and color is " +
                fountainPen.getColor() + ". This belongs to " + fountainPen.getCompany() + " company.");

    }
}
