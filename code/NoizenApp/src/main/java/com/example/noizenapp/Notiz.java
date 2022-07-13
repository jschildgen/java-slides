package com.example.noizenapp;

/**
 * Klasse, um Notizen zu verwalten.
 */
public class Notiz {
    private String titel;
    private String text;

    public Notiz(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Liefert den Titel der Notiz zurück
     * @return den Titel der Notize
     */
    @Override
    public String toString() {
        return this.titel;
    }
}
