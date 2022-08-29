package ua.ihorbeztsennyi.analyticalTool.model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ResponseDate {

    private final String pattern = "dd.MM.yyyy";
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    private String responseData;

    public ResponseDate(String responseData) {
        this.responseData = responseData;
    }

    public Date getDate(String responseData) {
        Date parsedDate = null;
        if (responseData.isEmpty())
            return null;
        try {
            parsedDate = simpleDateFormat.parse(responseData);
        } catch (ParseException e) {
            System.out.println("Response date doesn't match the "+ "\"dd.MM.yyyy\"" );
        }
        return parsedDate;
    }
}
