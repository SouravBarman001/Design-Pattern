package proxy.pattern;
//our actual service provider
public class WebPageImplementation implements WebPage{
    @Override
    public void renderPage(String url) throws Exception {
        System.out.println(url + " rendered successfully");
    }
}
