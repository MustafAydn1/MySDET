package M1W3D4_G14_WindowsHandles;

public class equalsVeDigeri {
    public static void main(String[] args) {
        String ad1="Ahmet";
        String ad2="Ahmet";



        if (ad1==ad2) { //hafıza da yer tuttugu yerler aynı mı? sorusunun cevabını verir.
            // bunların 2 si de aynı yeri mi gösteriyor,  -->> HAYIR
            // aynı nesne mi diye soruyorsunuz.           -->> HAYIR... biri ad1, diğeri ad2....
            // hafızadaki referanslarına bakıyor. ??? BUNU ANLAMADIM.
        }

        if (ad1.equals(ad2)){ //ikisinin içeriğinin degerleri aynı mı ? sorusunun cevabını verir.
            // ad1 in değeri ile
            // ad2 nini değeri aynı mı?
            // değerlerine bakıyor.
        }

    }
}

// if içinde yada  haricinde  == ile equals ın farkını  detayları ile ögren...

//2 defa google ana sayfa acsak ayni sayfalar ancak sayfa ID leri farkli
//ayni isimde cok insan var ama, her birisi farkli kisiler
//degerleri ayni ancak farkli nesneler