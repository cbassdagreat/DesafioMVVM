package cbassdagreat.github.desafiomvvm.modelo;

import android.widget.TextView;

public class Password {

    private String password;
    private int color;

    public Password(String password, int color) {
        this.password = password;
        this.color = color;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
