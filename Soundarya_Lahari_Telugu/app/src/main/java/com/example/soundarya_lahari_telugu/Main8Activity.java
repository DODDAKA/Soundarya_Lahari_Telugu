package com.example.soundarya_lahari_telugu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        textView=(TextView)findViewById(R.id.text8);
        String para="DODDAKA NAVEEN KUMAR\n"+"  https://dnkunknown.wordpress.com/" +"\n"+

                "    సౌందర్య లహరి శంకరాచార్యుల వారిచే రాయబడ్డ ఒక అద్భుతమైన గ్రంధం. ఈ గ్రంధాన్ని గనుక క్షుణ్ణంగా అర్ధం చేసుకొని చదువగలిగితే మనం విశ్వ రహస్యాలను అలాగే ఆత్మ మరియు పరమాత్మ మధ్య తేడాలను తెలుకొగలం...అలాగే శాస్త్ర విజ్ఞానానికి అంతు చిక్కని విశ్వ ఆవిర్భావం గురించి కూడా తెలుసుకోగలమని నా అభిప్రాయం.\n" +
                "    ఈ యాప్ ద్వారా అందించిన సమాచారం అంతర్జాలం నుంచి గ్రహించినది మాత్రమే దీనిలో నా ప్రమేయం ఏమియును లేదు...కేవలం మన సంస్కృతి సాంప్రదాయాల మీద ఉన్న మక్కువ నన్ను ఈ యాప్ తయారు చేసేలా చేసింది.. ";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
