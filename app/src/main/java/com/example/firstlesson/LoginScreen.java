package com.example.firstlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen2);
        EditText login_screen = findViewById(R.id.et_username);
        TextView login_button = findViewById(R.id.tv_button);
        //login_button.setOnClickListener(view -> {
        //  findVowels(login_screen.getText().toString())});

        login_button.setOnClickListener(view -> {
            findVowels(login_screen.getText().toString());
        });
//        AppCompatButton bt_signup = findViewById(R.id.bt_signup);
//        bt_signup.setOnClikListener(view -> {
//            Intent navigation = new Intent(
//                    LoginScreen.this,RegistrationScreen.class
//            );
//            startActivity(navigation);
//        });
    }

    private void findVowels(String str) {
       /* System.out.println(stringContains(str));


    }

    public static boolean
    stringContains(String vowels) {

        return vowels.toLowerCase().matches("[aeiou]");
    }*/ int nonvowel_count = 0;
        int vowel_count = 0;
        // String str="interesting";
        for (int i = 0; i < str.length(); i++) {//lets string be split into switch
            //System.out.println(str.charAt(i));
            if (str.charAt(i) == 'e') {
                vowel_count = vowel_count+1;
                System.out.println("Contains e");
            } else if (str.charAt(i) == 'o') {
                vowel_count = vowel_count+1;
                System.out.println("Contains o");
            } else if (str.charAt(i) == 'u') {
                vowel_count = vowel_count+1;
                System.out.println("Contains u");
            } else if (str.charAt(i) == 'a') {
                vowel_count = vowel_count+1;
                System.out.println("Contains a");
            } else if (str.charAt(i) == 'i') {
                vowel_count = vowel_count+1;
                System.out.println("Contains i");
            }
            else {
                nonvowel_count =nonvowel_count+1;
            }
        }
        System.out.println("The amount of vowels in " +str+ " " +vowel_count +"the amount of non-vowels is "+ nonvowel_count);
    }
}

