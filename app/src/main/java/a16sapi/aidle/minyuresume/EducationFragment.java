package a16sapi.aidle.minyuresume;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A fragment class for Education tab
 *
 * Created by Pureblue on 8/25/16.
 *
 */
public class EducationFragment extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.education, container, false);
        return view;
    }
}
