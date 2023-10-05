public abstract class ProduitFactory {
    protected abstract ProduitA createProduitA();

    public ProduitA getProduitA() {
        return createProduitA();
    }
}
