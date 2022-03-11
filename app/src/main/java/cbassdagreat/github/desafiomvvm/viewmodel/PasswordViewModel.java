package cbassdagreat.github.desafiomvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import cbassdagreat.github.desafiomvvm.modelo.Password;

public class PasswordViewModel extends ViewModel {
    private MutableLiveData<Password> passwordMutable = new MutableLiveData<>();
    private MutableLiveData<Integer> toast = new MutableLiveData<>();

    public boolean hasCaps(String pass) {

        for (int i = 0; i < pass.length(); i++)
        {
            if (Character.isUpperCase(pass.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean hasNum(String pass) {

        for (int i = 0;i<pass.length();i++){
            if (Character.isDigit(pass.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean hasLength(String pass) {
            boolean aux;
            if (pass.length() <=5) {
                aux = false;
            } else{
                aux = true;
            }
        return aux;
    }

}
