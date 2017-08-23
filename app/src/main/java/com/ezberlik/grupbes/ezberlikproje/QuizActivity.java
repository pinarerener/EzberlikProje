package com.ezberlik.grupbes.ezberlikproje;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {



    ArrayList<Word> questions,quizQuestions;
    Word tmp;
    int mScore=0,sayi=0;
    Intent intent;

    Button answer1, answer2, answer3, answer4;
    TextView score, question;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        generateQuestions();
        answer1= (Button) findViewById(R.id.answer1);
        answer2= (Button) findViewById(R.id.answer2);
        answer3= (Button) findViewById(R.id.answer3);
        answer4= (Button) findViewById(R.id.answer4);

        score= (TextView) findViewById(R.id.score);
        question= (TextView) findViewById(R.id.question);

        pickQuestions();

        newQuestion(sayi);

        intent= new Intent(this,ResultActivity.class);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answer1.getText().equals(tmp.getMeaning())){
                    intent.putExtra("level",tmp.getLevel());
                    startActivity(intent);
                }
                else {
                    sayi++;
                    newQuestion(sayi);
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answer2.getText().equals(tmp.getMeaning())){
                    intent.putExtra("level",tmp.getLevel());
                    startActivity(intent);
                    Log.d("burda","2.cevap");
                }
                else {
                    sayi++;
                    newQuestion(sayi);
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answer3.getText().equals(tmp.getMeaning())){
                    intent.putExtra("level",tmp.getLevel());
                    startActivity(intent);
                    Log.d("burda","3.cevap");
                }
                else {
                    sayi++;
                    newQuestion(sayi);
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answer4.getText().equals(tmp.getMeaning())){
                    intent.putExtra("level",tmp.getLevel());
                    startActivity(intent);
                    Log.d("burda","3.cevap");
                }
                else {
                    sayi++;
                    newQuestion(sayi);
                }
            }
        });

    }

    public void newQuestion(int i)
    {
        tmp = quizQuestions.get(i);
        question.setText(tmp.getWord());

        String[] answers = tmp.getOtherAnswers();
        answer1.setText(answers[0]);
        answer2.setText(answers[1]);
        answer3.setText(answers[2]);
        answer4.setText(answers[3]);
    }

    public void generateQuestions()
    {
        Log.d("burda","generate");
        questions = new ArrayList<>();

        Word w = new Word("Window","Pencere",new String[]{"Kapı","Pencere","Mutfak","Ev"},1);
        Word w1= new Word("Kitap", "Book", new String[] {"Pencil","Duster","Eraser","Book"},1);
        Word w2= new Word("The moon is....cold", "Always", new String[] {"Often","Usually","Never","Always"},2);
        Word w3= new Word("Tehlikeli", "Dangerous", new String[] {"Easy","Fork","Frosty","Dangerous"},2);
        Word w4= new Word("Speech", "Konuşma", new String[] {"Döndürmek","Getirmek","umut","Konuşma"},3);
        Word w5= new Word("Constantly", "Sürekli", new String[] {"Yavaşça","Hızlıca","Sakince","Sürekli"},3);
        Word w6= new Word("Devasa", "Enormous", new String[] {"Horrible","Mad","Helmet","Enormous"},4);
        Word w7= new Word("Yaklaşık olarak", "approximately", new String[] {"partly","unfriendly","definitely","approximately"},4);
        Word w8= new Word("Tepe noktası", "Pinnacle", new String[] {"Gallant","Eloquent","Amplitude","Pinnacle"},5);
        Word w9= new Word("Breach", "İhlal etmek", new String[] {"Kabul etmek","Katletmek","Pes etmek","İhlal etmek"},5);
        Word w10= new Word("Bewilder", "Şaşırtmak", new String[] {"Soğutmak","Ayırmak","Kovulmak","Şaşırtmak"},6);
        Word w11= new Word("Samimi", "Candid", new String[] {"Drastic","Avert","Erratic","Candid"},6);

        questions.add(w);
        questions.add(w1);
        questions.add(w2);
        questions.add(w3);
        questions.add(w4);
        questions.add(w5);
        questions.add(w6);
        questions.add(w7);
        questions.add(w8);
        questions.add(w9);
        questions.add(w10);
        questions.add(w11);

    }

    //test
    public void pickQuestions()
    {
        quizQuestions = new ArrayList<>();
        int q1quota=0,q2quota=0,q3quota=0,q4quota=0,q5quota=0,q6quota=0;

        ArrayList<Word> level1= new ArrayList<>();
        ArrayList<Word> level2= new ArrayList<>();
        ArrayList<Word> level3= new ArrayList<>();
        ArrayList<Word> level4= new ArrayList<>();
        ArrayList<Word> level5= new ArrayList<>();
        ArrayList<Word> level6= new ArrayList<>();

        for(int i=0;i<questions.size();i++)
        {
            if(questions.get(i).getLevel()==1)
                level1.add(questions.get(i));
            else if(questions.get(i).getLevel()==2)
                level2.add(questions.get(i));
            else if(questions.get(i).getLevel()==3)
                level3.add(questions.get(i));
            else if(questions.get(i).getLevel()==4)
                level4.add(questions.get(i));
            else if(questions.get(i).getLevel()==5)
                level5.add(questions.get(i));
            else if(questions.get(i).getLevel()==6)
                level6.add(questions.get(i));
        }

        while(q1quota!=2)
        {
            int count=(int)(Math.random()*level1.size());
            if (!quizQuestions.contains(level1.get(count))) {
                quizQuestions.add(level1.get(count));
                q1quota++;
            }
        }
        while(q2quota!=2) {
            int count = (int) (Math.random() * level2.size());
            if (!quizQuestions.contains(level2.get(count))) {
                quizQuestions.add(level2.get(count));
                q2quota++;
            }
        }
        while(q3quota!=2)
        {
            int count=(int)(Math.random()*level3.size());
            if(!quizQuestions.contains(level3.get(count))) {
                quizQuestions.add(level3.get(count));
                q3quota++;
            }
        }
        while(q4quota!=2)
        {
            int count=(int)(Math.random()*level4.size());
            if(!quizQuestions.contains(level4.get(count))){
                quizQuestions.add(level4.get(count));
                q4quota++;
            }
        }
        while(q5quota!=2)
        {
            int count=(int)(Math.random()*level5.size());
            if(!quizQuestions.contains(level5.get(count))){
                quizQuestions.add(level5.get(count));
                q5quota++;
            }
        }
        while(q6quota!=2)
        {
            int count=(int)(Math.random()*level6.size());
            if(!quizQuestions.contains(level6.get(count))){
                quizQuestions.add(level6.get(count));
                q6quota++;
            }
        }
    }
}
