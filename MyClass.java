class MyClass {
    private int alpha; // acesso privado
    public int beta; // acesso píblico
    int gama; // acesso padrão

    /* Métodos para acessar alpha. Não há problema
       em um membro de uma classe acessar um membro
       privado da mesma clsse. */

    void setAlpha(int a) {
        alpha = a;
    }
    int getAlpha() {
        return alpha;
    }
}
class AcessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        /* O acesso a alpha só é permitido por intermédiario
        de seus métodos acessadores. */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // você não pode acessar alpha dessa forma
        // ob.alpha = 88; << Errado, alpha ´r privado

        ob.gama = 88;
        ob.beta = 99;
    }
}
