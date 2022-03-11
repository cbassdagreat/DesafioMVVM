package cbassdagreat.github.desafiomvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

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
        setContentView(R.layout.activity_main);
        binding.setLifecycleOwner(this);

        String password = binding.etPass.getText().toString();
        //viewModel.



    }


}