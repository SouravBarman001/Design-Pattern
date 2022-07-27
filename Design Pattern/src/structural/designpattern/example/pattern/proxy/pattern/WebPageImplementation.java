package structural.designpattern.example.pattern.proxy.pattern;
//our actual service provider
public class WebPageImplementation implements WebPage{
    @Override
    public void renderPage(String url,int age) throws Exception {
        System.out.println(url + " rendered successfully");
    }
}
