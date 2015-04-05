package pl.openclue.criminalintent;

import android.app.Fragment;

/**
 * Created by Daniel on 2015-04-05.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
