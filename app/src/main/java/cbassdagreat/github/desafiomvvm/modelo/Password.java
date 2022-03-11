package cbassdagreat.github.desafiomvvm.modelo;

import android.widget.TextView;

public class Password {

    private String password;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "passStark{" +
                "password='" + password + '\'' +
                '}';
    }
}
