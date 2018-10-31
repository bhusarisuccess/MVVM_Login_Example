package com.example.mvvmapplication.views;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvvmapplication.R;
import com.example.mvvmapplication.databinding.ActivityLoginBinding;
import com.example.mvvmapplication.viewmodels.LoginViewModel;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "State changed";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLoginBinding loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        loginBinding.setViewModel(new LoginViewModel());
        loginBinding.executePendingBindings();

    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }


}

