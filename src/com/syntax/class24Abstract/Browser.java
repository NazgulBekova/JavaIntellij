package com.syntax.class24Abstract;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the webite"+websiteLink);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser {
    void openBrowser() {
        System.out.println("Opening the GoogleChrome");
    }

    void loadPage(String websiteLink) {
        System.out.println("loading the webite" + websiteLink + "in GoogleChrome");
    }

    void testThePage() {
        System.out.println("Testing the GoogleChrome");
    }

    void closeBrowser() {
        System.out.println("Closing the GoogleChrome browser");
    }
}
//shortcut to find and replace is ctrl+r on windows
class FireFox extends Browser {
    void openBrowser() {
        System.out.println("Opening the FireFox");
    }

    void loadPage(String websiteLink) {
        System.out.println("loading the webite" + websiteLink + "in FireFox");
    }

    void testThePage() {
        System.out.println("Testing the FireFox");
    }

    void closeBrowser() {
        System.out.println("Closing the FireFox browser");
    }
}
class Safari extends Browser {
    void openBrowser() {
        System.out.println("Opening the Safari");
    }

    void loadPage(String websiteLink) {
        System.out.println("loading the webite" + websiteLink + "in Safari");
    }

    void testThePage() {
        System.out.println("Testing the Safari");
    }

    void closeBrowser() {
        System.out.println("Closing the Safari browser");
    }
}
class IE extends Browser {
    void openBrowser() {
        System.out.println("Opening the IE browser");
    }

    void loadPage(String websiteLink) {
        System.out.println("loading the webite" + websiteLink + "in IE");
    }

    void testThePage() {
        System.out.println("Testing the IE browser");
    }

    void closeBrowser() {
        System.out.println("Closing the IE browser");
    }
}