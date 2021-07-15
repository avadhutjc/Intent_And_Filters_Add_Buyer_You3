package com.masai.a530june_intent_and_filters_add_buyer_you3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BuyerDetails extends AppCompatActivity {

    private TextView CustomerName;
    private TextView mobileNumber;
    private TextView Address;
    private TextView email;
    private TextView taxId;
    private TextView companyId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buyers_details);
        initViews();
        if (getIntent() != null) {
            String nameCustomer = getIntent().getStringExtra("customerName");
            CustomerName.setText(nameCustomer);

            String number = getIntent().getStringExtra("phoneNumber");
            mobileNumber.setText(number);

            String companyId1 = getIntent().getStringExtra("companyId");
            companyId.setText(companyId1);

            String address = getIntent().getStringExtra("address");
            Address.setText(address);

            String emailId = getIntent().getStringExtra("emailId");
            email.setText(emailId);

            String taxId1 = getIntent().getStringExtra("taxId");
            taxId.setText(taxId1);

        }
    }

    private void initViews() {
        CustomerName = findViewById(R.id.customerName);
        mobileNumber = findViewById(R.id.mobileNumber);
        Address = findViewById(R.id.Address);
        email = findViewById(R.id.emailId);
        taxId = findViewById(R.id.taxId);
        companyId = findViewById(R.id.Company);
    }
}