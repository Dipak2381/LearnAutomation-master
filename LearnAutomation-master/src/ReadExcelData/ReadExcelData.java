package ReadExcelData;

/**
 * @ author Jay Vaghani on 19/04/2017.
 */
public class ReadExcelData
{
    public static void main(String[] args) {

        ExcelDataConfig excel = new ExcelDataConfig("D:\\Excel");
        System.out.println(excel.getData(1,0,1));
    }
}
