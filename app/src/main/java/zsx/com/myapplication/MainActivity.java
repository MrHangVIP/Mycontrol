package zsx.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PinnedHeaderListView view=(PinnedHeaderListView)findViewById(R.id.listview);

        view.setAdapter(new TestSectionedAdapter());

        MyCusExpandableListView listView=(MyCusExpandableListView)findViewById(R.id.expandListView);
        listView.setAdapter(new FileListAdapter(this));
    }
}
