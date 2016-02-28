package jp.rild.android.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Item> mItems;
//    Item[] itemArray = new Item[2];
    CustomAdapter mAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.list_view);

        mItems = new ArrayList<>();

        Item item1 = new Item("タイトル1", "中身1");
        Item item2 = new Item("タイトル2", "中身2");
//        String title = item.title;
//        String content = item.content;

        mItems.add(item1);
        mItems.add(item2);
//        itemArray[0] = item1;
//        itemArray[1] = item2;

        mAdapter = new CustomAdapter(this, R.layout.item_main, mItems);
        mListView.setAdapter(mAdapter);


    }
}
