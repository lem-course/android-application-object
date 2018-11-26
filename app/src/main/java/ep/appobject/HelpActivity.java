package ep.appobject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        display = findViewById(R.id.display);

        // TODO: Preberite ime iz objekta aplikacije in ga napisite TextView display
    }
}
