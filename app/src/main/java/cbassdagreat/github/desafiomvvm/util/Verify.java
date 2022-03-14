package cbassdagreat.github.desafiomvvm.util;

public class Verify {

    public int evaluate(String password)
    {

        boolean num = hasNum(password);
        boolean caps = hasCaps(password);
        boolean length = hasLength(password);

        if (num || caps || length)
        {
            return 1;
        }
        else if (caps && num)
        {
            return 2;
        }
        else if(caps && num && length)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }


    private boolean hasCaps(String pass)
    {
        int total = 0;
        for (char letra : pass.toCharArray())
        {
            if (Character.isUpperCase(letra))
            {
                total++;
                return true;
            }
            else
            {
                return false;
            }
        }
        return total == pass.length();
    }

    public boolean hasNum(String pass) {

        int total = 0;

        for (char letra : pass.toCharArray())
        {
            if (Character.isDigit(letra))
            {
                total++;
                return true;
            }

            else
            {
                return false;
            }
        }
        return total == pass.length();

    }

    public boolean hasLength(String pass) {
        int total = 0;
           if (pass.length() <= 5) {
                total++;
                return true;
            }
           else
           {
               return false;
           }
    }

    }


