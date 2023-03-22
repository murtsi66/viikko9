package joojootottakai.olioviikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }

    public void AddUser(View view)  {
        EditText editFirstName = findViewById(R.id.txtEditFirstName);
        EditText editLastName = findViewById(R.id.txtEditLastName);
        EditText editEmail = findViewById(R.id.txtEditEmail);
        RadioGroup editDegree = findViewById(R.id.rdEditDegree);
        RadioButton selectedDegree = findViewById(editDegree.getCheckedRadioButtonId());
        RadioGroup userImage = findViewById(R.id.rdImage);


        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();
        String email = editEmail.getText().toString();
        String degreeProgram = selectedDegree.getText().toString();
        int image = R.drawable.norsu;
        switch (userImage.getCheckedRadioButtonId())  {
            case R.id.rbNorsu:
                image = R.drawable.norsu;
                break;
            case R.id.rbPossu:
                image = R.drawable.possu;
                break;
            case R.id.rbLammas:
                image = R.drawable.lammas;
                break;
        }

        User user = new User(firstName, lastName, email, degreeProgram, image);
        UserStorage.getInstance().addUser(user);

    }
}