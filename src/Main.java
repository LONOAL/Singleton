public class Main {
    public static void main(String[] args) {
        BaseDeDatos obx1= BaseDeDatos.getInstance();
        obx1.setToken("token1");
        obx1.setUsuario("Usuario1");
        System.out.println(obx1.toString());
        BaseDeDatos obx2= BaseDeDatos.getInstance();
        obx2.setToken("token2");
        obx2.setUsuario("Usuario2");
        System.out.println(obx2.toString());
    }
}