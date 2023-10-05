public class ProduitFactory3 extends ProduitFactory {
    @Override
    public ProduitA createProduitA() {
        return new ProduitA3();
    }
}
