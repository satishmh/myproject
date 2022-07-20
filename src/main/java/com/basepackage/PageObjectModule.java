package com.basepackage;

import org.openqa.selenium.By;

public class PageObjectModule {

         public By LOGO=By.xpath("//img[contains(@src,'application/view/image/icon/opencart-logo.png')]");  
         public By TITLE=By.xpath("//img[contains(@title,'OpenCart - Open Source Shopping Cart Solution')]");
         public By LOGIN=By.xpath("//div[@class='navbar-right hidden-xs']//a[contains(text(),'Login')]");
         public By REGISTER=By.xpath("//div[@class='navbar-right hidden-xs']//a[contains(text(),'Register')]");

}
