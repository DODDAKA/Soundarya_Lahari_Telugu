package com.example.soundarya_lahari_telugu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView=(TextView)findViewById(R.id.text4);
        String para="\n శంకరాచార్యుల అనేక స్తోత్రాలలో శినస్తోత్రంగా శివానందలహరి, దేవీస్తోత్రంగా \"సౌందర్యలహరి\" చాలా ప్రసిద్ధాలు. త్రిపుర సుందరి అమ్మవారిని స్తుతించే స్తోత్రం గనుక ఇది సౌందర్యలహరి అనబడింది. ఈ స్తోత్రం \"శిఖరిణీవృత్తం\" అనే ఛందస్సులో ఉంది. సౌందర్య లహరిలో నాలుగు ప్రధానమైన లక్షణాలు ప్రస్ఫుటంగా కనిపిస్తాయి.[1]\n" +
                "\n" +
                "ఇది అసామాన్యమైన వర్ణనా చాతుర్యంతో కూడిన కావ్యం.\n" +
                "ఇది ఒక దివ్య మహిమాన్విత స్తోత్రం\n" +
                "ఉపాసకులు దేవిని ఆరాధించడానికి ఉపయోగకరమైన అనేక మంత్రాలు నిక్షిప్తమైన మంత్రమాల. ఈ మంత్రాలకు ఫలసిద్ధులను వ్యాఖ్యాతలు తెలియబరచారు.\n" +
                "ఆగమ తంత్రాలను విశదీకరించే, శ్రీవిద్యను వివరించే తంత్ర గ్రంథం. ఇందులో మొదటి 41 శ్లోకాలు శ్రీవిద్యను వివరిస్తాయి.\n" +
                "\n" +
                "స్తోత్రంలో మొదటి 41 శ్లోకాలు \"ఆనంద లహరి\" అని, తరువాతవి దేవీ సౌందర్యాన్ని కీర్తించే \"సౌందర్య లహరి\" అని అంటారు కాని ఈ విభజనను కొందరు వ్యాఖ్యాతలు అంగీకరించరు. భారతదేశంలో సౌందర్య లహరికి ఇంచుమించు 50 వ్యాఖ్యానాలున్నాయని తెలుస్తున్నది. లక్ష్మీధరుడు, భాస్కరరరాయుడు, కామేశ్వర సూరి, అచ్యుతానందుడు మొదలైనవారు ముఖ్య భాష్యకర్తలు. \"Serpent Power\" (\"కుండలినీ శక్తి\") అనే పేరు మీద \"ఆనందలహరి\" అనబడే భాగానికి మాత్రం \"ఆర్థర్ ఎవలాన్\" అనే ఆంగ్లేయుడు వ్యాఖ్యను వ్రాశాడు. \"శ్రీరామ కవి\" అనే పండితుడు \"డిండిమ భాష్యము\" అనే భాష్యాన్ని వ్రాశాడు. శ్రీ నరసింహ స్వామి అనే పండితుడు \"గోపాల సుందరీయము\" అనే వ్యాఖ్యలో ప్రతి శ్లోకాన్ని శక్తిపరంగాను, విష్ణుపరంగాను కూడా వ్యాఖ్యానించాడు. తుమ్మలపల్లి రామలింగేశ్వరరావు \"శ్రీచక్ర విలసనము\" అనే వ్యాఖ్యను వ్రాశాడు.[1]\n" +
                "\n" +
                "\n" +
                "అన్ని మంత్ర స్తోత్రాలలాగానే ఈ స్తోత్రాన్ని కూడా జపించడానికి ముందుగా గురువును స్మరించాలి. తరువాత ఋష్యాదులను (స్తోత్రము, ఋషి, ఛందస్సు, దేవత, బీజము, శక్తి, కీలకము, అర్ధము, వినియోగము) స్మరించాలి. పిదప అంగన్యాసము, కరన్యాసము, ధ్యానము, పంచోపచారాదులు చేయాలి. తరువాత శ్రద్ధతో, భక్తితో, నిర్మల నిశ్చల హృదయంతో స్తోత్రాన్ని పఠించాలి (జపించాలి). ఈ \"సౌందర్య లహరి\" స్తోత్రానికి\n" +
                "\n" +
                "ఋషి - గోవిందః\n" +
                "ఛందస్సు - అనుష్టుప్\n" +
                "దేవత - శ్రీ మహాత్రిపుర సుందరి\n" +
                "బీజం - \"శివః శక్త్యా యుక్తః\"\n" +
                "శక్తి - \"సుధా సింధోర్మధ్యే\"\n" +
                "కీలకం - \"జపో జల్పః శిల్పం\"\n" +
                "అర్ధము - భగవత్యారాధన\n" +
                "వినియోగము - శ్రీ లలితా మహా త్రిపురసుందరీ ప్రసాద సిద్ధి కోసము ";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
