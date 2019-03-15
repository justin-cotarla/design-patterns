package flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightTest {
    @Test
    public void flyweightTest() {
        GlyphFactory glyphFactory = new GlyphFactory();

        Glyph a = glyphFactory.getGlyph('a');
        Glyph b = glyphFactory.getGlyph('b');
        Glyph c = glyphFactory.getGlyph('c');

        Glyph a2 = glyphFactory.getGlyph('a');
        Glyph theta = new ThetaGlyph();

        assertEquals("<b>a A<b>", a.display("b"));
        assertEquals("<b>b B<b>", b.display("b"));
        assertEquals("<b>c C<b>", c.display("b"));

        assertEquals("<b>a A<b>", a2.display("b"));
        assertEquals("<b>Θ<b>", theta.display("b"));

        assertSame(a, a2);
    }

}