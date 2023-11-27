package pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.Date;
@Ignore
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Datum {
    public int id;
    public boolean isRecurring;
    public String startAt;
    public String finishAt;
    public ArrayList<Object> recurringDays;
    public String specificDate;
    public boolean isAllDay;
    public String locationTitle;
}
