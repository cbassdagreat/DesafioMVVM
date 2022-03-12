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
    private int cont = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(PasswordViewModel.class);
        setContentView(binding.getRoot());
        binding.setLifecycleOwner(this);


        String password = binding.etPass.getText().toString();
        //viewModel.

        binding.etPass.addTextChangedListener((new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String pass = s.toString();
                //viewModel.hasCaps(pass, binding.etPass, g);
                //viewModel.hasLength(pass, binding.etPass,;
                //viewModel.hasNum(pass,binding.etPass,getContext());



            }
        }));


    }

    public void security(int cont) {
        if (cont == 0) {
            binding.tvPassStrength.setText(R.string.debil);
            binding.tvPassStrength.setBackgroundColor(Color.RED);

        }else if (cont == 1){
            binding.tvPassStrength.setText(R.string.media);
            binding.tvPassStrength.setBackgroundColor(Color.MAGENTA);

        }else if (cont == 2) {
            binding.tvPassStrength.setText(R.string.fuerte);
            binding.tvPassStrength.setBackgroundColor(Color.YELLOW);
        }
        else {
            binding.tvPassStrength.setText(R.string.super_fuerte);
            binding.tvPassStrength.setBackgroundColor(Color.GREEN);
        }

    }



}