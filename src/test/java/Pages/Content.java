package Pages;

import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Content extends Parent{

    public Content() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
