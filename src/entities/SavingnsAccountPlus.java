package entities;

//Palavra final => evita que a classe seja herdada
public final class SavingnsAccountPlus extends SavingnsAccount {

    // esse metodo nao pode ser sobreposto novamente

    /*
     * public void withdraw(double amount) {
     * this.balance = this.balance - amount + 2.0;
     * }
     */

    // usamos a palvra final por segurança , convem acrescentar a palavra final e
    // metodos para não sobrepor, pois sobreposições multiplas podem ser porta de
    // entrada para inconsitencia

    // Final pode deixar o seu programa mais rapido

}
