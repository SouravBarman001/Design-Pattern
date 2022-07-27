package structural.designpattern.example.pattern.proxy.pattern;

public class WebPageProxy implements WebPage{
    private WebPage webPage;

public WebPageProxy(){
    webPage = new WebPageImplementation();
}

    @Override
    public void renderPage(String url,int age) throws Exception {
     if (age < 18){
        throw new Exception(url + "is blocked by ISP");
     }else {
         webPage.renderPage(url,age);
     }
    }
}
