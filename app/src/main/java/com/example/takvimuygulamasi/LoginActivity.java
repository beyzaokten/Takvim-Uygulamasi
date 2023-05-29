package com.example.takvimuygulamasi;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class LoginActivity extends AppCompatActivity {

    private EditText mEditTextName;
    private EditText mEditTextSurname;
    private EditText mEditTextUsername;
    private EditText mEditTextPassword;
    private EditText mEditTextIDNumber;
    private EditText mEditTextPhoneNumber;
    private EditText mEditTextEmail;
    private EditText mEditTextAddress;
    private RadioGroup mRadioGroupGender;
    private RadioButton mRadioButtonMale;
    private RadioButton mRadioButtonFemale;
    private Button mButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Butonlar
        mEditTextName = findViewById(R.id.editText_name);
        mEditTextSurname = findViewById(R.id.editText_surname);
        mEditTextUsername = findViewById(R.id.editText_username);
        mEditTextPassword = findViewById(R.id.editText_password);
        mEditTextIDNumber = findViewById(R.id.editText_id_number);
        mEditTextPhoneNumber = findViewById(R.id.editText_phone_number);
        mEditTextEmail = findViewById(R.id.editText_email);
        mEditTextAddress = findViewById(R.id.editText_address);
        mRadioGroupGender = findViewById(R.id.radiogroup_gender);
        mRadioButtonMale = findViewById(R.id.radioButton_male);
        mRadioButtonFemale = findViewById(R.id.radioButton_female);
        mButtonLogin = findViewById(R.id.button_login);


        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Kullanıcı girişi alma
                String name = mEditTextName.getText().toString().trim();
                String surname = mEditTextSurname.getText().toString().trim();
                String username = mEditTextUsername.getText().toString().trim();
                String password = mEditTextPassword.getText().toString().trim();
                String idNumber = mEditTextIDNumber.getText().toString().trim();
                String phoneNumber = mEditTextPhoneNumber.getText().toString().trim();
                String email = mEditTextEmail.getText().toString().trim();
                String address = mEditTextAddress.getText().toString().trim();
                String gender = "";
                int selectedId = mRadioGroupGender.getCheckedRadioButtonId();
                if (selectedId == R.id.radioButton_male) {
                    gender = "Male";
                } else if (selectedId == R.id.radioButton_female) {
                    gender = "Female";
                }

                // Boş olup olmadıklarını kontrol et
                if (TextUtils.isEmpty(name)) {
                    mEditTextName.setError("Lütfen adınızı girin!");
                    mEditTextName.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(surname)) {
                    mEditTextSurname.setError("Lütfen soyadınızı girin!");
                    mEditTextSurname.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(username)) {
                    mEditTextUsername.setError("Lütfen kullanıcı adınızı girin!");
                    mEditTextUsername.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    mEditTextPassword.setError("Lütfen şifrenizi girin!");
                    mEditTextPassword.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(idNumber)) {
                    mEditTextIDNumber.setError("Lütfen kimlik numaranızı girin!");
                    mEditTextIDNumber.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(phoneNumber)) {
                    mEditTextPhoneNumber.setError("Lütfen telefon numaranızı girin!");
                    mEditTextPhoneNumber.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(email)) {
                    mEditTextEmail.setError("Lütfen emailnizi girin!");
                    mEditTextEmail.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(address)) {
                    mEditTextAddress.setError("Lütfen adresinizi girin!");
                    mEditTextAddress.requestFocus();
                    return;
                }

                // Geçerli bilgiyse kullanıcı yarat


                // Datebase kaydetme yeri



                Toast.makeText(getApplicationContext(), "Kulanıcı oluşturuldu", Toast.LENGTH_SHORT).show();
                finish();

            }
        });

        // Login butonuyla takvim sayfasına geçiş
        Button loginButton = findViewById(R.id.button_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MyTag", "Debug message");
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}