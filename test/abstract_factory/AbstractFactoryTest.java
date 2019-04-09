package abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    @Test
    public void abstractFactoryTest() {
        ReportFactory pdfFactory = new PdfReportFactory();

        ReportFooter pdfFooter = pdfFactory.generateFooter();
        ReportHeader pdfHeader = pdfFactory.generateHeader();

        ReportFactory textFactory = new TextReportFactory();

        ReportFooter textFooter = textFactory.generateFooter();
        ReportHeader textHeader = textFactory.generateHeader();

        assertEquals("PDF Header", pdfHeader.getContent());
        assertEquals("PDF Footer", pdfFooter.getContent());

        assertEquals("Text Header", textHeader.getContent());
        assertEquals("Text Footer", textFooter.getContent());
    }

}