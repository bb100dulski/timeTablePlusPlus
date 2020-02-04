package sample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class scrapeWIT {
    //https://www.htmlgoodies.com/html5/other/web-page-scraping-with-jsoup.html
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://studentssp.wit.ie/Timetables/StudentGroupTT.aspx").get();

        String title = doc.title();
        System.out.println("title: " + title);

        Elements links = doc.select("a[href]");
        for (Element link : links) {
            System.out.println("\nlink: " + link.attr("href"));
            System.out.println("text: " + link.text());
        }

        Elements schools = doc.select("select[name=cboSchool] option[value]");
        for (Element school : schools) {
            System.out.println("\n" + school.text());
        }
    }
}
