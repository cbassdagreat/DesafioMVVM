package cbassdagreat.github.desafiomvvm.viewmodel;

import android.app.Application;
import android.graphics.Color;
import android.util.AndroidException;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import cbassdagreat.github.desafiomvvm.R;
import cbassdagreat.github.desafiomvvm.modelo.Password;
import cbassdagreat.github.desafiomvvm.util.Verify;

public class PasswordViewModel extends AndroidViewModel {
    private MutableLiveData<Password> passwordMutable = new MutableLiveData<>();
    private Verify verifier = new Verify();

    public PasswordViewModel(@NonNull Application application) {

        super(application);

    }

    public MutableLiveData<Password> getPasswordMutable() {
        return passwordMutable;
    }

    public void analysis(String pass) {

        int v = verifier.evaluate(pass);
        Password p;
        switch(v) {
            case 1: p = new Password(getApplication().getString(R.string.debil),getApplication().getColor(R.color.c_letras)); break;
            case 2: p = new Password(getApplication().getString(R.string.numeros),getApplication().getColor(R.color.c_numeros)); break;
            default: p = new Password(getApplication().getString(R.string.mixto),getApplication().getColor(R.color.c_mixto));
        }
        passwordMutable.setValue(p); //ESTE MOMENTO HACE TRIGGER EL OBSERVABLE
    }


}





