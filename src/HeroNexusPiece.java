// Represents hero's nexus piece, where heroes can respawn and go to the market
public class HeroNexusPiece extends LoVPiece {
    private static final String NAME = "HeroNexus";
    public static final String ID = "N";

    private LoVMarket market;

    public HeroNexusPiece() {
        super(NAME, ID);

        market = new LoVMarket();
    }

    public String goToMarket() {
        String response = "";

        if (getHero() instanceof LoVHero) {
            response = market.getUserInput((LoVHero) getHero());
        }

        return response;
    }
}
