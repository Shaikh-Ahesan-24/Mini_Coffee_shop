package com.example.shop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    ArrayList<Model> list = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
       recyclerView=findViewById(R.id.recycle);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       list.add(new Model(R.drawable.cap,"Cappuccino is a an espresso-based coffee drink that is traditionally prepared with steamed milk including a layer of milk foam.variations of the drink involve the use of cream instead of milk using non dairy milk substitutes and flavoring with cocoa powder or cinnamon."));
       list.add(new Model(R.drawable.americano," A Classic Americano Call for just two ingredient a short of espresso and somewhere between eight and 12 ounces of hot water. you can also make an americano coffee with a double shot of espresso just know that you need to adjust the ratio of water accordingly to keep the drink balanced ."));
       list.add(new Model(R.drawable.machito," A macchiato is a double espresso shot, which is topped with a small amount of milk foam. The dark espresso is ‘dotted’ with light coloured foam, which is formed when milk is intensely steamed. The macchiato originates from Italy, but gets its name from the term ‘stained’, or ‘marked’ coffee."));
       list.add(new Model(R.drawable.lungo,"Lungo known in full in Italian as caffè lungo, is a coffee beverage made by using an espresso machine to make an Italian-style coffee—short black (a single espresso shot) with more water (generally twice as much), resulting in a larger coffee, a lungo."));
       list.add(new Model(R.drawable.black,"Black coffee is a beverage made from roasted coffee beans. The beans are ground and soaked in water, which releases their flavor, color, caffeine content, and nutrients. Although coffee is often served hot, it can also be served iced."));
       list.add(new Model(R.drawable.t,"Indian-Tea Tea is an aromatic beverage prepared by pouring hot or boiling water over cured or fresh leaves of Camellia sinensis, an evergreen shrub native to East Asia. It is the most widely consumed drink in the world after water1. Tea is made by infusing hot water with the dried leaves of the Camellia sinensis plant"));
       list.add(new Model(R.drawable.frappe,"The drink has many names, like Greek frappe, frappe coffee, Nescafe frappe, and simple Frappe. It is a frozen or iced coffee drink containing instant coffee, milk, water, and sugar prepared by beating, shaking, or blending these ingredients in a cocktail shaker, milkshake machine, or electric milk frother.Frappe is a French word that loosely means a drink chilled with ice. In the 19th century, in the absence of any clear distinction, many iced cold coffee drinks and slushes were called Frappes."));
       list.add(new Model(R.drawable.ristretto,"Ristretto known in full in Italian as caffè ristretto, is a short shot (20 ml (0.7 imp fl oz; 0.7 US fl oz) from a double basket) of a highly concentrated espresso coffee. It is made with the same amount of ground coffee, but extracted (also in from 20 to 30 seconds) using half as much water. "));
       list.add(new Model(R.drawable.aff,"Affogato is a hot and cold delicacy1that originated in Italy21. It is a rich, creamy blend of two very different flavours1. The word “affogato” means drowned in Italian, in reference to the shot of hot espresso that is poured over the scoop of ice cream or gelato2. While the recipe of the affogato is more or less standard in Italy, consisting of a scoop of vanilla gelato topped with a shot of espresso, variations exist in European and American restaurant"));
       Contact adapter = new Contact(this,list);
       recyclerView.setAdapter(adapter);
    }
}