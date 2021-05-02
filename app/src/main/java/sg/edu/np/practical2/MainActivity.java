package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User userObj = new User();
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userObj.followed == false) {
                    userObj.followed = true;
                    button.setText("Unfollow");
                }
                else if (userObj.followed == true) {
                    userObj.followed = false;
                    button.setText("Follow");
                }
            }
        });
    }
}