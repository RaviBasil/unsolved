package mit.basil.ravi.unsolved.ee;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mit.basil.ravi.unsolved.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EEFragment extends Fragment {


    public EEFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ee, container, false);
    }

}
