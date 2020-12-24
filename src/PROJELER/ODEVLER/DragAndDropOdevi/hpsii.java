package PROJELER.ODEVLER.DragAndDropOdevi;

public class hpsii {
    /*
    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html%22);
        driver.manage().window().maximize();

       List<WebElement> sehirler = driver.findElements(By.cssSelector("div#answerDiv > div"));

       List<WebElement> bosluklar = driver.findElements(By.cssSelector("div#questionDiv > div.destinationBox"));

       Actions builder = new Actions(driver);


        for (WebElement sehir: sehirler) {
            System.out.println();

            for (WebElement bosluk: bosluklar){
                System.out.println(bosluk.getText());
                //if (bosluk.getText().length() != 0) continue; // boslukta birsey varsa atliyor

                Action build = builder.clickAndHold(sehir).moveToElement(bosluk).release(bosluk).build();

                build.perform();

                Thread.sleep(400);

                System.out.print(sehir.getCssValue("background-color"));
                if (sehir.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) {
                    break;
                }

            }
            }

        Thread.sleep(5000);
        driver.quit();

    }
Huseyin Ozdemirbugün saat 19:20
odev 2
driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html%22);
        driver.manage().window().maximize();

        List<WebElement> students = driver.findElements(By.cssSelector("li[id^='node']"));

        List<WebElement> boxes = driver.findElements(By.cssSelector("ul[id^='box']"));

        Actions builder = new Actions(driver);
        Thread.sleep(500);
        Action build;

        for (WebElement student: students) {
            for (WebElement box : boxes) {
                build = builder.clickAndHold(student).moveToElement(box).release(box).build();
                Thread.sleep(300);
                build.perform();
                Thread.sleep(300);
                break;
            }
        }


        Thread.sleep(3000);
        driver.quit();

    }
odev 2, 2. yöntem
driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html%22);
        driver.manage().window().maximize();

        List<WebElement> ogrenciler=driver.findElements(By.cssSelector("ul[id='allItems']>li"));
        List<WebElement> kutular=driver.findElements(By.cssSelector("ul[id^='box']"));
        //Thread.sleep(1000);
        int sayac1=0;
        Actions builder = new Actions(driver);

        for (int i = 0; i < ogrenciler.size(); i++) {

            for ( int j =0; j < kutular.size(); j++) {

                builder.clickAndHold(ogrenciler.get(i)).
                        pause(Duration.ofSeconds(1)).
                        moveToElement(kutular.get(j)).
                        pause(Duration.ofSeconds(1)).
                        release().
                        build().
                        perform();
                sayac1 += 29;
                if (Integer.parseInt(kutular.get(j).getCssValue("height").replaceAll("[^0-9]", "")) > sayac1)
                    break;
                else { sayac1=0; j++; break;}
            }
        }
        Thread.sleep(3000);
        driver.quit();
    }
.
Huseyin Ozdemirbugün saat 19:34
3. Ödev
driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html%22);
        // driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        List<WebElement> cities = driver.findElements(By.cssSelector("li[id^='node']"));
        List<WebElement> countries = driver.findElements(By.cssSelector("ul[id^='box']"));

        Actions builder = new Actions(driver);
        Action build;
        int a = 0;

        // 1. yöntem
        for (WebElement city : cities) {
            System.out.println();
            for (WebElement country : countries) {

                // if (country.getText().length() != 0) continue; // boslukta birsey varsa atliyor

                build = builder.clickAndHold(city).moveToElement(country).release(country).build();
                build.perform();
                Thread.sleep(500);
                System.out.print(city.getCssValue("background-color"));
                Thread.sleep(500);
                if (city.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) break;


//                for (int i = 0; i <cities.size() ; i++) {
//
//
//
//                    for (int j=0; j<countries.size();j++) {
//                        build = builder.clickAndHold(cities.get(i)).moveToElement(countries.get(j)).release().build();
//                        build.perform();
//                        Thread.sleep(500);
//                        //if (i+1==cities.size()) break;
//                        if(cities.get(i).getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) break;
//                    }
//                }

            }


        }
        Thread.sleep(3000);
        driver.quit();
    }
     */
}
