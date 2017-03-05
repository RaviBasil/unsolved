package mit.basil.ravi.unsolved;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mit.basil.ravi.unsolved.civil.CivilFragment;
import mit.basil.ravi.unsolved.cse.CSEFragment;
import mit.basil.ravi.unsolved.ece.ECEFragment;
import mit.basil.ravi.unsolved.ee.EEFragment;
import mit.basil.ravi.unsolved.me.MEFragment;

public class TabActivity extends AppCompatActivity {


    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items = 5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        /**
                  *Set an Apater for the View Pager
                  */
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));

        /**
                  * Now , this is a workaround ,
                  * The setupWithViewPager dose't works without the runnable .
                  * Maybe a Support Library Bug .
                  */

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
    }

    class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
                  * Return fragment with respect to Position .
                  */

        @Override
        public Fragment getItem(int position)
        {
            switch (position){
                case 0 : return new CSEFragment();
                case 1 : return new ECEFragment();
                case 2 : return new MEFragment();
                case 3: return new CivilFragment();
                case 4: return new EEFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return int_items;
        }
        /**
                  * This method returns the title of the tab according to the position.
                  */

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position){
                case 0 :
                    return "CS";

                case 1 :
                    return "EC";

                case 2 :
                    return "ME";

                case 3:
                    return "CE";

                case 4:
                    return "EE";

            }
            return null;
        }
    }

}
