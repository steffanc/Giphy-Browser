package com.giphy.browser.main;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.giphy.browser.Repository;

public class MainViewModelFactory implements ViewModelProvider.Factory {
    private final Repository repository;

    public MainViewModelFactory(Repository repository) {
        this.repository = repository;
    }

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MainViewModel(repository);
    }
}