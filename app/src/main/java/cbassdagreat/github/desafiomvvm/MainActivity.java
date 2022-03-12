package cbassdagreat.github.desafiomvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import cbassdagreat.github.desafiomvvm.databinding.ActivityMainBinding;
import cbassdagreat.github.desafiomvvm.viewmodel.PasswordViewModel;

public class MainActivity extends AppCompatActivity {

    private PasswordViewModel viewModel;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(PasswordViewModel.class);
        setContentView(binding.getRoot());
        binding.setLifecycleOwner(this);
        binding.etPass.addTextChangedListener((new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    viewModel.analysis(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        }));




    }



    }



}