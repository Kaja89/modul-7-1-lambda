package com.kodilla.modul71stream.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator decorator){
        decorator.decorate(text);
    }
}
