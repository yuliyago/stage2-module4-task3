package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {

    public WordParser() {
    }
    // Write your code here!
    public WordParser(AbstractTextParser nextParser) {
        super(nextParser);
    }

    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] characters = string.split("");
        for (String character : characters) {
            AbstractTextComponent textComponent = new SymbolLeaf(character.charAt(0));
            abstractTextComponent.add(textComponent);
            System.out.println(abstractTextComponent);
        }
    }

    public static void main(String[] args) {
        AbstractTextComponent cmp = new TextComponent(TextComponentType.WORD);
        WordParser wordParser=new WordParser();
        wordParser.parse(cmp,"It is a established fact that a reader will be of a page when looking at its layout...");
    }
}
