public class ProduitFactory1 extends ProduitFactory {
    @Override
    public ProduitA createProduitA() {
        return new ProduitA1();
    }
}