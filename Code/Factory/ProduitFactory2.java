public class ProduitFactory2 extends ProduitFactory {
    @Override
    public ProduitA createProduitA() {
        return new ProduitA2();
    }
}
