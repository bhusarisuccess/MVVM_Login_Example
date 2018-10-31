package com.example.mvvmapplication.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.mvvmapplication.BR;
import com.example.mvvmapplication.model.User;
import com.example.mvvmapplication.model.UserRegistration;

public class RegistrationViewModel extends BaseObservable {

    private UserRegistration registration;

    private String successMessage = "Registration was successful";
    private String errorMessage = "Email or Password not valid";

    @Bindable
    public String toastMessage = null;

    public RegistrationViewModel() {
        this.registration = new UserRegistration("","","","","");
    }
    public String getToastMessage() {
        return toastMessage;
    }


    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public void afterEmailTextChanged(CharSequence s) {
        registration.setEmail(s.toString());
    }

    public void afterPasswordTextChanged(CharSequence s) {
        registration.setPassword(s.toString());
    }

    public void onRegistrationClicked() {
        if (registration.isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }
}
