package com.example.woundscanada.ui.bestPractices;
import com.example.woundscanada.R;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BestPracticesFragment extends Fragment {

    private BestPracticesViewModel mViewModel;

    public static BestPracticesFragment newInstance() {
        return new BestPracticesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.best_practices_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BestPracticesViewModel.class);
        // TODO: Use the ViewModel
    }

}
