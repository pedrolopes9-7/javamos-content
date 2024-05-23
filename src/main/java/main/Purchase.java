package main;

public class Purchase {
    private Announcement announcement;
    private Catalog catalog;

    private User user;

    // retornar objeto da compra - mudar retorno do método
    public void purchaseAnnouncement(Announcement announcement, int quantity) throws IllegalAccessException {

        // criar classe login
        Login login = new Login();
        if (login.login(user)) {
            throw new IllegalAccessException("Usuário sem permissão.");
        }

        // valida que possui estoque, e quantidade válida
        if (!announcement.getHasStockAvailable() || quantity <= 0 || quantity > announcement.getQuantity()) {
            System.out.println("Compra não autorizada, quantidade inválida.");
            throw new IllegalArgumentException("Quantidade inválida ou produto sem estoque ou quantidade superior ao disponível no estoque");
        }

        // remove
        var idProduct = announcement.getId();
        catalog.removeQuantity(idProduct, quantity);

        var totalPrice = announcement.getPrice() * quantity;

        System.out.println("Total da compra: " + totalPrice );
    }
}
