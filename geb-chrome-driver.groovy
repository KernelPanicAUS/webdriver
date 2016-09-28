
@Grapes([
    @Grab("org.codehaus.geb:geb-core:0.7.2"),
    @Grab("org.seleniumhq.selenium:selenium-chrome-driver:2.28.0"),
    @Grab("org.seleniumhq.selenium:selenium-support:2.28.0")
])
import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver


b = new Browser(driver: new ChromeDriver())


b.drive {
    go "http://www.google.com"

    $("input", name: "q" ) << "the book of geb"
    $("div.sfsbc").click()
}
