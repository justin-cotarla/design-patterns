package flyweight;

import java.util.HashMap;

public class GlyphFactory {
    private HashMap<Character, Glyph> glyphMap = new HashMap<>();

    public Glyph getGlyph(char type) {
        if (!glyphMap.containsKey(type)) {
            switch (type) {
                case 'a':
                    glyphMap.put('a', new StandardGlyph("a", "A"));
                    break;
                case 'b':
                    glyphMap.put('b', new StandardGlyph("b", "B"));
                    break;
                case 'c':
                    glyphMap.put('c', new StandardGlyph("c", "C"));
                    break;
            }
        }

        return glyphMap.get(type);

    }
}
