package structural.designpattern.example.pattern.proxy.pattern;

public class Browser {
    public static void main(String[] args) {
       WebPageProxy webPageProxy = new WebPageProxy();
        try {
            webPageProxy.renderPage("www.rewdan.com",17);
        } catch (Exception e) {
            System.out.println("Exception occured "+e);
            e.printStackTrace();
        }
    }
}
