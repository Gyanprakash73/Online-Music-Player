package com.gyan.onlinemusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url1="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/AUD-20180625-WA0067.mp3?alt=media&token=7d80a706-afec-44e4-a8ea-50fcbd5ca8ce";
        String url2="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Aaj_Raat_Ka_Scene_Banale_-_Badshah___Jazbaa___Shraddha_Pandit___Diksha___Jaanu.mp3?alt=media&token=a794261b-baed-45c6-b402-31a83f961ead";
        String url3="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Abhi%20mohabbat%20ka-hamra.MP3?alt=media&token=cb91727d-72d8-40ab-b7b8-2396b3f80770";
        String url4="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Abhi_Toh_Party_Shuru_Hui_Hai__dj_shiva_remix.mp3?alt=media&token=9d209442-6a46-4759-9ba1-6edb31d5d8cc";
        String url5="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Chanda%20sitare%20poonam%20ke.MP3?alt=media&token=11c7b380-d61c-4b82-92e4-4ca7ce5b164b";
        String url6="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Dhekhne%20wale%20ne-chori2%20chupke2.MP3?alt=media&token=56041c67-a2e4-4ce6-8bd7-a7c39e770259";
        String url7="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Dil%20mein%20dard%20sa%20jaga%20hei-kranti.MP3?alt=media&token=0db392ea-78fd-42a8-adef-9d1874598d92";
        String url8="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Dilbar%20Dilbar-Sirf%20tum.mp3?alt=media&token=32ad29bf-edfa-46d4-a274-fbd64147713f";
        String url9="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Ding_Dang_-_Video_Song___Munna_Michael___Tiger_Shroff___Nidhhi_Agerwal___250__Mi.mp3?alt=media&token=65f8f616-47ba-4f9d-a7e0-a0b40cf9c2f6";
        String url10="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Ghar%20aaja%20pardeshi%20tera-DDLJ.MP3?alt=media&token=8a629529-0ea1-4854-b21b-3004b95e7415";
        String url11="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Gore%20Gore%20Mukhde%20Pe-Suhaag.mp3?alt=media&token=6138e46d-cf53-40ca-8b46-ffe064c35f3a";
        String url12="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Hero_No._1_Hindi_Movie____Sona_Kitna_Video_Song____Govinda%2C_Karisma_Kapoor____Ea.mp3?alt=media&token=af79e521-d131-4297-a0e0-59cf0211cd24";
        String url13="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Heropanti_-_Whistle_Baja_Video_Song_With_Lyrics___Tiger_Shroff%2C_Kriti_Sanon.mp3?alt=media&token=30eb9eb0-1147-4921-bdfb-16411c9f25d5";
        String url14="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Hindi_gan.mp3?alt=media&token=7024a62f-9bce-4ab1-9d5f-7b714a162d50";
        String url15="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Hookah_Bar_Song_Khiladi_786___Akshay_Kumar___Asin.mp3?alt=media&token=7aedbc51-8f58-4eff-8a78-b08ee6571229";
        String url16="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/Hum_Tum_Ko_Nigahon_Mein___Garv__Hindi_Old_Song_HD_video___Shimul_Khan.mp3?alt=media&token=d42eb7db-45a9-4efc-89ef-6d5a385281c6";
        String url17="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/_Dhol_Baaje__Video_Song___Sunny_Leone___Meet_Bros_Anjjan_ft._Monali_Thakur__Ek_P.mp3?alt=media&token=9c0d7218-cbdb-4342-b614-ad820acd169a";
        String url18="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/aayega%20maza%20ab%20barsaat%20ka-andaaz%20.mp3?alt=media&token=3089153c-0bdc-4ede-9f5f-a33f8ec4d197";
        String url19="https://firebasestorage.googleapis.com/v0/b/online-music-player-3b518.appspot.com/o/dil%20se%20dilbar%20.mp3?alt=media&token=acfe57bd-227f-41ea-b760-f9572f7b83fd";


        JcPlayerView jcPlayerView=findViewById(R.id.jcplayer);

        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("AUD-20180625-WA0067.mp3",url1));
        jcAudios.add(JcAudio.createFromURL("Aaj_Raat_Ka_Scene_Banale",url2));
        jcAudios.add(JcAudio.createFromURL("Abhi mohabbat ka-hamra",url3));
        jcAudios.add(JcAudio.createFromURL("Abhi_Toh_Party_Shuru_Hui_Hai",url4));
        jcAudios.add(JcAudio.createFromURL("Chanda sitare poonam ke",url5));
        jcAudios.add(JcAudio.createFromURL("Dhekhne wale ne-chori2 chupke2",url6));
        jcAudios.add(JcAudio.createFromURL("Dil mein dard sa jaga hei-kranti",url7));
        jcAudios.add(JcAudio.createFromURL("Dilbar Dilbar-Sirf tum",url8));
        jcAudios.add(JcAudio.createFromURL("Ding_Dang_-_Video_Song",url9));
        jcAudios.add(JcAudio.createFromURL("Ghar aaja pardeshi tera-DDLJ",url10));
        jcAudios.add(JcAudio.createFromURL("Gore Gore Mukhde Pe-Suhaag",url11));
        jcAudios.add(JcAudio.createFromURL("Hero_No._1",url12));
        jcAudios.add(JcAudio.createFromURL("Heropanti_-_Whistle_Baja",url13));
        jcAudios.add(JcAudio.createFromURL("Hindi_gan",url14));
        jcAudios.add(JcAudio.createFromURL("Hookah_Bar_Song",url15));
        jcAudios.add(JcAudio.createFromURL("Hum_Tum_Ko_Nigahon_Mein_basa_lenge",url16));
        jcAudios.add(JcAudio.createFromURL("Dhol_Baaje__Video_Song",url17));
        jcAudios.add(JcAudio.createFromURL("aayega maza ab barsaat ka",url18));
        jcAudios.add(JcAudio.createFromURL("dil se dilbar",url19));


        jcPlayerView.initPlaylist(jcAudios, null);

        jcPlayerView.createNotification(); // default icon

    }
}
