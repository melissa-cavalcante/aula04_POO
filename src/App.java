public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Aluno melissa = new Aluno("Melissa","44280828865",292048232,"07/10/2004","feminino");
        melissa.setNome("Melissa");

        System.out.println(melissa.getNome());
        System.out.println(melissa.getRa());
        
        Aluno kauan = new Aluno();
        kauan.setNome("Kauan");
        System.out.println(kauan.getNome());
    }
}                                                   
