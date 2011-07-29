/*
 * Racional.java criado em 27/07/2011
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */

package br.com.objectos.dojo.hescarate.tdd.ex1;

/**
 * @author hellen.escarate@objectos.com.br (Hellen Escarate)
 */
public class Racional {

  Integer numerador;
  Integer denominador;

  public Racional(int numerador, int denominador) {

    if (denominador == 0) {

      throw new IllegalArgumentException();

    } else {

      int g = mdc(Math.abs(numerador), Math.abs(denominador));

      this.numerador = numerador / g;
      this.denominador = denominador / g;

    }

  }
  public Racional(int i) {

    this(i, 1);

  }

  public Racional mais(Racional numero) {

    int numerador = numero.numerador;
    int denominador = numero.denominador;

    int somaNumerador = this.numerador * denominador + numerador * this.denominador;
    int somaDenominador = this.denominador * denominador;
    return new Racional(somaNumerador, somaDenominador);

  }

  public Racional vezes(Racional outro) {

    return new Racional(numerador * outro.numerador, denominador * outro.denominador);
  }

  private int mdc(int a, int b) {

    return b == 0 ? a : mdc(b, a % b);

  }

  @Override
  public String toString() {
    return numerador.toString() + "/" + denominador.toString();
  }

}
