package testBase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class baseClass {

   public static WebDriver driver;
   public Properties propertiesObj;
   public String date3;



public WebDriver wait;

    @BeforeClass
  public void setUp() throws IOException, InterruptedException {


        propertiesObj = new Properties();
        FileInputStream propertiesFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
        propertiesObj.load(propertiesFile);
      driver=new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.get(propertiesObj.getProperty("test5url"));
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

  }

    public String convertTheString(String s){

        String string1 = s.substring(0,1);
        String string2 = s.substring(2,s.length()-2);
        String string3 =string1+string2;
        return string3;
    }

    public String dateConversion(String date){

        String date2 = date.replace("-","/");
        String datePart = date2.substring(3,date2.length()-5);
        if(date.contains("Jan")){
            this.date3 = date2.replaceAll(datePart,"01");
        }

        if(date.contains("Feb")){
            this.date3 = date2.replaceAll(datePart,"02");
        }

        if(date.contains("Mar")){
            this.date3 = date2.replaceAll(datePart,"03");

        }
        if(date.contains("Apr")){
            this.date3 = date2.replaceAll(datePart,"04");

        }
        if(date.contains("May")){
            this.date3 = date2.replaceAll(datePart,"05");

        }

        if(date.contains("Jun")){
            this.date3 = date2.replaceAll(datePart,"06");

        }

        if(date.contains("Jul")){
            this.date3 = date2.replaceAll(datePart,"07");

        }
        if(date.contains("Aug")){
            this.date3 = date2.replaceAll(datePart,"08");

        }
        if(date.contains("Sep")){
            this.date3 = date2.replaceAll(datePart,"09");

        }

        if(date.contains("Oct")){
            this.date3 = date2.replaceAll(datePart,"10");

        }

        if(date.contains("Nov")) {
            this.date3 = date2.replaceAll(datePart, "11");

        }

        if (date.contains("Dec")) {
            this.date3 = date2.replaceAll(datePart, "12");

        }

        return this.date3;


        }

    public String convertedPost(String post){
        String post1=post.substring(0,post.length()-2);
        return post1;
    }

    public String captureScreenForFailure(String tname) {
        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot)driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        String targetfilePath = System.getProperty("user.dir")+"\\src\\test\\screenshots\\failedSnaps\\"+tname+"_"+timeStamp+".png";
        File targetFile = new File(targetfilePath);
        sourceFile.renameTo(targetFile);
        return targetfilePath;
    }

    public void captureScreen(String tname) {
        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot)driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        String targetfilePath = System.getProperty("user.dir")+"\\src\\test\\screenshots\\colleagueHires\\"+tname+"_"+timeStamp+".png";
        File targetFile = new File(targetfilePath);
        sourceFile.renameTo(targetFile);
    }




@AfterClass
 public void TearDown(){
 driver.quit();
 }
}











