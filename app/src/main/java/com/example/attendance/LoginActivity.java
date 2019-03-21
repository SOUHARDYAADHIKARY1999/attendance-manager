package com.example.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    Button login;
    EditText username,password;
    String userrole="admin";

    private String[] userRoleString =new String[] {"admin","faculty"};

    @Override
    public void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.login);

        login=(Button)findViewById(R.id.loginbutton);
        username=(EditText)findViewById(R.id.e_mail);
        password=(EditText)findViewById(R.id.password);
        login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userrole.equals("admin")){
                    String user_name=username.getText().toString();
                    String pass_word=password.getText().toString();
                    if(TextUtils.isEmpty(user_name)){
                        username.setError("Please enter a valid email-address");
                    }
                    if(TextUtils.isEmpty(pass_word)){
                        password.setError("Invalid password");
                    }
                    else{
                        if (user_name.equals("souhardya1999") & pass_word.equals("123")){
                            Intent intent=new Intent(LoginActivity.this,MenuActivity.class);
                            startActivity(intent);
                            Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"Login failed",Toast.LENGTH_SHORT).show();
                        }
                    }

                }

            }
        });


    }
}
