package com.example.mvvmapplication.views;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvvmapplication.R;
import com.example.mvvmapplication.databinding.ActivitySignupBinding;
import com.example.mvvmapplication.model.UserRegistration;
import com.example.mvvmapplication.viewmodels.RegistrationViewModel;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySignupBinding signupBinding = DataBindingUtil.setContentView(this,R.layout.activity_signup);
        signupBinding.setSignup(new RegistrationViewModel());
        signupBinding.executePendingBindings();

    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
