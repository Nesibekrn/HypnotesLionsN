package pojos;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Ignore;

import java.util.ArrayList;
@Ignore
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Root {

    public boolean status;
    public ArrayList<Datum> data;
}
