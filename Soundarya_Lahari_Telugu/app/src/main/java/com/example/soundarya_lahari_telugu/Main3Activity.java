package com.example.soundarya_lahari_telugu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView=(TextView)findViewById(R.id.text3);
        String para="\n  ఆది శంకరాచార్యులు జగన్మాతను స్తుతించిన అపూర్వ గ్రంథము సౌందర్యలహరి. ఇది స్తోత్రము (భక్తితో భగవంతుని కీర్తిస్తూ ఆరాధించే గాన పాఠము), మంత్రము (గురువు అనుగ్రహం పొంది నిష్టతో జపించుట వలన ప్రత్యేకమైన ప్రయోజనాలు కలిగే అక్షర సముదాయము), తంత్రము (నియమంతో శాస్త్రయుక్తంగా సాధన చేస్తే ప్రత్యేక సిద్ధులు లభించే యోగవిధానము), కావ్యము (అక్షర రమ్యతతో కూడిన ఛందో బద్ధమైన, ఇతివృత్తాత్మక రచన) కూడాను.\tదీనిని ఆనందలహరి, సౌందర్యలహరి యని రెండు భాగములుగా విభజించియున్నారు. మొదటి 41 శ్లోకములు ఆనందలహరి అని, 42 నుండి 100 శ్లోకము వరకు సౌందర్యలహరి అని చెప్పుదురు. ఇవికాక మూడు శ్లోకములు ప్రక్షిప్తములు గలవు. మొదటి శ్లోకములు కేవలం దేవీ తత్త్వ రహస్యమును స్పష్టపరచుచున్నవి. సౌందర్యలహరి అను పేరునందు సౌ, లహ, హ్రీం అను మంత్ర బీజములు ద్యోతకమగుచున్నవి.";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
