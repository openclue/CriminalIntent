package pl.openclue.criminalintent;

/**
 * Created by Daniel on 2015-04-05.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected android.support.v4.app.Fragment createFragment() {
        return new CrimeListFragment();
    }
}
