package M1W4D1_G16_RobotClass;

import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _4_Robot_ctrl_s extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException, InterruptedException {

        driver.get("http://demo.guru99.com/test/upload/");

        Robot rbt=new Robot();

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_S);

        Thread.sleep(2000);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_S);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);  // VK:: virtual Key
        //şu anda indirilenlerde var...

        /*
        rbt.keyPress(KeyEvent.VK_LEFT);
        rbt.keyPress(KeyEvent.VK_ENTER);

        rbt.keyRelease(KeyEvent.VK_LEFT);
        rbt.keyRelease(KeyEvent.VK_ENTER);


         */

        rbt.keyPress(KeyEvent.VK_LEFT);
        rbt.keyRelease(KeyEvent.VK_LEFT);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);



    }
}
