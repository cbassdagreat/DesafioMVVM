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
            case 1: p = new Password(getApplication().getString(R.string.media),getApplication().getColor(R.color.c_media)); break;
            case 2: p = new Password(getApplication().getString(R.string.fuerte),getApplication().getColor(R.color.c_fuerte)); break;
            case 3: p = new Password(getApplication().getString(R.string.super_fuerte),getApplication().getColor(R.color.c_sfuerte));
            default: p = new Password(getApplication().getString(R.string.debil),getApplication().getColor(R.color.c_debil));
        }
        passwordMutable.setValue(p); //ESTE MOMENTO HACE TRIGGER EL OBSERVABLE
    }


}





