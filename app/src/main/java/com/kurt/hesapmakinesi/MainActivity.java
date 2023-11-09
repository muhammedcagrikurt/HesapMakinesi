package com.kurt.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.kurt.hesapmakinesi.databinding.ActivityMainBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    String[] sayidizi ;
    private String sayiler ="",sonuceski="";
    double sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonAC.setOnClickListener(view -> {
            sayiler="";
            binding.editTextSonuc.setText(sayiler);

        });

        binding.buttonTopla.setOnClickListener(view -> {
            sayiler+=binding.buttonTopla.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.buttonSonuc.setOnClickListener(view -> {
           sayidizi = Arrays.copyOf(sayiler.split("\\+"),sayiler.split("\\+").length);

            for (String s:sayidizi) {
                sonuc+=Double.parseDouble(s);
            }



            binding.textViewEskiSonuc.setText(""+sonuceski);
            binding.editTextSonuc.setText(""+sonuc);
            sonuceski=""+sonuc;
            sonuc=0;
            sayiler="";
        });

        binding.button9.setOnClickListener(view -> {
            sayiler+=binding.button9.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.button8.setOnClickListener(view -> {
            sayiler+=binding.button8.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.button7.setOnClickListener(view -> {
            sayiler+=binding.button7.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.button6.setOnClickListener(view -> {
            sayiler+=binding.button6.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.button5.setOnClickListener(view -> {
            sayiler+=binding.button5.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.button4.setOnClickListener(view -> {
            sayiler+=binding.button4.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.button3.setOnClickListener(view -> {
            sayiler+=binding.button3.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.button2.setOnClickListener(view -> {
            sayiler+=binding.button2.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.button1.setOnClickListener(view -> {
            sayiler+=binding.button1.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.button0.setOnClickListener(view -> {
            sayiler+=binding.button0.getText();
            binding.editTextSonuc.setText(sayiler);
        });

        binding.buttonVirgul.setOnClickListener(view -> {
            sayiler+=".";
            binding.editTextSonuc.setText(sayiler);
        });

















    }
}