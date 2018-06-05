package arcinc.eveforeman.fragments.mining.calculators;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import arcinc.eveforeman.R;

/**
 * Created by Mads Stege on 24-05-2018.
 */
public class RefiningYieldFragment extends Fragment {


    Spinner spinnerReprocessingLevel, spinnerReprocessingEfficiency, spinnerSpecificOreLevel;

    int reprocessingLevel, reprocessingEffeciencyLevel, specificOreSkill;
    int[] reprocessingSkillLevel, reprocessingEffeciencySkillLevel, specificOreSkillLevel = {0, 1, 2, 3, 4, 5};

    String[] availableMetals = {"Arkonor", "Bistot", "Crokite", "Dark Ochre", "Gneiss",
            "Hedbergite", "Hemorphite", "Jaspet", "Kernite", "Mercoxit", "Omber", "Plagioclase",
            "Pyroxeres", "Scordite", "Spodumain", "Veldspar"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_reprocessing, container, false);

        spinnerReprocessingLevel = (Spinner) root.findViewById(R.id.spinnerReprocessingLevel);
        spinnerReprocessingEfficiency = (Spinner) root.findViewById(R.id.spinnerReprocessingEfficiencyLevel);
        spinnerSpecificOreLevel = (Spinner) root.findViewById(R.id.spinnerSpecificOreLevel);


        ArrayAdapter adapterReprocessingLevel = new ArrayAdapter(getActivity(), reprocessingLevel);
        spinnerReprocessingLevel.setAdapter(adapterReprocessingLevel);
        spinnerReprocessingLevel.setPrompt("Select your level.");

        return root;

    }
}
