package jp.rild.android.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Item> items;
//    Item[] itemArray = new Item[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();

        Item item1 = new Item("タイトル1", "中身1");
        Item item2 = new Item("タイトル2", "中身2");
//        String title = item.title;
//        String content = item.content;

        items.add(item1);
        items.add(item2);
//        itemArray[0] = item1;
//        itemArray[1] = item2;


    }
}
