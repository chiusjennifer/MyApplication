package tw.edu.pu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Place place;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlaceDAO dao = new PlaceDAO(MainActivity.this);
        place  = new Place(0,123,223,0,"1234","test1");
        dao.insert(place);
        place  = new Place(0,223,223,0,"1234","test1");
        dao.insert(place);
        place  = new Place(0,323,223,0,"1234","test1");
        dao.insert(place);
        List<Place> lists= dao.getAll();
        for (Place p:lists) {
            Log.v("TAG", p.toString());
        }

    }


}