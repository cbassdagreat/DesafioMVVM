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
            return 0;
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
            }
            else
            {
                break;
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
            }

            else
            {
                break;
            }
        }
        return total == pass.length();

    }

    public boolean hasLength(String pass) {
        int total = 0;
           if (pass.length() <= 5) {
                total++;
            }
           else
           {
               total = total + 0;
           }
            return total == pass.length();
        }

    }


