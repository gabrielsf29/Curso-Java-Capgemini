package Exercicio4POO;

import java.util.Scanner;

public class Invoice {

    //Atributos
    private String descricaoItem;
    private float precoUnitario;
    private int codigoItem;
    private int qtdComprada;

    //Comandos
    public Invoice(String descricaoItem, float precoUnitario, int codigoItem, int qtdComprada) {
        this.setCodigoItem(codigoItem);
        this.setDescricaoItem(descricaoItem);
        this.setPrecoUnitario(precoUnitario);
        this.setQtdComprada(qtdComprada);
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario < 0) {
            this.precoUnitario = 0.0f;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        if (qtdComprada < 0) {
            this.qtdComprada = 0;
        } else {
            this.qtdComprada = qtdComprada;
        }
    }

    public double getInvoiceAmount() {
        return (getQtdComprada() * getPrecoUnitario());
    }
}
