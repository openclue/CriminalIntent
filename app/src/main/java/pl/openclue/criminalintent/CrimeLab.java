package pl.openclue.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Daniel on 2015-03-29.
 */
public class CrimeLab {

    private static CrimeLab instance;
    private Context mAppContext;
    private ArrayList<Crime> mCrimes;

    public static CrimeLab getInstance(Context c) {
        if (instance == null) {
            instance = new CrimeLab(c);
        }
        return instance;
    }

    private CrimeLab(Context mAppContext) {
        this.mAppContext = mAppContext;
        mCrimes = new ArrayList<>();

        for (int i = 0; i < 100 ; i++) {
            Crime c = new Crime();
            c.setTitle("Crime #"+i);
            c.setSolved(i % 2 == 0);
            mCrimes.add(c);
        }
    }

    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }


}
