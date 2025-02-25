package utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class dataProvider {

    public String path1 = System.getProperty("user.dir")+"\\src\\testData\\DCcolleagueData.xlsx";
    public String path2 = System.getProperty("user.dir")+"\\src\\testData\\TransferAColleague.xlsx";
    public String path3 = System.getProperty("user.dir")+"\\src\\testData\\setTerminationDate.xlsx";
    public String path4 = System.getProperty("user.dir")+"\\src\\testData\\cancelledLeaverData.xlsx";
    public String path5 = System.getProperty("user.dir")+"\\src\\testData\\ROIColleagueData.xlsx";

    public excelUtility eutil;
    public int totalRow;
    public int totalColumns;


    @DataProvider(name="dp1")
    public Object[][] getColleagueData() throws IOException {

        eutil = new excelUtility();
        totalRow = eutil.getTotalRows(this.path1,"Sheet1");
        totalColumns = eutil.getTotalColumns(this.path1,"Sheet1",1);
        String dataArray[][]= new String[totalRow][totalColumns];

        for(int i=1;i<=totalRow;i++){
            for(int j=0;j<totalColumns;j++){
                 dataArray[i-1][j] = eutil.getCellValue(this.path1,"Sheet1",i,j);
            }
        }
        return dataArray;
    }

    @DataProvider(name="dp2")
    public Object[][] getColleagueDataForTransfer() throws IOException {
        eutil = new excelUtility();
        totalRow = eutil.getTotalRows(this.path2,"Sheet1");
        totalColumns=eutil.getTotalColumns(this.path2,"sheet1",1);
        String dataArray[][] = new String[totalRow][totalColumns];
        for(int i=1;i<=totalRow;i++){
            for(int j=0;j<totalColumns;j++){
                dataArray[i-1][j]= eutil.getCellValue(this.path2,"Sheet1",i,j);
            }
        }
        return dataArray;
    }

    @DataProvider(name="dp3")
    public Object[][] setLeavingDate() throws IOException {
        eutil = new excelUtility();
        totalRow = eutil.getTotalRows(this.path3,"Sheet1");
        totalColumns = eutil.getTotalColumns(this.path3,"Sheet1",1);
        String dataArray[][] = new String[totalRow][totalColumns];

        for(int i =1; i<=totalRow;i++){
            for(int j =0;j<totalColumns;j++){
               dataArray[i-1][j] = eutil.getCellValue(this.path3,"Sheet1",i,j);
            }
        }
        return dataArray;


    }

    @DataProvider(name="dp4")
    public Object[][]  enterEmpNoForCancelledLeaver() throws IOException {
        eutil = new excelUtility();
        totalRow= eutil.getTotalRows(this.path4,"Sheet1");
        totalColumns = eutil.getTotalColumns(this.path4,"Sheet1",1);

        String dataArray [][] = new String[totalRow][totalColumns];
        for(int i=1;i<=totalRow;i++){
            for(int j =0; j<totalColumns;j++){
                dataArray[i-1][j]= eutil.getCellValue(this.path4,"Sheet1",i,j);
            }
        }
        return dataArray;

    }

    @DataProvider(name="dp5")
    public Object[][] hireAnROIColleague() throws IOException {
        eutil = new excelUtility();
        totalRow = eutil.getTotalRows(this.path5,"Sheet1");
        totalColumns = eutil.getTotalColumns(this.path5,"Sheet1",1);

        String dataArray[][] = new String[totalRow][totalColumns];
        for(int i = 1;i<=totalRow;i++){
            for(int j =0;j<totalColumns;j++){
                dataArray[i-1][j] = eutil.getCellValue(this.path5,"Sheet1",i,j);
            }
        }
        return dataArray;
    }

}
